package com.xworks.oops;

public class Canara {

	public static void main(String[] args) {
		bank CanaraH1=new bank();
		CanaraH1.Branch="Girinagar";
		CanaraH1.ifscCode="CAB5673";
		CanaraH1.Name="Vinayaka";
		CanaraH1.phoneNo=26800739;
		

	System.out.println(CanaraH1.Branch);
	System.out.println(CanaraH1.ifscCode);
	System.out.println(CanaraH1.Name);
	System.out.println(CanaraH1.phoneNo);
	CanaraH1.pay();
	CanaraH1.transfer();
	CanaraH1.check();
	
		
	
	bank CanaraH2=new bank();
	CanaraH2.Branch="shrinagar";
	CanaraH2.ifscCode="CAB5473";
	CanaraH2.Name="ssm";
	CanaraH2.phoneNo=268008739;
	

	System.out.println(CanaraH2.Branch);
	System.out.println(CanaraH2.ifscCode);
	System.out.println(CanaraH2.Name);
	System.out.println(CanaraH2.phoneNo);
	CanaraH2.pay();
	CanaraH2.transfer();
	CanaraH2.check();
	
	}			

}
