import java.util.*;
class vowels
{
public static void main(String args[])
{
int n=3,i,j;
String s1="hii\nhello\nwelcome\n";
Scanner sc=new Scanner(s1);
System.out.println("Enter the number of strings: ");
String str[]=new String[n];
for(i=0;i<n;i++)
{
System.out.println("Enter string ["+i+"]");
str[i]=sc.nextLine();
}
for(i=0;i<n;i++)
{
int vowels=0,consonants=0;
char copy[]=str[i].toCharArray();
for(j=0;j<str[i].length();j++)
{
if(copy[j]=='a'||copy[j]=='e'||copy[j]=='i'||copy[j]=='o'||copy[j]=='u'||copy[j]=='A'||copy[j]=='E'||copy[j]=='I'||copy[j]=='O'||copy[j]=='U')
{
vowels++;
}
else
{
consonants++;
}
}
System.out.println("No of vowels in "+str[i]+" is "+vowels);
System.out.println("No of consonants in "+str[i]+" is "+consonants);
}

}
}