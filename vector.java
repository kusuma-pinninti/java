import java.util.*;
class Wrapper6b
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
byte b;
char c;
boolean boo;
short s;
int i;
long l;
float f;
double d;
System.out.println("enter byte value: ");
b=sc.nextByte();
System.out.println("enter char value: ");
c=sc.next().charAt(0);
System.out.println("enter boolean value: ");
boo=sc.nextBoolean();
System.out.println("enter short value: ");
s=sc.nextShort();
System.out.println("enter int value: ");
i=sc.nextInt();
System.out.println("enter long value: ");
l=sc.nextLong();
System.out.println("enter float value: ");
f=sc.nextFloat();
System.out.println("enter double value: ");
d=sc.nextDouble();

Byte b_obj=b;
Character c_obj=c;
Boolean boo_obj=boo;
Short s_obj=s;
Integer i_obj=i;
Long l_obj=l;
Float f_obj=f;
Double d_obj=d;

Vector<Object> v=new Vector<>();
v.add(b_obj);
v.add(c_obj);
v.add(boo_obj);
v.add(s_obj);
v.add(i_obj);
v.add(l_obj);
v.add(f_obj);
v.add(d_obj);
System.out.println("vector elements are:");
for(int j=0;j<v.size();j++)
{
System.out.println(v.get(j));
}

}
}