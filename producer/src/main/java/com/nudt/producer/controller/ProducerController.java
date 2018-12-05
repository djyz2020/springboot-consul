package com.nudt.producer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by haibozhang on 2018/12/5.
 */
@RestController
public class ProducerController {

    @GetMapping("/producer")
    public String producer(){
        return "consul-producer first demo";
    }
}
