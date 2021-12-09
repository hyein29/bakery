package com.bakery.controller;

import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import com.bakery.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private MemberService memberService;

    // 회원가입
    @GetMapping("/register")
    public String register() {
        return "/account/register";
    }

    @PostMapping("/register")
    public String register(Member member) {
        memberService.save(member);
        return "redirect:/";
    }

    // 로그인
    @GetMapping("/login")
    public String login() {
        return "/account/login";
    }

//    @PostMapping("/login")
//    public String login(Member member) {
//        return "/account/login";
//    }

}
