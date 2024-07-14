import java.util.*;
public class hash{
static class emp {
int eid;
String ename;
int eage;
void details(int eid, String ename, int eage ){
this.eid = eid;
this.ename = ename;
this.eage = eage;
}
int get_id(){
return eid;
}
String get_name(){
return ename;
}
int get_age(){
return eage;
}
}
public static void main(String s[]){
Scanner sc = new Scanner(System.in);
HashMap<Integer,emp> map = new HashMap<Integer,emp>();
System.out.println("Enter no of employees ");
int n = sc.nextInt();
for(int i=0;i<n;i++){
System.out.println("Enter employee name");
String name = sc.next();
System.out.println("Enter employee id");
int id = sc.nextInt();
System.out.println("Enter employee age");
int age = sc.nextInt();
emp e = new emp();
e.details(id,name,age);
map.put(id,e);
}
System.out.println("Enter the search id");
int r = sc.nextInt();
System.out.println("Employee name : "+map.get(r));
System.out.println("Employee id : "+map.get(r).get_id());
System.out.println("Employee age : "+map.get(r).get_age());
sc.close();
}
}