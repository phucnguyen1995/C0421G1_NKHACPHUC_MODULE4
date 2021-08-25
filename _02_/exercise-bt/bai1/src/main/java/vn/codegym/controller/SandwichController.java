package vn.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SandwichController {


    @RequestMapping(value = "/")
    public String menu() {
        return "index";
    }


    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public ModelAndView orderMeNu(@RequestParam(required = false) String[] order,
                                  ModelAndView modelAndView) {
//        required = false : ko yêu cầu tham sô
        modelAndView.addObject("result", order);
        //        c2
//        modelAndView.addObject("mess", "Nothing");
        modelAndView.setViewName("result");

        return modelAndView;

    }
}
