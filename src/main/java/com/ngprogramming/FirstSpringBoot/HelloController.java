package com.ngprogramming.FirstSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

		@GetMapping("/")
		public String index() {
			System.out.println("App is Running");
			return "<h1>Hello World</h1>";
		}
	
}
