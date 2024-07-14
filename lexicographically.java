import java.util.*;
import java.lang.*;
class lexicographically
{
public static void main(String args[])
{
int n,l,i,k=0;
Scanner sc=new Scanner(System.in);
String str,sentence[]=new String[20];
System.out.println("Enter the string :");
str=sc.nextLine();
System.out.println("Enter the number :");
n=sc.nextInt();
l=str.length();
for(int r=0;r<l;r=r+n)
{
sentence[k]=str.substring(r,r+n);
k++;
}
String temp;
for(i=0;i<k;i++)
{
for(int j=i+1;j<k;j++)
{
if(sentence[i].compareToIgnoreCase(sentence[j])>0)
{
temp=sentence[i];
sentence[i]=sentence[j];
sentence[j]=temp;
}
}
}
for(int m=0;m<k;m++)
{
System.out.println(sentence[m]);
}
}
}