package com.nudt.producer.controller;

import com.nudt.producer.service.RemoteProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by haibozhang on 2018/12/5.
 */
@RestController
public class ConsumerController {

    @Autowired
    RemoteProducer remoteProducer;

    @GetMapping("/consumer")
    public String consumer(){
        return "consumer => " + remoteProducer.producer();
    }

}
