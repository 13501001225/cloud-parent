package com.gw.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * gaowei
 * 2020-04-14 1:54
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentZkMain8004 {
    public static void main(String[] args){
        SpringApplication.run(PaymentZkMain8004.class,args);
    }
}
