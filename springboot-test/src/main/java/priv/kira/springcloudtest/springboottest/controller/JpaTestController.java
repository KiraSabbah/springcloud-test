package priv.kira.springcloudtest.springboottest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import priv.kira.springcloudtest.springboottest.jpatest.entity.DemoTest;
import priv.kira.springcloudtest.springboottest.jpatest.service.DemoTestService;

import java.util.List;

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

    @GetMapping("/transactiontest")
    public List<DemoTest> transactiontest(){
        return demoTestService.transactiontest();
    }

    @GetMapping("/transactiontest2")
    public DemoTest transactiontest2(){
        return demoTestService.transactiontest2();
    }
}
