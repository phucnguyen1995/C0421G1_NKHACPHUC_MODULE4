package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import vn.codegym.model.service.ISer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Controller
public class EmailController {
    @Autowired
    ISer iSer;

    @GetMapping("/")
    String getIndex() {
        return "index";
    }

    @PostMapping("/validate")
    String validateEmail(@RequestParam("a") String email, Model model) {
        boolean isValid = this.iSer.validate(email);
        if (!isValid) {
            model.addAttribute("message", "Email is invalid");
            return "index";
        }

        model.addAttribute("a", email);
        return "success";
    }



}
