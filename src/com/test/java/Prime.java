package com.test.java;

public class Prime {
	public static void main(String[] args){
	
	int i=0;
	int j=0;
	
	String PrimeNumbers = " ";
	
	for(i=0;i<=20;i++)
	{
		int counter = 0;
		for(j=i;j>=1;j--)
	{
		if(i%j==0)
		{
			counter = counter + 1;
		}
	}
		if(counter == 2)
		{
			PrimeNumbers = PrimeNumbers + i + " ";
		}
	
	
	}
	System.out.println("The prime numbers between 1 and 20 are");
	System.out.println(PrimeNumbers);
	
	
}
}

