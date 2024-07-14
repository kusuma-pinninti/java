import java.util.*;
class week62
{
public static void main(String args[])
{
byte a=100;
int b=300000;
short c=200;
boolean d=true;
float e=2.3F;
double f=4.5689D;
char g='v';
long h=187537;
Byte byteobj=a;
Integer intobj=b;
Short shortobj=c;
Float floatobj=e;
Double doubleobj=f;
Character charobj=g;
Long longobj=h;
Boolean boolobj=d;
Vector v=new Vector();
v.add(byteobj);
v.add(intobj);
v.add(shortobj);
v.add(floatobj);
v.add(doubleobj);
v.add(charobj);
v.add(longobj);
v.add(boolobj);
Iterator itr=v.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}



}
}