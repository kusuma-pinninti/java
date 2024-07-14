import java.util.*;
class Swap
{
 public static void main(String args[])
  {
int n,i,j,count=0,mid=0,temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the positive number:");
n=sc.nextInt();
i=n;
while(i!=0)
{
i=i/10;
count++;
}
int array[]=new int[count];
j=n;
for(i=count-1;i>=0;i--)
{
array[i]=j%10;
j=j/10;
}
mid=count/2;
if(n%2==0)
{
i=1;
if(count%2==0)
{
if((count/2)%2==0)
j=mid+1;
else 
j=mid;
}
else 
if((count/2)%2==0)
j=mid+1;
else 
j=mid+2;
while(i<mid&&j<count)
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
i=i+2;
j=j+2;
}
}
else
{
i=0;
if(count%2==0)
{
if((count/2)%2==0)
j=mid;
else
j=mid+1;
}
else
{
if((count/2)%2==0)
j=mid+2;
else
j=mid+1;
}
while(i<mid&&j<count)
{
temp=array[i];
array[i]=array[j];
array[j]=temp;
i=i+2;
j=j+2;
}
}
n=0;
for(i=0;i<count;i++)
{
n=n*10+array[i];
}
System.out.print("Number after modifications is "+n);

  }
}