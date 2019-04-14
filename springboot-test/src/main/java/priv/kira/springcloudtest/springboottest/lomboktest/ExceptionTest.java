package priv.kira.springcloudtest.springboottest.lomboktest;

import lombok.SneakyThrows;

public class ExceptionTest {

    public static String t1() throws Exception {
        return "ExceptionTest t1";
    }

    @SneakyThrows
    public static String t2(){
        return "ExceptionTest t2";
    }
}
