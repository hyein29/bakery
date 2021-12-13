package com.bakery.controller;

import com.bakery.dto.MemberDTO;
import com.bakery.entity.Grade;
import com.bakery.entity.Member;
import com.bakery.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

    // 회원가입 페이지
    @GetMapping("/register")
    public String register() {
        return "/member/register";
    }

    // 회원가입 처리
    @PostMapping("/register")
    public String register(@ModelAttribute MemberDTO dto, HttpServletResponse response) {
        memberService.save(dto);
        return "redirect:/";
    }

    // 로그인 페이지
    @GetMapping("/login")
    public String login() {
        return "/member/login";
    }

    // 로그인 처리
    @PostMapping("/login")
    public String login(Member member) {
        return "/member/login";
    }

//    // 로그인 결과 페이지
//    @GetMapping("/login/result")
//    public String dispLoginResult() {
//        return "/loginSuccess";
//    }
//
//    // 로그아웃 결과 페이지
//    @GetMapping("/logout/result")
//    public String dispLogout() {
//        return "/logout";
//    }
//
//    // 접근 거부 페이지
//    @GetMapping("/denied")
//    public String dispDenied() {
//        return "/denied";
//    }
//
//    // 내 정보 페이지
//    @GetMapping("/info")
//    public String dispMyInfo() {
//        return "/myinfo";
//    }
//
//    // 어드민 페이지
//    @GetMapping("/admin")
//    public String dispAdmin() {
//        return "/admin";
//    }




}
