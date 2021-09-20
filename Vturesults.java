package com.xworks.methods;

public class Vturesults {
	public static void veiwResult(String username, String result)
	String usn = "ap16is";
	String res = "75per";
	if(username == usn && result == res) {
		System.out.println("vaild");
	}else {
			System.out.println("invaild");
	}

	

	public static void main(String[] args) {
		System.out.println("welcome to vvtuResults");
		Vturesults.veiwResult("ap16is","75per" );

	}

}
