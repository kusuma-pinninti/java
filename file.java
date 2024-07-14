import java.util.*;
import java.io.*;
class file
{
public static void main(String args[]) throws IOException
{
int alpha=0,nums=0,specchar=0,ch;
File f1=new File("input.txt");
System.out.println("File exists "+f1.exists()+"\nFile length "+f1.length()+"\nFile can be read "+f1.canRead()+"\nFile can be write "+f1.canWrite()+"\n File name "+f1.getName()+"\n File path "+f1.getPath());
FileInputStream fstream=new FileInputStream(f1);
while((ch=fstream.read())!=-1)
{
if(ch>='a'&&ch<='z'||ch>='A'&&ch<='Z')
{
alpha++;
}
if(ch>='0'&&ch<='9')
{
nums++;
}
else
{
specchar++;
}
File f2=new File("output2.txt");
FileOutputStream fstream2 =new FileOutputStream(f2);
String str="Alphabets "+alpha+" Numbers "+nums+" Special characters "+specchar;
byte b[]=str.getBytes();
fstream2.write(b);
}
}
}