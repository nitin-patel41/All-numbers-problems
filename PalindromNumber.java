package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class PalindromNumber {

	public static void main(String[] args)throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
		System.out.println("Enter Any Number");
		int  n = Integer.parseInt(br.readLine());
		
		int  pali = 0,m,d=n;
		while(n!=0) {
			m = n%10;
			pali = pali*10+m;
			n = n/10;
		}
	
	     if(pali==d)
	    	 System.out.println("number is Palindrom");
	     else
	    	 System.out.println("number is not Palindrom");
	  }

}
