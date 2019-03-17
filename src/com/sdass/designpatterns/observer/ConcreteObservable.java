package com.sdass.designpatterns.observer;

import java.util.ArrayList;

public class ConcreteObservable implements Observable {

	private final ArrayList<Observer> observers = new ArrayList<Observer>();
	private String message;
	
	public void setMessage(String message) {
		this.message = message;
		notifyObservers();
	}
	
	public String getMessage() {
		return message;
	}
	
	public void register(Observer observer) {
		if(!observers.contains(observer)) {
			observers.add(observer);
			System.out.println("New observer added with name: " + observer.getObserverName());
		}
	}

	public void unregister(Observer observer) {
		if(observers.contains(observer)) {
			observers.remove(observer);
			System.out.println("Observer removed with name: " + observer.getObserverName());
		}
	}

	public void notifyObservers() {
		observers.forEach(observer -> observer.update(this));
	}
}
