package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import vn.codegym.model.service.IService;

@Controller
public class ConvertController {
    @Autowired
    private IService iService;

    @RequestMapping(value = "/")
    public String convert() {
        return "index";
    }


    @RequestMapping(value = "/converter", method = RequestMethod.POST)
    public ModelAndView convertCurrency(@RequestParam("usa") double usa,
                                        @RequestParam("rate") double rate,
                                        ModelAndView modelAndView) {
        double vnd=iService.convert(usa,rate);

        modelAndView.addObject("usa",usa);
        modelAndView.addObject("rate",rate);
        modelAndView.addObject("vnd",vnd);
        modelAndView.setViewName("index");

        return modelAndView;

    }
}
