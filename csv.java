import java.io.*;
class csv
{
public static void main(String args[]) throws IOException
{
FileReader fr=new FileReader("supermarket.csv");
BufferedReader br=new BufferedReader(fr);
int revenue=0,i=0;
int qn[]=new int[10];
String line;
String s[]={};
String id[]=new String[10];
br.readLine();
while((line=br.readLine())!=null)
{
s=line.split(",");
System.out.println(line);
int q=Integer.parseInt(s[2]);
int c=Integer.parseInt(s[3]);
revenue+=c*q;
qn[i]=q;
id[i]=s[1];
i++;
}
for(int m=0;m<i;m++)
{
for(int n=m+1;n<i;n++)
{
if(qn[m]>qn[n])
{
int temp=qn[m];
qn[m]=qn[n];
qn[n]=temp;
String temp1=id[m];
id[m]=id[n];
id[n]=temp1;
}
}
}
System.out.println("Revenue "+revenue);
System.out.println("Items after sorting are ");
for(int k=0;k<i;k++)
{
System.out.println(id[k]+qn[k]);
}
}
}
