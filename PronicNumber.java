package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class PronicNumber {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		 
		System.out.println("Enter Any Number");
		int  n = Integer.parseInt(br.readLine());
		
		int fact = 0,m=n;
		for(int i = 1;i<n;i++)
		{
			if(n%i==0)
			  if(i*(i+1)==n)
			  {
                 fact = 1;
			  }
			  
		}
		
	     if(fact!=0)
	    	 System.out.println("number is pronic");
	     else
	    	 System.out.println("number is not Pronic");


	}
	}



