import java.util.*;
class Reverse
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,rev=0,i,rem;
System.out.print("Enter the number: ");
num=sc.nextInt();
i=num;
while(i!=0)
{
rem=i%10;
i=i/10;
rev=rev*10+rem;
}
System.out.print("Reverse of the number "+num+" is "+rev); 
}
}