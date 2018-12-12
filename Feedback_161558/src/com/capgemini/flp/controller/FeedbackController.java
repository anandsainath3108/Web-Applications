package com.capgemini.flp.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.flp.entity.Feedback;
import com.capgemini.flp.service.IFeedbackService;

@Controller
public class FeedbackController {

	@Autowired
	IFeedbackService service;
	
	@RequestMapping(value="feedbackpage")
	public void gettingPreviousFeedback(@ModelAttribute("feedback") Feedback f, Map<String,List<Object>> map){


		List<Object> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list1.add(4);
		list1.add(5);
		map.put("rating",list1);
		
		Feedback feedback = service.previousFeedback();
		int a = feedback.getRatingCount();
		double b = feedback.getAverageRating();	
		List<Object> list2 = new ArrayList<>();
		list2.add(a);
		map.put("noRatings",list2);

		List<Object> list3 = new ArrayList<>();
		list3.add(b);
		map.put("averageRatings",list3);
		
		}
	
	@RequestMapping(value="feedbackpage")
	public ModelAndView newFeedback(@ModelAttribute("feedback")  Feedback f){ 
		String message = service.customerFeedback(f);
		return new ModelAndView("feedbackpage", "details", message);
	}
}

