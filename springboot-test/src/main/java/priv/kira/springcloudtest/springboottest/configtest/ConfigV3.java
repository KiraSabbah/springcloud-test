package priv.kira.springcloudtest.springboottest.configtest;

import lombok.Data;

import java.util.List;

@Data
public class ConfigV3 {
    private String name;
    private Integer len;
    private List<String> strlist;
}
