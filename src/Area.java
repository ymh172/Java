import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Height : ");
        int h = sc.nextInt();

        System.out.print("Enter Length : ");
        int l = sc.nextInt();

        System.out.print("Enter Radius : ");
        int r = sc.nextInt();

        recArea(h,l);
        circleArea(r);
    }
    public static void recArea(int h,int l){
        System.out.println("Area of Rectangle is "+ (h*l));
    }

    public static void circleArea(int r){
        System.out.print("Area of Circle is "+ (3.14*(r*r)));
    }

}
