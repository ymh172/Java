public class Calculator {
    
    int num1;
    int num2;
    int num3;

    public Calculator(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public Calculator(int num1, int num2,int num3){
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    public void addTwoNum(){
        System.out.println("Sum of Two Number = "+ (num1+num2));
    }

    public void addThreeNum(){
        System.out.println("Sum of Three Number = "+ (num1+num2+num3));
    }
}
