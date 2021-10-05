package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class PrimeNumber {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
		System.out.println("Enter Any Number");
		int  n = Integer.parseInt(br.readLine());
		
		int count = 0;
		for(int i = 1;i<=n;i++)
		{
			if(n%i==0)
			count++;
		}
		
	     if(count==2)
	    	 System.out.println("number is prime");
	     else
	    	 System.out.println("number is not prime");

	}

}
