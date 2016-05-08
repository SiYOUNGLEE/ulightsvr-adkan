package com.yjmedia.adkan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class AdKanApplication extends SpringBootServletInitializer {
    private static Class<AdKanApplication> applicationClass = AdKanApplication.class;

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(applicationClass);
    }

	public static void main(String[] args) {
		SpringApplication.run(AdKanApplication.class, args);
	}
}
