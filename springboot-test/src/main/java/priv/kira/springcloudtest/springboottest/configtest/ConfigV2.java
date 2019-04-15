package priv.kira.springcloudtest.springboottest.configtest;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Getter
@Setter
@Component//这里使用@Component或者在配置Bean处使用@EnableConfigurationProperties来声明导入
@ConfigurationProperties(prefix = "configtest.v2")
public class ConfigV2 {
    private String name;
    private Integer len;
    private List<String> strlist;
}
