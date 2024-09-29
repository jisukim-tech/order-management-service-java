package com.study.order_management_service;

import com.study.order_management_service.discount.FixedDiscountPolicy;
import com.study.order_management_service.discount.RateDiscountPolicy;
import com.study.order_management_service.member.MemberService;
import com.study.order_management_service.member.MemberServiceImpl;
import com.study.order_management_service.member.MemoryMemberRepository;
import com.study.order_management_service.order.OrderService;
import com.study.order_management_service.order.OrderServiceImpl;

public class AppConfig {
    public MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    public OrderService orderService() {
        return new OrderServiceImpl(new FixedDiscountPolicy(),
                                    new MemoryMemberRepository());
    }
}
