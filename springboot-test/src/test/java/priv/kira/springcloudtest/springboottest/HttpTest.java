package priv.kira.springcloudtest.springboottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HttpTest {

    @Autowired
    private RestTemplate restTemplate;

    @Test
    public void httpGet(){
        System.out.println(restTemplate.getForObject("http://www.baidu.com",String.class));
    }

}
