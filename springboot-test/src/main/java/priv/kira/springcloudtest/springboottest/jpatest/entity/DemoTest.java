package priv.kira.springcloudtest.springboottest.jpatest.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class DemoTest {

    private Long id;
    private String name;
    private Boolean active;
    private Date createDatetime;
    private Date modifyDatetime;

}
