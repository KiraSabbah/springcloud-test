package priv.kira.springcloudtest.springboottest.jpatest.entity;

import lombok.Data;

import java.util.Date;

@Data
public class DemoTest {

    private Long id;
    private String name;
    private Boolean active;
    private Date createDatetime;
    private Date modifyDatetime;

}
