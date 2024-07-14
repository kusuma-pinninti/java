public class sample
{
final double pi;
sample()
{
pi=3.14;
}
sample(double pi)
{
this.pi=pi;
}
public static void main(String args[])
{
sample ob=new sample(22/7);
System.out.println(ob.pi);
}
}