// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	while(t-->0)
	{
	int n=sc.nextInt();
	int e=n/2;
	int o;
	if(n%2==0)
	{
	     o=n/2;
	}
	else{
	    o=(n/2)+1;
	}
System.out.println(2*(o*e));
	}
	}
}