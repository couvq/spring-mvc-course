package com.in28minutes.springmvc.models;

import com.github.javafaker.Faker;

public class FakerReview {
	private String name;
	private double rating;
	private String header;
	private String description;
	
	public FakerReview() {
		Faker faker = new Faker();
		this.name = faker.name().firstName();
		this.rating = faker.number().randomDouble(1, 0, 5);
		this.header = faker.lorem().sentence();
		this.description = faker.lorem().paragraph(5);
	}
}
