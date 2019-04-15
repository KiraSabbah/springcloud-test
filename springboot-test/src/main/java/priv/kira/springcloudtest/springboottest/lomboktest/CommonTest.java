package priv.kira.springcloudtest.springboottest.lomboktest;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * 常用注解
 * <p>
 * Getter 生成get方法 <br>
 * Setter 生成set方法 <br>
 * ToString 重写toString, 每个字段输出 <br>
 * EqualsAndHashCode 重写equals()和hashCode() <br>
 * Data 包含@Getter,@Setter,@EqualsAndHashCode,@RequiredArgsConstructor <br>
 * Builder Builder模式创建类 <br>
 * Slf4j 日志，还有很多其他相关日志注解，详见：https://projectlombok.org/features/log <br>
 * </p>
 * <p>
 * 由于使用lombok增加其他成员学习成本，并且必须也使用lombok才可编译，看源码，且查看调用不方便； <br>
 * 这里不建议深度使用lombok,一般仅使用@Getter\@Setter\@Slf4j； <br>
 * 开源或者对多个环境系统公开的，最好不用，或者使用delombok生成代码 <br>
 * </p>
 */
@Setter
@Getter
@Slf4j
public class CommonTest {
    private String name;
    private String title;
    private Date adddate;
}
