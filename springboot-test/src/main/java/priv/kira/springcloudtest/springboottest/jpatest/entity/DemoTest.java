package priv.kira.springcloudtest.springboottest.jpatest.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class DemoTest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "is_active")
    private Boolean active;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDatetime;

}
