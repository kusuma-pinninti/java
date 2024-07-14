import java.util.*;
class week7b
{
public static void main(String args[])
{
ArrayList<String> arr=new ArrayList <String>();
arr.add("Kusuma");
arr.add("Ashwini");
arr.add("Seetharamu");
arr.add("Anitha");
System.out.println("Size "+arr.size());
arr.remove(0);
for(int i=0;i<3;i++)
{
System.out.println(arr.get(i));
}
}
}