package priv.kira.springcloudtest.consumedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/consume/eurekaclient")
public class EurekaTestController {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping("/userserviceinfo")
    public List<ServiceInstance> userserviceinfo(){
        List<ServiceInstance> list = discoveryClient.getInstances("user-service");
        return list;
    }

    @RequestMapping("/userinfo/{id}")
    public String getuserinfo(@PathVariable("id") Long id){
        List<ServiceInstance> list = discoveryClient.getInstances("user-service");
        ServiceInstance serviceInstance=list.get(0);
        //String url="http://"+serviceInstance.getHost()+":"+serviceInstance.getPort()+"/user/"+id;
        return restTemplate.getForObject(serviceInstance.getUri()+"/user/"+id,String.class);
    }
}
