package com.codegym.controller;

import com.codegym.dto.UserDto;
import com.codegym.model.entity.User;
import com.codegym.model.service.IUserService;

//?????????
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class UserController {
//    @Autowired
//    IUserService iUserService;


    @Autowired
    private IUserService iUserService;

    @GetMapping("/user")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("/form");
        modelAndView.addObject("userDto", new UserDto());
        return modelAndView;
    }

//    @PostMapping("/validateUser")
//    public ModelAndView checkValidation( @ModelAttribute @Validated UserDto userDto,BindingResult bindingResult) {
//
//        if (bindingResult.hasFieldErrors()) {
//            return new ModelAndView("/form", "userDto", userDto);
//        }
////        User user = new User();
////        đề cho sai user import
//        User user=new User();
//
//        BeanUtils.copyProperties(userDto, user);
//        iUserService.save(user);
//        return new ModelAndView("/result", "user" , user);
//
//    }


    @PostMapping("/validateUser")
    public String checkValidation(
//                                       @Validated
            @Valid
            @ModelAttribute

                    UserDto userDto,BindingResult bindingResult,Model model) {

        if (bindingResult.hasFieldErrors()) {
            return "/form";
        }
//        User user = new User();
//        đề cho sai user import
        User user=new User();

        BeanUtils.copyProperties(userDto, user);
        iUserService.save(user);

        model.addAttribute("user",user);
        return "/result";

    }










//    @PostMapping("/validateUser")
//    public String checkValidation(BindingResult bindingResult, @Validated @ModelAttribute UserDto userDto) {
//
//        if (bindingResult.hasFieldErrors()) {
//            return "/form";
//        }
//
//        else {
//            User user = new User();
//            BeanUtils.copyProperties(userDto, user);
//            iUserService.save(user);
//            return "/result";
//        }
//
//    }




}
