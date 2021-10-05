package com.AllNumbersProblems;
import java.io.*;


public class NivenNumber {

	public static void main(String[] args)throws IOException {
	
		// A number is Divisible by the Sum of its Digits Ex. 156 = 1+5+6 = 12;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Number");
		int n = Integer.parseInt(br.readLine());
		int sum = 0,m=n;
		
		
		
		while(n!=0)
		{
			int d = n%10;
			sum = sum +d ;
			n = n/10;
			
		}
		if(m%sum==0)
			System.out.println("number is Niven Number");
		else 
			System.out.println("Number s Not Niven Number");
		

	}

}
