package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.bean.Product;
import vn.codegym.model.service.IProductService;
import org.springframework.ui.ModelMap;

import java.util.List;


@Controller
public class ProductController {
    @Autowired
    IProductService iProductService;

    //     private static Map<Integer,Product> products=new HashMap<>();
    //       Product product=new Product();

//    private static Map<Integer,Product> products;
//    static {
//        products=new HashMap<>();
//        products.put(1,new Product(1,"giay",35,"tot","danang"));
//        products.put(2,new Product(2,"dep",10,"rat tot","hanoi"));
//    }

//    public List<Product> findAll() {
//        return new ArrayList<>(products.values());
//    }
    @GetMapping("/")
     public ModelAndView home() {
        return new ModelAndView("list","ListProduct",iProductService.findAll());
    }

//  tại sao ko chạy dc ?????? nhớ hỏi lĩnh lại

//    @GetMapping("/create")
//    public String showCreate(ModelAndView modelAndView) {
//        modelAndView.addObject("product",new Product());
//        return "create";
//    }

        @GetMapping("/create")
    public ModelAndView showCreateForm(Model model){
        //gửi 1 đối tượng rỗng cho người dùng thêm
        model.addAttribute("product",new Product());
        return new ModelAndView("create","product",new Product());
    }

    //    @GetMapping("/create")
//    public ModelAndView showCreateForm(Model model){
//        //gửi 1 đối tượng rỗng cho người dùng thêm
//        model.addAttribute("newProduct",new Product());
//        return new ModelAndView("create","newProduct",new Product());
//
//    }




    //    @Override
//    public void save(Product product) {
//        products.put(product.getId(),product);
//
//    }

//    @PostMapping("/save")
//    public String save(Product product) {
//        iProductService.save(product);
//        return "redirect:/";
//    }


//    @PostMapping(value = "/save")
//    public ModelAndView createProduct(@ModelAttribute Product newProduct){
//        iProductService.save(newProduct);
//        return new ModelAndView("redirect:/");
//    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirect) {
        product.setId((int)(Math.random() * 10000));
        iProductService.save(product);
        redirect.addFlashAttribute("success", "Saved product successfully!");
        return "redirect:/";
    }



    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable int id, Model model) {
        model.addAttribute("product",iProductService.findById(id));
        return "edit";
    }


//    @Override
//    public void update(int id, Product product) {
//        products.put(id,product);
//    }

    @PostMapping("/update")
    public String updateProduct(Product product, RedirectAttributes attributes) {
        iProductService.update(product.getId(),product);
        attributes.addFlashAttribute("success", "  updated successfully!");
        return "redirect:/";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/delete";
    }

    @PostMapping("/delete")
    public String delete(Product product, RedirectAttributes redirect) {
        iProductService.remove(product.getId());
        redirect.addFlashAttribute("success", "Removed  successfully!");
        return "redirect:/";
    }


    @GetMapping("/view/{id}")
    public String view(@PathVariable int id, Model model) {
        model.addAttribute("product", iProductService.findById(id));
        return "/view";
    }


//    @RequestMapping(value = "/search", method = RequestMethod.POST)
//    public String searchByName(@RequestParam("productName") String productName, Model model) {
//        List<Product> product = iProductService.searchByName(productName);
//        model.addAttribute("product", product);
//        model.addAttribute("Message", "Found " + product.size() + " record(s)");
//
//        return "search";
//    }



    @PostMapping("/search")
    public ModelAndView search(ModelAndView modelAndView, String name ) {
        modelAndView.addObject("products",iProductService.finByName(name));
        modelAndView.setViewName("search");
        return modelAndView;
    }




























}
