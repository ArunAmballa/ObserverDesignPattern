package com.arunmain;

public interface Subject {

	void subscriber(Observer ob);
	void unsubscriber(Observer ob);
	void upload(String title);
	void notifySubscribers();
}
