package priv.kira.springcloudtest.springboottest.configtest;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ConfigV3 {
    private String name;
    private Integer len;
    private List<String> strlist;
}
