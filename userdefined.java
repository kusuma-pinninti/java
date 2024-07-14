class userdefined extends Exception
{
userdefined(String s)
{
super(s);
}
}
class main
{
public static void main(String args[])
{
try
{
int x=9;
int y=14;
int z=x/y;
if(z==0)
{
throw new userdefined("Error hii");
}
}
catch(userdefined ex)
{
System.out.println(ex);
}
finally
{
System.out.println("Thank you");
}
}
}