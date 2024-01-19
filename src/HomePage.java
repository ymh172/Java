import java.util.Scanner;


public class HomePage {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Please choose option (1 or 2)\n1 for insert Student Data\n2 for view student list");
        char ans;
        do{
            homeMenu();
            System.out.println("Try Again. Type (Y/N)?");
            ans = sc.next().charAt(0);
        }while(ans=='Y');
    }

    public static void homeMenu(){
        
        System.out.println("Please choose option (1 or 2)\\n" + //
                "1 for insert Student Data\\n" + //
                "2 for view student list ");    
        int num = sc.nextInt();   
        if (num == 1){
            System.out.println("Insert Data");
        }

        else if(num==2){
            System.out.println("View Data");
        }
    }  

}
