package com.paopao.mycloud;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@MapperScan("com.paopao.mycloud.dao")
public class MessageApplication {


	private static Logger logger = LoggerFactory.getLogger(MessageApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(MessageApplication.class, args);
	}

	@GetMapping("test")
	public String test(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getSession(true).getId();
		return "sessionid: " + id;
	}
	
}
