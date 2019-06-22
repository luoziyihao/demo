package com.luoziyihao.demo.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiang.rao created on 3/4/18 11:12 PM
 * @version $Id$
 */
@RequestMapping("/health")
@RestController
public class HealthController {


    @RequestMapping("/test")
    public Object test() {
        return "SUCCESS";
    }

}
