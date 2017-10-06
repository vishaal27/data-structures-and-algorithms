

import java.util.*;
import java.lang.*;
import java.io.*;

public class Fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=10;
    
    //fibonacci sequence upto and including first 10 terms.
		for(int i=0;i<=n;i++)
		{
			System.out.println(fib(i));
		}
	}
	
	public static int fib(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2); 
	}
}
