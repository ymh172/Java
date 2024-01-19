public class Employee { 
        String emp_name;
        String emp_address;
        String emp_phone;
        int emp_age;

        public Employee(String emp_name, String emp_address, String emp_phone, int emp_age){
            this.emp_name = emp_name;
            this.emp_address = emp_address;
            this.emp_phone = emp_phone;
            this.emp_age = emp_age;
        }   

        public static void display(String name, String add, String phone, int age){
            System.out.println("Name is " + name +"\n" +"Address is "+ add+ 
        "\nPhone is "+ phone+ "\nAge is "+age);
        }

        // public String getEmp_name(){
        //     return emp_name;
        // }

        // public String getEmp_address(){
        //     return emp_address;
        // }
        // public String getEmp_phone(){
        //     return emp_phone;
        // }
        // public int getEmp_age(){
        //     return emp_age;
        // }
}
