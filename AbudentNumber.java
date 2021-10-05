package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class AbudentNumber {

	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
		System.out.println("Enter Any Number");
		int  n = Integer.parseInt(br.readLine());
		
		int sum = 0,m=n;
		for(int i = 1;i<n;i++)
		{
			if(n%i==0)
			sum += i;
		}
		
	     if(sum > m)
	    	 System.out.println("number is Abudent ");
	     else
	    	 System.out.println("number is not Abudent");


	}

}
