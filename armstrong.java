import java.util.*;
class Armstrong
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int num,count=0,i,rem,armstrong=0,pow,copy;
System.out.print("Enter the number: ");
num=sc.nextInt();
i=num;
copy=num;
while(i!=0)
{
i=i/10;
count++;
}
while(num!=0)
{
rem=num%10;
num=num/10;
pow=1;
for(i=1;i<=count;i++)
{
  pow=pow*rem;
}
armstrong=armstrong+pow;
}
if(copy==armstrong)
{
System.out.print("Given number is an armstrong number. :)");
}
else
{
System.out.print("Given number is not an armstrong number. :(");
}
}
}