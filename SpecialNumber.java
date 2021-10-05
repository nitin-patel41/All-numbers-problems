package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class SpecialNumber {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
		System.out.println("Enter Any Number");
		int  n = Integer.parseInt(br.readLine());
		
		int  prod = 1,m,d=n,sum = 0;
		while(n!=0) {
			m = n%10;
			sum = sum + m;
			prod = prod*m;
			n = n/10;
		}
	      int   total = sum + prod;
	        if(total == d)
	    	 System.out.println("number is Special");
	     else
	    	 System.out.println("number is not Special");
		
	}

}
