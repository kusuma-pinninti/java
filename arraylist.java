class dynamic
{
int array[];
int current;
int capacity;
dynamic()
{
current=-1;
capacity=1;
array=new int[1];
}
void add(int data)
{
if(current==capacity)
{
int temp[]=new int[capacity*2];
for(int i=0;i<current;i++)
{
temp[i]= array[i];
}
capacity=capacity*2;
array=temp;
}
current++;
array[current]=data;
}
void get(int index)
{
if(index>=0&&index<current)
System.out.println(array[index]);
}
void remove(int index)
{
for(int i=index;i<current;i++)
{
array[i]=array[i+1];
}
}
void size()
{
System.out.println(current);
}
}
class main
{
public static void main(String args[])
{
dynamic d=new dynamic();
d.add(1);
//d.add(2);
d.get(1);
//d.get(2);
d.size();

}
}