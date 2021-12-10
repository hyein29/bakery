package com.bakery.controller;

import com.bakery.dto.TestMemberDTO;
import com.bakery.service.TestMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @Autowired
    TestMemberService testMemberService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }

    @PostMapping("/test")
    public String testP(TestMemberDTO dto) {
        System.out.println(dto);
        testMemberService.register(dto);
        return "redirect:/";
    }

}
