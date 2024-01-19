import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Num1 : ");
        int n1 = sc.nextInt();

        System.out.print("Enter Num2 : ");
        int n2 = sc.nextInt();
        sum(n1,n2);

        sum(11,22);
    }
    public static void sum(int n1,int n2){
        int result = n1+n2;
        System.out.println("The result is "+result );
    }
    
}
