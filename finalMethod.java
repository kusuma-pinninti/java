class finalMethod
{
final void display(String s)
{
System.out.println(s);
}
}
class sub extends finalMethod
{
void display(String s)
{
System.out.println(s);
}
public static void main(String args[])
{
sub obj=new sub();
obj.display("HI");
}
}