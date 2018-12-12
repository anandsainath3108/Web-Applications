package com.capgemini.flp.service;

import com.capgemini.flp.entity.Feedback;

public interface IFeedbackService {

	public Feedback previousFeedback(); 
	public String customerFeedback(Feedback feedback);
	
}
