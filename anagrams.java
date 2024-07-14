import java.util.*;
class anagrams
{
public static void main(String args[])
{
int count1=0,count2=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first string ");
String s1;
s1=sc.nextLine();
System.out.println("Enter the second string ");
String s2;
s2=sc.nextLine();
int i,j;
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
if(s1.length()!=s2.length())
{
System.out.println("Not anagrams.");
}
else
{
for(i=0;i<s1.length();i++)
{
for(j=0;j<s2.length();j++)
{
if(ch1[i]==ch2[j])
{
count1++;
break;
}
}
}
for(i=0;i<s2.length();i++)
{
for(j=0;j<s1.length();j++)
{
if(ch2[i]==ch1[j])
{
count2++;
break;
}
}
}
if(count1==s1.length()&&count2==s1.length())
{
System.out.println("Anagrams");
}
else
System.out.println("Not anagrams.");
}
}
}