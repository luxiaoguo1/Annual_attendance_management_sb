package com.itlxg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.itlxg.dao")
public class AnnualAttendanceManagementSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnnualAttendanceManagementSbApplication.class, args);
	}

}
