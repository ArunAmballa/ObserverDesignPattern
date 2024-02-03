package com.arunmain;

public class Subscriber implements Observer{

	private String name;
	
	public Subscriber()
	{
		
	}
	public Subscriber(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update() {
		
		System.out.println("Hey"+this.name+"Video is Uploaded");
		
	}

}
