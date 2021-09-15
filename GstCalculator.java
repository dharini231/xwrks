package com.xworks.z.controlStatements;

public class GstCalculator {

	public static void main(String[] args) {
		int price=6000;
		double tax;
		if (price<=4000) {
		System.out.println("no tax");	
		}else if(price>4000 && price<=5000)
		{
			tax=price*0.4;
		}
			System.out.println("tax ");
		
	}

}
