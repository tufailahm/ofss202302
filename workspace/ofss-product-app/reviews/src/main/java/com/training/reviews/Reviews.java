package com.training.reviews;

public class Reviews {

	public Reviews() {
	}

	public static String getReview(int productId) {
		// fetch the rating for this product and return
		return "Reviews for :" + productId + " is excellent (5+)";
	}
}
