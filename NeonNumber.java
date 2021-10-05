package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class NeonNumber {

	public static void main(String[] args) throws IOException {
		
		// A number where sum of digits of Square of the number is equal to the Number
		// Eg 9 , 9*9 = 8 => 9 = 8 + 1;
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Number");
		int n = Integer.parseInt(br.readLine());
		int sum = 0, s = n*n, m=n;
		while(s!=0)
		{
			int d = s%10;
			sum += d;
			s = s/10;
		}
		
		if(sum==m)
			System.out.println("number is Neon Number");
		else 
			System.out.println("Number s Not Neon Number");

	}

}
