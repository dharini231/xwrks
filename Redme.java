package com.xworks.oops;

public class Redme {

	public static void main(String[] args) {
		
				Moblie redme11= new Mobile();
				redme11.price=20000;
				redme11.ram=64;
				redme11.battery=6000;
				
				System.out.println(redme11.price);
				System.out.println(redme11.ram);
				System.out.println(redme11.battery);
				redme11.call();
				redme11.text();
			
			
			Moblie redme11pro= new Mobile();
			redme11pro.price=25000;
			redme11pro.ram=128;
			redme11pro.battery=7500;
			
			System.out.println(redme11pro.price);
			System.out.println(redme11pro.ram);
			System.out.println(redme11pro.battery);
			redme11pro.call();
			redme11pro.text();

		
		
	}

}
