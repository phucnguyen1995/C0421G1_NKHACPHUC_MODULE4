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
    IService iService;
    @RequestMapping(value = "/")
    public String convert() {
        return "index";
    }


    @RequestMapping(value = "/converter", method = RequestMethod.POST)
    public ModelAndView convertCurrency(@RequestParam("world") String world,
                                        ModelAndView modelAndView) {

        String a=iService.dictionary(world);

        modelAndView.addObject("world",world);
        modelAndView.addObject("a",a);

        modelAndView.setViewName("index");

        return modelAndView;

    }
}
