package com.java;
class A{
void m() {
	  int a[]=new int[9];
	  a[9]=90;
	  System.out.println(a[9]);
}
void n() {
	 m();
}
void demo() {
	try {
		n();
		
	}catch(Exception e) {
		//TODO:handle exception
	    System.out.println(e);
	}
	finally { 
		System.out.println("Error handled");
	}
	
	}
	
}
	   
	  
public class ExceptionHandling {
	
	 public static void main(String[]args) {
		        new A().demo();
	 }
	 
}
