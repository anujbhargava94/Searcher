package com.anuj.projects.searcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.anuj.projects.searcher")
public class SearcherApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearcherApplication.class, args);
	}

}
