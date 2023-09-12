package com.v3lmelt.LuoguCrawlerBackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.v3lmelt.LuoguCrawlerBackend.dao")
@SpringBootApplication
public class LuoguCrawlerBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuoguCrawlerBackendApplication.class, args);
	}

}
