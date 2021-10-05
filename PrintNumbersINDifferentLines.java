package com.AllNumbersProblems;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class PrintNumbersINDifferentLines {

	public static void main(String[] args)throws IOException  {
		
		       InputStreamReader r = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(r);
				
				System.out.println("Enter Number");
				int n = Integer.parseInt(br.readLine());
				
				
			    while(n!=0)
			    {
			    	int f = n%10;
			    	System.out.println(f);
			    	n= n/10;
			    }
			    
          }

}

