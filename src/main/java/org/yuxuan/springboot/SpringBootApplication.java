package org.yuxuan.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication是SpringBoot项目的核心注解，主要目的是开启自动配置
 * 	关闭特定的自动配置使用exclude属性
 * 		例:@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
 * 
 * @author yuxuan.han
 */
@RestController
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplication {
	
	@RequestMapping("/")
	String index() {
		return "Hello Spring Boot";
	}
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}
	
}
