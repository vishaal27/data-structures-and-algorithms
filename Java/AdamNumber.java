

import java.util.*;
import java.lang.*;
import java.io.*;

public class AdamNumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=12;
		System.out.println(isAdam(12));
	}
	
	public static boolean isAdam(int n)
	{
		return (square(n)==returnReverse(square(returnReverse(n))));
	}
	
	public static int square(int n)
	{
		return n*n;
	}
	
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
