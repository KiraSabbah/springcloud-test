package priv.kira.springcloudtest.springboottest.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.kira.springcloudtest.springboottest.lomboktest.BuilderTest;
import priv.kira.springcloudtest.springboottest.lomboktest.DataTest;

import java.util.Date;

@Slf4j
@RestController
@RequestMapping("/lomboktest")
public class LombokTestController {


    @GetMapping("/log")
    public String log(){
        log.debug("-------debug");
        log.info("-------info");
        log.warn("-------warn");
        log.error("-------error");
        return "log";
    }

    @GetMapping("/data")
    public Object data(){
        DataTest dt=new DataTest();
        dt.setName("@Data 测试");
        dt.setTitle("data test");
        dt.setAdddate(new Date());
        log.info(dt.toString());
        return dt;
    }

    @GetMapping("/builder")
    public Object builder(){
        BuilderTest bt= BuilderTest.builder()
                .adddate(new Date())
                .name("@Builder 测试")
                .title("builder test")
                .build();
        log.info(bt.toString());
        return bt;
    }

}
