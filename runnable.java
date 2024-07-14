import java.lang.*;
class Hii implements Runnable
{
public void run()
{
try
{
for(int i=0;i<6;i++)
{
System.out.println("Hii");
Thread.sleep(10);
}
}
catch(InterruptedException e)
{
}
}
}
class Hello implements Runnable
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
public static void main(String args[]) throws InterruptedException
{
Hii obj1=new Hii();
Hello obj2=new Hello();
Thread t1=new Thread(obj1,"HII");
Thread t2=new Thread(obj2,"HELLO");
t1.start();
t2.start();
System.out.println(t1.getName());
System.out.println(t2.getName());
t1.join();
t2.join();
System.out.println("Bye");
}
}