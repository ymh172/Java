import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char con = 'Y';
        do {

            homeMenu();
            System.out.println("Try Again. Type (Y/N)?");
            con = sc.next().charAt(0);
        } while (con == 'Y');

    }

    public static void homeMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please choose option 1 or 2");
        System.out.println("1 for insert data");
        System.out.println("2 for view ");
        int num = sc.nextInt();
        if (num == 1) {
            sc.nextLine();
            System.out.println("enter name : ");
            String n = sc.nextLine();

            System.out.println("enter age : ");
            String a = sc.nextLine();

            System.out.println("enter batch : ");
            String b = sc.nextLine();

            System.out.println("enter age : ");
            String c = sc.nextLine();

            System.out.println("enter batch : ");
            int d = sc.nextInt();

            Student stu1 = new Student(n, a, b, c, d);

            Student.addStu(stu1);

        }

        else if (num == 2) {
            for (Student obj : Student.getStuList()) {
                System.out.println(obj);
            }
        }
    }

}