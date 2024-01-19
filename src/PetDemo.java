import java.util.Scanner;

public class PetDemo {
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        char b;
        do{
        
            menu();
            System.out.println("Want to try again? Select Y/N");
            b = sc.next().charAt(0);
        }while(b=='Y');
        
    }

    public static void menu(){
        System.out.println("Please choose option 1 or 2 \n 1 for cat \n 2 for dog");
        int num = sc.nextInt();

        if(num==1){
            Cat cat = new Cat();
            cat.eat();
            cat.voice();
            cat.play();
        }

        else if (num==2) {
            Dog dog = new Dog();
            dog.eat();
            dog.voice();
            dog.play();
        }
    }
}
