package com.gw.springcloud.service.impl;

import com.gw.springcloud.dao.PaymentDao;
import com.gw.springcloud.entities.Payment;
import com.gw.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * gaowei
 * 2020-04-13 15:15
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
