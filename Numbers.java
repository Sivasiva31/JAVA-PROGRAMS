package com.java;
import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.println("press 1 to find even number or idd number:");
    System.out.println("press 2 to find prime number");
    int n=input.nextInt();
    switch(n) {
    case 1:
    	   System.out.println("enter the number:");
    	   int number=input.nextInt();
    	   if(number%2==0) {
    	   System.out.println(number+"Its even number");
    	   }
    	   else {
    	   System.out.println(number+"Its odd number");
    	   }
    	   break;
    case 2: 	   
    	   System.out.println("enter the number:");
    	   int number1=input.nextInt();
    	   int count=0;
    	   for(int i=1;i<=number1;i++) {
    		   if(number1%i==0) {
    			   count=count+1;
    		   }
    	   }
    	   if(count==2) {
    		   System.out.println(number1+"its prime number");
    	   }
    	   else {
    		   System.out.println(number1+"its not a prime number");
    	   }
    	   break;
    	   default:
    		     System.out.println("please Enter valid number ");
    			   
    		   }
    	   }
  

	}


