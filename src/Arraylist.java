import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<String>book = new ArrayList<>();
        ArrayList<Integer>price = new ArrayList<>();

        book.add("Dog");
        book.add("Health");
        book.add("Horror");
        book.add("Science");

        price.add(500);
        price.add(600);
        price.add(700);
        price.add(800);

        for(int i=0; i<book.size();i++){
            System.out.println("Book type : "+book.get(i)+ " and price is "+ price.get(i));
        }
    }
}
