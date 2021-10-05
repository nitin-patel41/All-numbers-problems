package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class KmNumber {

	public static void main(String[] args) throws IOException {
		
		// A number where sum of factorial of digit is equal to the Number e.g. 145 = 1! + 4! + 5!
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Number");
		int n = Integer.parseInt(br.readLine());
		int sum = 0, fact = 1, m=n;
		while(n!=0)
		{
			int d = n%10;
			for(int i = 1; i<=d ;i++)
			{
				fact = fact*i;
				sum = sum+fact;
				n=n/10;
			}
		
		if(sum==m)
			System.out.println("number is KM Number");
		else 
			System.out.println("Number is Not KM Number");
		}


	}

}
