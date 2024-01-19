import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
         System.out.print("Enter Num1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Num2 : ");
        int n2 = sc.nextInt();

        System.out.print("Enter Num3 : ");
        int n3 = sc.nextInt();

        Calculator obj1 = new Calculator(n1,n2,n3);
        obj1.addThreeNum();
        obj1.addTwoNum();
    }
}
