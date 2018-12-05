package com.nudt.producer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by haibozhang on 2018/12/5.
 */
@FeignClient("producer")
@Service
public interface RemoteProducer {

    @GetMapping("/producer")
    public String producer();

}
