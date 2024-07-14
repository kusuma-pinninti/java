class Chandana
{
synchronized void display(int n)
{
for(int i=1;i<=5;i++)
{

System.out.println(n+"x"+i+"="+n*i);
}

}
}
class Kusuma extends Thread
{
public void run()
{
Chandana t=new Chandana();
 t.display(5);
}
}
class Pallavi extends Thread
{
public void run()
{
Chandana t=new Chandana();
t.display(7);
}
}
class Sync
{
public static void main(String[] args)
{
Kusuma k = new Kusuma();
k.start();
Pallavi p = new Pallavi();
p.start();
}
}