package com.AllNumbersProblems;
import java.io.*;


public class FindfactorsOfANumbers {

	public static void main(String[] args) throws IOException  {
		
		InputStreamReader r = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(r);
		 
		System.out.println("Enter Any Number");
		int  n = Integer.parseInt(br.readLine());
		
		for(int i = 1; i < n;i++)
		{
			
			if(n%i==0)
			{
				System.out.println(i);
			}
			
		}
		
	}

}
