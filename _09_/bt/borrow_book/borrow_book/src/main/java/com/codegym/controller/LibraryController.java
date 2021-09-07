package com.codegym.controller;

import com.codegym.model.entity.Book;
import com.codegym.model.entity.CodeBook;
import com.codegym.model.service.IBookService;
import com.codegym.model.service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping(value = "/book")
public class LibraryController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private ICodeBookService customerCodeService;

    @GetMapping("/list")
    public String list(Model model){
        List<Book> bookList = bookService.findAll();
        model.addAttribute("bookList", bookList);
        return "list";
    }


    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model)  {
        Book book = bookService.findById(id);
        if (book.getQuantity() == 0){
          return "out_of_stock";
        }else {
            model.addAttribute("book", book);
            return "borrow";
        }
    }

    @PostMapping("/borrow")
    public String borrowBook(@ModelAttribute Book book, Model model) {
        book.setQuantity(book.getQuantity() - 1);
        bookService.save(book);
        int randomCode = (int) Math.floor(((Math.random() * 12345) + 10000));
        String rentCode = String.valueOf(randomCode);
        model.addAttribute("bookCode",rentCode);
        CodeBook customerCode = new CodeBook();
        customerCode.setCodeForBook(rentCode);
        customerCode.setBook(book);
        customerCodeService.save(customerCode);
        return "redirect:/book/list";
    }

    @GetMapping("/give")
    public ModelAndView showGiveBook() {
        return new ModelAndView("give_book","bookCode",new CodeBook());
    }

    @PostMapping("/give")
    public String giveBook(CodeBook customerCode, Model model)  {
        CodeBook rentCode = customerCodeService.findByCode(customerCode.getCodeForBook());
        if (rentCode == null) {
            return "wrong_code";
        }

        Book book = rentCode.getBook();
        Integer quantity = book.getQuantity();
        book.setQuantity(quantity + 1);
        bookService.save(book);

        customerCodeService.delete(rentCode.getId());
        model.addAttribute("message","Return book success");
        return "redirect:/book/list";
    }


}