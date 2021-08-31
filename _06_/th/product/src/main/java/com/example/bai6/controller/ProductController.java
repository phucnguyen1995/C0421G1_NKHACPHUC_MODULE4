package com.example.bai6.controller;

import com.example.bai6.model.bean.Product;
import com.example.bai6.model.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//@RequestMapping("")
public class ProductController {

    @Autowired
    private IProductService iProductService;

    @GetMapping("/")
    public ModelAndView showList() {
        return new ModelAndView("list","List",iProductService.findAll());
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String save(Product product) {
        iProductService.save(product);
        return "redirect:/";
//        return "redirect:/";
//        return "redirect:product";
    }


//  ko ghi gi o controller cho showList
//  là dấu " " thì khi ta lưu sản phẩm ta có 2 cách đúng :   return "redirect:"; và   return "redirect:/";


//    nếu chỗ controller ta ghi ({"","product"})       thì khi ta lưu  return "redirect:product/";
//    và   return "redirect:product"; vẫn đúng
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        iProductService.delete(id);
        return "redirect:/";
//        lôi duong link 404
    }

    @GetMapping("/search")
    public ModelAndView searchName(@RequestParam String name) {
        return new ModelAndView("list","List",iProductService.findByName(name));
    }


//     @GetMapping("/view/{id}")
//     public ModelAndView viewProduct(@PathVariable int id) {
//         return new ModelAndView("view","product",iProductService.viewProduct(id));
//     }

// cách 1
    @GetMapping("/view/{id}")
    public String viewProduct(@PathVariable int id,Model model){
        Product product=iProductService.viewProduct(id).get();
        model.addAttribute("product", product);
        return "view";
    }

//    cách 2
//    @GetMapping("/view/{id}")
//    public String viewProduct(@PathVariable int id,Model model){
//        model.addAttribute("product",iProductService.viewP(id));
//        return "view";
//    }

}
