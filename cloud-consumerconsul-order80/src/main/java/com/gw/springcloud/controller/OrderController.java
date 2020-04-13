package com.gw.springcloud.controller;

import com.gw.springcloud.entities.CommonResult;
import com.gw.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * gaowei
 * 2020-04-13 16:15
 */
@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_UTL="http://cloud-provider-payment/";
    @Resource
    private RestTemplate restTemplate;
    @GetMapping("/consumer/payment/consul")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_UTL + "payment/consul", String.class);
    }
}
