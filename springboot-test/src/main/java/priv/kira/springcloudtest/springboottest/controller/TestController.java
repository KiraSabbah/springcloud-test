package priv.kira.springcloudtest.springboottest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.kira.springcloudtest.springboottest.configtest.ConfigV1;
import priv.kira.springcloudtest.springboottest.configtest.ConfigV2;
import priv.kira.springcloudtest.springboottest.configtest.ConfigV3;

//@Controller
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private ConfigV1 configV1;

    @Autowired
    private ConfigV2 configV2;

    @Autowired
    private ConfigV3 configV3;

    @GetMapping("/hello")
    public String hello(){
        return "Hello";
    }

    @GetMapping("/configv1")
    public Object cinfigv1(){
        return configV1;
    }

    @GetMapping("/configv2")
    public Object configv2(){
        return configV2;
    }

    @GetMapping("/configv3")
    public Object configv3(){
        return configV3;
    }
}
