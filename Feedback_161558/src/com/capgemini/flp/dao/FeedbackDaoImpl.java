package com.capgemini.flp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceException;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.capgemini.flp.entity.Feedback;

@Repository
@Transactional
public class FeedbackDaoImpl implements IFeedbackDao {

	@PersistenceContext
	EntityManager entityManager = null;
	Feedback f = null;
	
	@Override
	public Feedback previousFeedback() {
		// TODO Auto-generated method stub
		try {
			String jql = "select max(ratingCount) from Feedback";
			TypedQuery<Feedback> typedQuery = entityManager.createQuery(jql, Feedback.class);
		    f = typedQuery.getSingleResult();
		    System.out.println(f);
		}catch (PersistenceException e) {
			// TODO: Log to file
			f= null;
		}
		return f;
	}

	@Override
	public String customerFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		String s = null;
		try {
			String jql = "select max(ratingCount) from Feedback";
			TypedQuery<Feedback> typedQuery = entityManager.createQuery(jql, Feedback.class);
		    f = typedQuery.getSingleResult();
            int a = f.getRatingCount() + 1;
            feedback.setRatingCount(a);
            double r = ((f.getAverageRating()*f.getRatingCount()) + feedback.getProductRating())/a;
            feedback.setAverageRating(r);
            entityManager.persist(feedback);
            s = "Thank you for your Feedback";
		}catch (PersistenceException e) {
			// TODO: Log to file
			s= "Please give the feedback again";
		}
		return s;
	}

}
