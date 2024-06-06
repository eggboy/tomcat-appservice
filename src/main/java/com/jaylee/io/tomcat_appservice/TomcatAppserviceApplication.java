package com.jaylee.io.tomcat_appservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TomcatAppserviceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(TomcatAppserviceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(TomcatAppserviceApplication.class, args);
    }

}

@RestController
class HelloController {
	@GetMapping("/hello")
	public String sayHi() {
		return "Hi Denny";
	}
}
