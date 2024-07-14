import java.io.*;
class InsufficientBalanceException extends Exception
{
public InsufficientBalanceException(String s1)
{
super(s1);
}
}
class Group
{
static void validity(int balance)throws InsufficientBalanceException
{
if(balance<1000)
{
throw new InsufficientBalanceException("Not eligible to take");
}
else
{
System.out.println("Balance is: "+balance);
}
}
public static void main(String[] args)
{
try
{
validity(100);
}
catch(InsufficientBalanceException ex)
{
System.out.println("person is: "+ex);
}
finally
{
System.out.println("Thank you");
}
}
}
