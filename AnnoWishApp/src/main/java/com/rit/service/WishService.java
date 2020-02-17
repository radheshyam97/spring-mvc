package com.rit.service;

import java.util.Calendar;

import javax.inject.Named;

@Named("ws")
public class WishService {
	public String generateWishMsg() {

		Calendar cal = Calendar.getInstance();
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		if (hour <= 12)
			return "Good Morning";
		else if (hour <= 16)
			return "Good After noon";
		else if (hour <= 20)
			return "Good Evening";
		else
			return "Good Night";

	}
}
