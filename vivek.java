import java.util.*;
class Week7c {
	static class emp{
		int eid;
		String name;
		int age;
		void details(int eid,String name,int age) {
			this.eid=eid;
			this.name =name;
			this.age=age;
		}
		int get_id() {
			return eid;
		}
		String get_name() {
			return name;
		}
		int get_age() {
			return age;
		}
		
	}
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,emp> map = new HashMap<Integer,emp>();
		System.out.println("enter no of employees:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
		System.out.println("enter employee name:");
		String name=sc.next();
		System.out.println("enter the employee id:");
		int id = sc.nextInt();
		System.out.println("enter the employee age:");
		int age = sc.nextInt();
		emp e = new emp();
		e.details(id, name, age);
		map.put(id, e);	
	}
		System.out.println("Enter the search id");
		 int r = sc.nextInt();
		 System.out.println("Employee name : "+map.get(r).get_name());
		 System.out.println("Employee id : "+map.get(r).get_id());
		 System.out.println("Employee age : "+map.get(r).get_age());
  }
}