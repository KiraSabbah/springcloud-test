package priv.kira.springcloudtest.springboottest.lomboktest;

import lombok.Builder;
import lombok.Getter;

import java.util.Date;

@Builder
@Getter //这里使用@Date也是可以的，但是根据Builder思想，应不能使用set
public class BuilderTest {
    private String name;
    private String title;
    private Date adddate;
}
