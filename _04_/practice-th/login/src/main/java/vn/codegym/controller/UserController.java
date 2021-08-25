package vn.codegym.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.bean.Login;
import vn.codegym.model.bean.User;
import vn.codegym.model.service.ISer;


@Controller
public class UserController {

   @Autowired
    ISer iSer;
    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("login", new Login());
        return "home";
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = iSer.checkLogin(login);
        if (user == null){
            ModelAndView modelAndView = new ModelAndView("/eror");
            return modelAndView;
        } else {
            ModelAndView modelAndView = new ModelAndView("/user");
            modelAndView.addObject("user", user);
            return modelAndView;
        }
    }


}