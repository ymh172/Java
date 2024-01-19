import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Your Age : ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Your Address : ");
        String address= sc.nextLine();

        System.out.print("Enter Your Weight : ");
        double wg = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Your Phone No. : ");
        String ph=sc.nextLine();

        System.out.println("My Infromation \n==============");

        System.out.println("Your Name       = "+ name);
        System.out.println("Your Age        = "+ age);
        System.out.println("Your Address    = "+ address);
        System.out.println("Your Weight     = "+ wg);
        System.out.println("Your Phonenumber = "+ ph);


        
        

    }
}
