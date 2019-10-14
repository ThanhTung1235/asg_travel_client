package com.travel.controller;

import member.Member;
import member.MemberService;
import member.MemberServiceImplServiceLocator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping(value = "/member")
@Controller
public class MemberController {

    private static final String MEMBERFORM = "member/create";
    private static final String MEMBERLIST = "member/list";

    @Autowired
    MemberService memberService;

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public String showForm(Model model) {
        model.addAttribute("member", new Member());
        return MEMBERFORM;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String getList(Model model) {
        try {
            Member[] members = memberService.getAll();
            model.addAttribute("members", members);
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
        return MEMBERLIST;
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String showForm(Member member) {
        try {

            String a = memberService.save(member);
            System.out.println(a);
        } catch (java.rmi.RemoteException ex) {
            ex.printStackTrace();
        }
        return "redirect:/member";
    }
}
