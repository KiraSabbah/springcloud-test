package priv.kira.springcloudtest.springboottest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import priv.kira.springcloudtest.springboottest.jpatest.entity.DemoTest;
import priv.kira.springcloudtest.springboottest.jpatest.service.DemoTestService;

@Slf4j
@RestController
@RequestMapping("/jpatest")
public class JpaTestController {

    @Autowired
    private DemoTestService demoTestService;

    @GetMapping("/getbyid")
    public DemoTest getbyid(@RequestParam("id")Long id){
        return demoTestService.getById(id);
    }

}
