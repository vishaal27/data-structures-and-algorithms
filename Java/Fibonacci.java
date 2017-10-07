//The fibonacci sequence is 0,1,1,2,3,5,8,13,...
//The nth fibonacci number is the sum of the (n-1)th and (n-2)nd fibonacci numbers.

import java.util.*;
import java.lang.*;
import java.io.*;

public class Fibonacci
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n=10;
    
    //fibonacci sequence upto and including first 10 terms.
		System.out.println("Fibonacci sequence using recursive function.");
		for(int i=0;i<=n;i++)
		{
			System.out.println(fibr(i));
		}
		System.out.println("");
		System.out.println("Fibonacci sequence using iterative function.");
		for(int i=0;i<=n;i++)
		{
			System.out.println(fibi(i));
		}
	}
	
	//recursive function to calculate the nth fibonacci number. 
	public static int fibr(int n)
	{
		if(n<=1)
			return n;
		return fib(n-1)+fib(n-2); 
	}
	
	//iterative function to calculate the nth fibonacci number.
	public static int fibi(int n)
	{
		if(n<=1)
			return n;
		int a=1;
		int b=1;
		//loop that calculates ith fibonacci number after every iteration.
		//a is the fibonacci number after every iteration.
		for(int i=2;i<=n-1;i++)
		{
			int c=a;
			a+=b;
			b=c;
		}
		return a;
	}
}
