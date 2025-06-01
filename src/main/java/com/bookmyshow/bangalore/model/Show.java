package com.bookmyshow.bangalore.model;

import java.util.ArrayList;
import java.util.List;


public class Show {
	  private List<Observer> observers = new ArrayList<>();
	    public void addObserver(Observer o) { observers.add(o); }
		/*
		 * public void notifyObservers(String msg) { for (Observer o : observers)
		 * o.update(msg); }
		 */
}
