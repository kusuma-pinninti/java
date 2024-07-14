import java.lang.*;
class Hii extends Thread
{
public void run()
{
try
{
for(int i=0;i<6;i++)
{
System.out.println("Hii");
Thread.sleep(5000);
}
}
catch(InterruptedException e)
{
}
}
}
class Hello  extends Thread
{
public void run()
{
try
{
for(int i=0;i<5;i++)
{
System.out.println("Hello");
Thread.sleep(1000);
}
}
catch(InterruptedException e)
{

}
}
}
class main
{
public static void main(String args[])
{
Hii obj1=new Hii();
Hello obj2=new Hello();
obj1.start();
obj2.start();
}
}
