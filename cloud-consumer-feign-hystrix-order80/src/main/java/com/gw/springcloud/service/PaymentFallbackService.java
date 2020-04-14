package com.gw.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * gaowei
 * 2020-04-14 14:50
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------PaymentFallbackService fall back paymentInfo_OK";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------PaymentFallbackService fall back paymentInfo_TimeOut";
    }
}
