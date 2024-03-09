package com.serhatmerak.chain;

import com.serhatmerak.chain.model.Activity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class ChainApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChainApplication.class, args);
	}

	@GetMapping
	public Activity get() {
		Activity activity = new Activity();
		activity.id = 12;
		activity.chainId = "New Chain";
		activity.colorHex = "#ffff12";
		activity.date = new Date();
		System.out.println(activity.toString());
		return activity;
	}
}
