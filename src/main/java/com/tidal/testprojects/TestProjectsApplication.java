package com.tidal.testprojects;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class TestProjectsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestProjectsApplication.class, args);
        log.info("...............测试项目启动成功...............");
    }

}
