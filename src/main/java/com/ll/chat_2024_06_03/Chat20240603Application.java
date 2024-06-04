package com.ll.chat_2024_06_03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing 			// @CreateDate, @ModifiedDate를 사용하기 위해 필요
public class Chat20240603Application {

	public static void main(String[] args) {
		SpringApplication.run(Chat20240603Application.class, args);
	}

}
