package com.in28minutes.springmvc.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.springmvc.models.FakerReview;

@RestController
public class FakerReviewController {

	@RequestMapping(value = "/fakerreview", method = RequestMethod.GET)
	public FakerReview getFakerReview() {
		FakerReview fakerReview = new FakerReview();
		return fakerReview;
	}

	@RequestMapping(value = "/fakerreviews", method = RequestMethod.GET)
	public List<FakerReview> getFiveFakerReviews() {
		List<FakerReview> fakerReviews = new ArrayList<FakerReview>();

		for (int i = 0; i < 5; i++) {
			FakerReview fakerReview = new FakerReview();
			fakerReviews.add(fakerReview);
		}

		return fakerReviews;
	}

}
