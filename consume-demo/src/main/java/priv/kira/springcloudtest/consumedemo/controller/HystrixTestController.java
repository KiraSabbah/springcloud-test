package priv.kira.springcloudtest.consumedemo.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/consume/hystrix")
@DefaultProperties(defaultFallback = "circuitbreakserDefault")
public class HystrixTestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @HystrixCommand(fallbackMethod = "circuitbreakserTest")
    @GetMapping("/breaktest1")
    public String breaktest1() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok test";
    }

    @HystrixCommand(
            fallbackMethod = "circuitbreakserTest",
            commandProperties = {
                    @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "2500")
            }
    )
    @GetMapping("/breaktest2")
    public String breaktest2() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok test";
    }

    @HystrixCommand
    @GetMapping("/breaktest3")
    public String breaktest3() {
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "ok test";
    }

    public String circuitbreakserTest() {
        return "circuitbreakser test";
    }

    public String circuitbreakserDefault() {
        return "circuitbreakser Default";
    }
}
