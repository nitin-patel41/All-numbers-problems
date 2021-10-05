package com.AllNumbersProblems;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;


public class AutomorphicNumber {

	public static void main(String[] args) throws IOException {
		
		// A number which Contained in the last digits of its Square E.g. 25 Is 625
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter any Number");
		int n = Integer.parseInt(br.readLine());
		int flag = 0, s = n*n, m=n;
		while(n!=0)
		{
			int d = n%10;
			int d1 = s%10;
			if(d!=d1)
			flag = 1;
			n= n/10;
			s = s/10;
		}
		
		if(flag==0)
			System.out.println("number is Automorphic Number");
		else 
			System.out.println("Number is Not Automorphic Number");


	}

}
