package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.service.IService;

@Controller
public class CaculatorController {
    @Autowired
    private IService iService;

    @RequestMapping(value = "/")
    public String convert() {
        return "index";
    }


    @RequestMapping(value = "/caculator", method = RequestMethod.POST)
    public ModelAndView tinhToan(@RequestParam(required = false) double a,double b,char operator,
                                        ModelAndView modelAndView) {

        double c=iService.result(a,operator,b);

        modelAndView.addObject("a",a);
        modelAndView.addObject("b",b);
        modelAndView.addObject("result",c);
        modelAndView.setViewName("index");

        return modelAndView;

    }
}
