package com.capgemini.flp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@Table(name="feedback")
public class Feedback {
	
	@Id
	@NotNull
	@Column(name="product_Id")
	private int productId;
	
	@NotNull
	@Column(name="product_feedback")
	private String feedbackForProduct;
	
	@NotNull
	@Column(name="product_Rating")
	private int productRating;
	
	@NotNull
	@Column(name="customer_emailId")
	private String customerEmailId;
	
	private int ratingCount;
	private double averageRating;


public  Feedback() {
	
}


public int getProductId() {
	return productId;
}


public void setProductId(int productId) {
	this.productId = productId;
}


public String getFeedbackForProduct() {
	return feedbackForProduct;
}


public void setFeedbackForProduct(String feedbackForProduct) {
	this.feedbackForProduct = feedbackForProduct;
}


public int getProductRating() {
	return productRating;
}


public void setProductRating(int productRating) {
	this.productRating = productRating;
}


public String getCustomerEmailId() {
	return customerEmailId;
}


public void setCustomerEmailId(String customerEmailId) {
	this.customerEmailId = customerEmailId;
}


public int getRatingCount() {
	return ratingCount;
}


public void setRatingCount(int ratingCount) {
	this.ratingCount = ratingCount;
}


public double getAverageRating() {
	return averageRating;
}


public void setAverageRating(double averageRating) {
	this.averageRating = averageRating;
}


@Override
public String toString() {
	return "Feedback [productId=" + productId + ", feedbackForProduct="
			+ feedbackForProduct + ", productRating=" + productRating
			+ ", customerEmailId=" + customerEmailId + ", ratingCount="
			+ ratingCount + ", averageRating=" + averageRating + "]";
}


}