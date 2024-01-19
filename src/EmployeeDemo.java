import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Address : ");
        String add = sc.nextLine();

        System.out.print("Enter Phone : ");
        String phone = sc.nextLine();

        System.out.print("Enter Age : ");
        int age = sc.nextInt();
        
        Employee empobj = new Employee(name, add, phone, age);

        empobj.display(name, add, phone, age);  
        
    
    }
    
}
