package com.csdj.controller.lx;

import com.csdj.pojo.housetype;
import com.csdj.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.expression.Lists;

import java.util.List;

@Controller
public class GetControll {
    @Autowired
    private testService service;

    @RequestMapping("/getlist")
    public String getlist(Model model)
    {
        model.addAttribute("lists",service.gettest());
        return "list";
    }

    @RequestMapping("getcustomsms")
    public String getcustomsms()
    {
        return "customsms";
    }
    @RequestMapping("gettexted")
    public String gettexted()
    {
        return "texted";
    }
    @RequestMapping("getopentheultrasoundimage")
    public String getopentheultrasoundimage()
    {
        return "opentheultrasoundimage";
    }
    @RequestMapping("getbasicfiles")
    public String getbasicfiles()
    {
        return "basicfiles";
    }
}