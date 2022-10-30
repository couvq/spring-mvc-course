package com.in28minutes.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.in28minutes.springmvc.models.FakerReview;

@RestController
public class FakerReviewController {
	
	@RequestMapping(value = "/fakerreview", method = RequestMethod.GET)
	public String getFakerReview() {
		Gson gson = new Gson();
		FakerReview fakerReview = new FakerReview();
		return gson.toJson(fakerReview);
	}
	
	@RequestMapping(value = "/fakerreviews", method = RequestMethod.GET)
	public List<String> getFiveFakerReviews() {
		List<String> fakerReviews = new ArrayList<String>();
		
		for(int i = 0; i < 5; i++) {
			Gson gson = new Gson();
			FakerReview fakerReview = new FakerReview();
			fakerReviews.add(gson.toJson(fakerReview));
		}
		
		return fakerReviews;
	}
	
}
