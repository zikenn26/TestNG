package com.example.catfact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class CatfactApplication {

	public static void main(String[] args) {
	Random random = new Random();
		SpringApplication.run(CatfactApplication.class, args);

	String url = "https://catfact.ninja/fact";

	WebClient.Builder builder = WebClient.builder();
	String catFact = builder.build()
			.get()
			.uri(url)
			.retrieve()
			.bodyToMono(String.class)
			.block();
//			.bodyToFlux(String.class)	.blockLast();

		System.out.println("-------------------------------------------------------");
		System.out.println(catFact);
		System.out.println("-------------------------------------------------------");
		System.out.println(random.sum(5,6));

	}

}
