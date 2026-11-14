import java.util.Scanner;

public class TempMain {
    public static void main(String[] args) {
Product p1=new Product("Tea", 10.5, 5);
Product p2= new Product(p1);
p2.name="Coffee";
p2.display();
p1.display();
System.out.println(Product .totalProducts);

    }
}
