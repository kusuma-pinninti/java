public class sample
{
final double pi;
sample()
{
pi=3.14;
}
sample(double p)
{
pi=p;
pi++;
}
public static void main(String args[])
{
sample ob=new sample(22/7);
sample ob1=new sample();
System.out.println(ob.pi);
System.out.println(ob1.pi);
}
}