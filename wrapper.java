import java.util.*;
 class Wrapperclass
{
	public static void main(String args[])
	{
		byte a=1;
		short b=21;
		int c =280;
		long d=2000;
		float f=23.43f;
		double g=40000D;
		char h='A';
		boolean j=false;
		
		Byte byteobj=a;
		Short shortobj=b;
		Integer intobj=c;
		Long longobj=d;
		Float floatobj=f;
		Double doubleobj=g;
		Character charobj=h;
		Boolean boolobj=j;
		
		Vector <> v=new Vector<>();
		v.add(byteobj);
		v.add(shortobj);
		v.add(intobj);
		v.add(longobj);
		v.add(floatobj);
		v.add(doubleobj);
		v.add(charobj);
		v.add(boolobj);
		for(int i=0;i<v.size();i++)
		{
			System.out.println(v.get(i));
		}
	}
}