package priv.kira.springcloudtest.userservice.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;

    private String pwd;

    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createDatetime;

    @Temporal(TemporalType.TIMESTAMP)
    private Date modifyDatetime;

}
