import java.util.*;

class Employee{
    String EmployeeName;
    int EmployeeId;
    double EmployeeSalary;
    void setEmployeeDetails(String EmployeeName, int EmployeeId, double EmployeeSalary)
    {
        this.EmployeeName = EmployeeName;
        this.EmployeeId = EmployeeId;
        this.EmployeeSalary = EmployeeSalary;
    }
}

 class TwoC {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, Employee> a = new HashMap<Integer, Employee>();
        System.out.println("Choose from below menu: ");
        System.out.println("1.Add to Hash Map\n2.Search for a employee\n3.exit");
        while (true) {
            System.out.print("Enter your option: ");
            int opt = sc.nextInt();
            switch (opt) 
            {
                case 1:
                    System.out.print("Enter the employee id: ");
                    int id = sc.nextInt();
                    System.out.print("Enter the employee name: ");
                    String name = sc.next();
                    System.out.print("Enter the employee salary: ");
                    double salary = sc.nextDouble();
                    Employee e = new Employee();
                    e.setEmployeeDetails(name, id, salary);
                    a.put(id, e);
                    System.out.println("Employee with id: " + id + " is successfully added.");
                    break;
                
                

                case 4:
                    System.exit(0);
            }
        }
    }
}