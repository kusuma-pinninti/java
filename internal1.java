class Rodent
{
void eat()
{
System.out.println("Iam the base class");
}
}
class Mouse extends Rodent
{
void eat()
{
System.out.println("Mouse eats cheese.");
}
}
class Gerbil extends Rodent
{
void eat()
{
System.out.println("Gerbil eats insects.");
}
}
class Hamster extends Rodent
{
void eat()
{
System.out.println("Hamster eats grass.");
}
}
class Main
{
public static void main(String args[])
{
Rodent array[]=new Rodent[3];
array[0]=new Mouse();
array[1]=new Gerbil();
array[2]=new Hamster();
for(int i=0;i<3;i++)
{
array[i].eat();
}

}
}