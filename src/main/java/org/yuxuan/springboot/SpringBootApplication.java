package org.yuxuan.springboot;

import org.springframework.beans.factory.annotation.Value;
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
	
	@Value("${book.author}")
	private String bookAuthor;
	
	@Value("${book.name}")
	private String bookName;
	
	@RequestMapping("/")
	String index() {
		return "bookName: " + bookName + " --- bookAuthor: " + bookAuthor;
	}
	
	/**
	 * Application entrance
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
		
		//	换一种启动方式:关闭banner启动
//		SpringApplication app = new SpringApplication(SpringBootApplication.class);
//		app.setBannerMode(Banner.Mode.OFF);//	
//		app.run(args);
		
		//	使用fluent Api启动，关闭banner
//		new SpringApplicationBuilder(SpringBootApplication.class)
//			.bannerMode(Banner.Mode.OFF)
//			.run(args);
	}
	
}
