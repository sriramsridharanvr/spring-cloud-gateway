package com.example.demo.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class CatServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatServiceApplication.class, args);
	}

	
	@GetMapping("/cats")
	public ResponseEntity<String> check() {
		return ResponseEntity.ok().body("Hello from CatService");
	}
	
	@GetMapping("/cats/todo")
	public ResponseEntity<Todo> getTodo(@RequestHeader("Authorization") String authToken) {
		System.err.println(authToken);
		return ResponseEntity.ok().body(new Todo("I'm a cat! Feed me!"));
	}
	
	@GetMapping("/api/cats")
	public ResponseEntity<String> apiCheck() {
		return ResponseEntity.ok().body("Hello from Cats API");
	}
}
