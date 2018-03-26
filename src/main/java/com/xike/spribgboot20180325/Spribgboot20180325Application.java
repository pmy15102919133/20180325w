package com.xike.spribgboot20180325;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xike.spribgboot20180325.mapper.*Mapper")
public class Spribgboot20180325Application {

	public static void main(String[] args) {
		SpringApplication.run(Spribgboot20180325Application.class, args);
	}
}
