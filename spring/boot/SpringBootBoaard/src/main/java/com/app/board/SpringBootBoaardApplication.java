package com.app.board;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.app.board.mapper")
public class SpringBootBoaardApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootBoaardApplication.class, args);
    }

}
