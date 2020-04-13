package com.gw.springcloud.service;

import com.gw.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * gaowei
 * 2020-04-13 15:14
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(@Param("id") Long id);
}
