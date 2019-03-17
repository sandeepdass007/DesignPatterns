package com.sdass.designpatterns.observer;

public interface Observer {
	public String getObserverName();
	public void update(Observable observable);
}
