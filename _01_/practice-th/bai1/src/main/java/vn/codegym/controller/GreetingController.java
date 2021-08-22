package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {

//    @GetMapping("/greeting")
//    để như trên thì khi vào ứng dụng ta phải bấm /greeting

//    còn chỉ để "" nó sẽ hiệu là gọi đến phương thức public String greeting()
    @GetMapping("")
    //c 1:

    public String greeting() {
        return "index";
    }
    //c 2:
//    public String greeting(@RequestParam String name, Model model) {
//        model.addAttribute ("name",name);
//        return "index";
//    }
}
