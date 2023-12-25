package com.example.sstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
class SsTestApplicationTests {

    @Autowired
    private TestMapper testMapper;

    @Test
    void testMapper() {
        testMapper.insert(1735191437835788289L,
                "21F272A4-6D8A-4638-9C9F-07D2B12E4B14",
                "205021001003",
                "8158.21",
                new Date());
    }
}
