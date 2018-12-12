package com.capgemini.flp.dao;

import com.capgemini.flp.entity.Feedback;

public interface IFeedbackDao {
	
	public Feedback previousFeedback(); 
	public String customerFeedback(Feedback feedback);

}
