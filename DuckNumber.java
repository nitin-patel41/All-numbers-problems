package com.AllNumbersProblems;
import java.io.*;
public class DuckNumber {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 
		System.out.println("Enter any Number");
		int n=Integer.parseInt(br.readLine());
		
		int m = n;
		int count=0;
		while(n!=0)
		{
			int d = n%10;
			if(d==0)
				count++;
			n = n/10;
		}
		if(count > 0)
			System.out.println("Number is Duck Number");
		else
			System.out.println("Number is Not Duck Number");
		
		
	}

}
