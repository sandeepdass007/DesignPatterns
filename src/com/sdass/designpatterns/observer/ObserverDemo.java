package com.sdass.designpatterns.observer;

public class ObserverDemo {

	public static void main(String[] args) {
		ConcreteObservable concreteObservable = new ConcreteObservable();
		MobileObserver onePlus3TObserver = new MobileObserver();
		onePlus3TObserver.setObserverName("OnePlus 3T");
		
		MobileObserver motorolaObserver = new MobileObserver();
		motorolaObserver.setObserverName("Motorola");
		
		concreteObservable.register(onePlus3TObserver);
		concreteObservable.register(motorolaObserver);
		
		System.out.println("=====================================");
		System.out.println("Publishing new message.");
		System.out.println("=====================================");
		concreteObservable.setMessage("Hello People!");
		
		concreteObservable.unregister(motorolaObserver);
		System.out.println("=====================================");
		System.out.println("Unregistered Motorola observer.");
		System.out.println("=====================================");
		
		System.out.println("=====================================");
		System.out.println("Publishing another message.");
		System.out.println("=====================================");
		concreteObservable.setMessage("Hello Updated Observers!");
	}

}
