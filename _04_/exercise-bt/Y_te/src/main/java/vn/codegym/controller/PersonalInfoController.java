package vn.codegym.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import vn.codegym.model.bean.PersonalInformation;
import vn.codegym.model.service.ISer;


import java.util.List;

@Controller
public class PersonalInfoController {

    PersonalInformation personalInformation = new PersonalInformation();


    @Autowired
    ISer iSer;



    @GetMapping("/detail")
    public String detail(Model model) {
        model.addAttribute("personalInformation", iSer.edit(personalInformation));
        return "detail";
    }


    @GetMapping("/")
    public String showForm(Model model) {
        List<String> genderList = iSer.gender();

        List<String> nationList = iSer.nationality();

        model.addAttribute("genderList", genderList);
        model.addAttribute("nationList", nationList);
        model.addAttribute("personalInformation", iSer.edit(personalInformation));

        return "form";
    }

    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String editForm(@ModelAttribute("personalInformation") PersonalInformation newPersonalInformation,
                           RedirectAttributes redirectAttributes) {
        personalInformation = iSer.edit(newPersonalInformation);
        ModelAndView modelAndView = new ModelAndView();
        redirectAttributes.addFlashAttribute("message", "Success");
        modelAndView.addObject("newPersonalInformation", personalInformation);

        return "redirect:/detail";
    }
}
