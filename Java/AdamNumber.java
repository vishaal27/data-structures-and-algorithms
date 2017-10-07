//Adam number is a number whose square is the reverse of the square of the number's reverse.

import java.util.*;
import java.lang.*;
import java.io.*;

public class AdamNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=12;
		
		//Prints if the number 12 is an Adam number or not.
		System.out.println(isAdam(12));
	}
	
	//Function to check if the number is an Adam number or not.
	public static boolean isAdam(int n)
	{
		return (square(n)==returnReverse(square(returnReverse(n))));
	}
	
	//function to calculate square of a number.
	public static int square(int n)
	{
		return n*n;
	}
	
	//function to find the reverse of a number.
	public static int returnReverse(int n)
	{
		int rev=0;
		int temp=n;
		while(temp>0)
		{
		    int rem=temp%10;
		    rev=rev*10+rem;
		    temp/=10;
		}
		return rev;
	}
}
