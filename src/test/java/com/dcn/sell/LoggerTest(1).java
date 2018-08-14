package com.dcn.sell;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description ${DESCRIPTION}
 * @Author dengchangneng
 * @Create 2018-08-14-11:20
 **/
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    @Test
    public void test1() {
        String name = "zhangsan";
        String password = "123456";
        log.info("name:{}, password:{}", name, password);
    }
}
