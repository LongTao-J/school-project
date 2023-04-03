package com.school;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SchoolUserApplicationTests {
    @Autowired
    SUserService sUserService;

    @Test
    void contextLoads() {
        SUser sUser = sUserService.queryById("0x00009127");
        System.out.println(sUser);
    }

}
