package priv.kira.springcloudtest.springboottest.lomboktest;

import lombok.Data;

import java.util.Date;

@Data
public class DataTest {
    private String name;
    private String title;
    private Date adddate;
}
