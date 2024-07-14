import java.io.*;
import java.util.Arrays;
class week83
{
public static void main(String args[]) throws IOException
{
BufferedWriter fw=new BufferedWriter(new FileWriter("output.txt"));
BufferedReader br=new BufferedReader(new FileReader("input.txt"));
String line;

while((line=br.readLine())!=null)
{
fw.write(line);
}

fw.close();
br.close();
System.out.println("Check the output file");
}
}
