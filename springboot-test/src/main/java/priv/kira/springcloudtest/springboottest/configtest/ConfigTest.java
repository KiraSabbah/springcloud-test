package priv.kira.springcloudtest.springboottest.configtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class ConfigTest {

    @Bean
    public ConfigV1 configV1() {
        ConfigV1 configV1 = new ConfigV1();
        configV1.setName("代码写死");
        configV1.setLen(123);
        configV1.setStrlist(Arrays.asList("jorn", "lyli", "necy"));
        return configV1;
    }

    @Autowired
    private ConfigV2 configV2;

    @Bean
    @ConfigurationProperties(prefix = "configtest.v3")
    public ConfigV3 configV3() {
        return new ConfigV3();
    }
}
