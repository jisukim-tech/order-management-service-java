package com.study.order_management_service;

import com.study.order_management_service.member.MemberService;
import com.study.order_management_service.member.MemberServiceImpl;
import com.study.order_management_service.member.MemoryMemberRepository;

public class AppConfig {
    MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }
}
