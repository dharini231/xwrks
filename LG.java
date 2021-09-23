package com.xworks.oops;

public class LG {

	public static void main(String[] args) {
		AC LGa55= new AC();
		LGa55.color="white";
		LGa55.model="LG";
		LGa55.price=35000;
		LGa55.capacity=2;

	
	System.out.println(LGa55.color);
	System.out.println(LGa55.model);
	System.out.println(LGa55.price);
	System.out.println(LGa55.capacity);
	LGa55.cool();
	LGa55.switchoff();
	LGa55.switchon();
	
	AC LGa65= new AC();
	LGa65.color="grey";
	LGa65.model="LG";
	LGa65.price=34000;
	LGa65.capacity=3;


System.out.println(LGa65.color);
System.out.println(LGa65.model);
System.out.println(LGa65.price);
System.out.println(LGa65.capacity);
LGa65.cool();
LGa65.switchoff();
LGa65.switchon();

}
}