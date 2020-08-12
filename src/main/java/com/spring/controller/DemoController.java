package com.spring.controller;

import com.spring.config.ConfigHelperDemo;
import com.yuantu.web.DeviceInvokeService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author WeiMin
 * @desc
 * @date 2020/7/31
 */
@Controller
@RequestMapping("demo")
@DubboComponentScan("com.spring.controller")
public class DemoController {

    @Reference
    private DeviceInvokeService deviceInvokeService;
    @Autowired
    private ConfigHelperDemo configHelperDemo;

    @RequestMapping("test")
    public String test() {
        System.out.println(configHelperDemo.getEnv());
        return deviceInvokeService.test();
    }

}
