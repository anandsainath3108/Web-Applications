package com.capgemini.flp.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.flp.dao.IFeedbackDao;
import com.capgemini.flp.entity.Feedback;

@Service
@Transactional
public class FeedbackServiceImpl implements IFeedbackService {

	@Autowired
	IFeedbackDao dao;
	
	@Override
	public Feedback previousFeedback() {
		// TODO Auto-generated method stub
		return dao.previousFeedback();
	}

	@Override
	public String customerFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return dao.customerFeedback(feedback);
	}

}
