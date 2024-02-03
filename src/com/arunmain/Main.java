package com.arunmain;

public class Main {
	
	public static void main(String args[]) {
		
		Subject telusko=new Channel();
		
		Observer ob1=new Subscriber("Arun");
		
		Observer ob2=new Subscriber("Sai");
		
		Observer ob3=new Subscriber("Jeswanth");
		
		telusko.subscriber(ob1);
		telusko.subscriber(ob2);
		telusko.subscriber(ob3);
		
		telusko.upload("Python Course");
		
		
	}

}
