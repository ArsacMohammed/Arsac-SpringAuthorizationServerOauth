package com.arsac.Oauth2ResourceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.security.Principal;
import java.util.Map;

@SpringBootApplication
@Controller
@ResponseBody
public class Oauth2ResourceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2ResourceServerApplication.class, args);
	}


	@GetMapping("/hello")
	Map<String,String> hello(Principal principal){
		return Map.of("hello","welcome"+principal.getName());
	}
}
