package com.gw.springcloud.config;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * gaowei
 * 2020-04-13 16:20
 */
@Configuration
public class ApplicationContextConfig {
    @Bean
    //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    //@LoadBalanced //注掉是为了测试自己写的负载均衡算法
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
