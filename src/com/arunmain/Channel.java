package com.arunmain;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject{
	
	private String title;
	
	private List<Observer> subs=new ArrayList<>();

	@Override
	public void subscriber(Observer ob) {

		subs.add(ob);
		
	}

	@Override
	public void unsubscriber(Observer ob) {
		
		subs.remove(ob);
		
	}

	@Override
	public void upload(String title) {
		
		this.title=title;
		notifySubscribers();
		
	}

	@Override
	public void notifySubscribers() {
		
		for(Observer ob:subs)
		{
			ob.update();
		}
		
	}

}
