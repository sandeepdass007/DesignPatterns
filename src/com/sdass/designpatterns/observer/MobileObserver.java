package com.sdass.designpatterns.observer;

public class MobileObserver implements Observer {

	private String observerName;
	
	public void setObserverName(String observerName) {
		this.observerName = observerName;
	}
	
	@Override
	public String getObserverName() {
		return observerName == null ? "No name defined" : observerName;
	}

	@Override
	public void update(Observable observable) {
		System.out.println("Message displayed by observer: " + getObserverName());
		System.out.println(((ConcreteObservable)observable).getMessage());
	}
}
