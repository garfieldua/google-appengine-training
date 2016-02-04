package com.google.training.helloworld;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {
	public String timeFormatted = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(Calendar.getInstance().getTime());
	
	public Time() {
	}
	
	public String getTimeFormatted() {
		return timeFormatted;
	}
}
