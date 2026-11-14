import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   // reading input: provided for you
        Product[] products = new Product[10];  // an array with room for 10 products
        int count = 0;                         // how many products are stored so far
        int choice;
        do {
            System.out.println("\n--- Campus Cafe Inventory ---");
            System.out.println("1. Add product");
            System.out.println("2. Display all products");
            System.out.println("3. Total stock value");
            System.out.println("4. Average price");
            System.out.println("5. Restock a product");
            System.out.println("6. Duplicate a product");
            System.out.println("0. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();   // clears the leftover newline after nextInt()
            if (choice < 0 || choice > 6) {
                System.out.println("Invalid choice, try again.");
            }
            switch (choice) {
                
                case 1:
                    String addMore = "yes";
                    do {
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Quantity: ");
                    int quantity = sc.nextInt();
                    sc.nextLine();

                    if(price<=0||quantity<0)
                    {
                        System.out.println("Enter the Price and Quantity Greater than 0");
                    }
                    if(count>10)
                    {
                        System.out.println("Cant add more products, stock is full");
                    }
                    else {
                            Product p = new Product(name, price, quantity);
                            products[count] = p;
                            count++;
                            System.out.println("Do u want to add more");
                            addMore=sc.nextLine();
                        } 
                    }while(!addMore.toLowerCase().equals("no"));
                     break;
                case 2:
                   if(count==0)
                       System.out.println("No Products are there");
                   else {
                       for (int i = 0; i <= count-1; i++) {
                           System.out.println(i+1 +" "+products[i].name+" "+products[i].quantity);

                       }
                   }
                    break;
                case 3:
                    double stockValue=0.0;
                    for (int i = 0; i <= count-1; i++) {
                        stockValue = stockValue + products[i].stockValue();
                    }
                    System.out.println(stockValue );
                    break;
                case 4:
                    double totalPrice=0.0;
                    double totalCount=0;
                    if(count==0)
                    {
                        System.out.println("We dont have any item");
                        break;
                    }
                    for (int i = 0; i <=count-1; i++) {
                        totalPrice=totalPrice+(products[i].stockValue());
                        totalCount=totalCount+products[i].quantity;
                    }
                  System.out.println("Average  "+ totalPrice/totalCount);
                    System.out.println("Rounding Down "+ (int)(totalPrice/totalCount));
                    break;
                case 5:
                    System.out.print("Product number: ");
                    int num = sc.nextInt();
                    System.out.print("Quantity to add: ");
                    int extra = sc.nextInt();
                    sc.nextLine();
                    if (num>=1 && num<=count && extra>0)
                    {
                        products[num-1].quantity+=extra;
                    }
                    else if(num>count)
                    {
                        System.out.println("Wrong Product Number");
                    }
                    else {
                        System.out.println("Enter valid Quantity");
                    }
                    break;
                case 6:
                    System.out.print("Product number: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                   if(n>0 && n<=count && count<=10)
                   { Product p=new Product(products[n-1]);
                      p.name=p.name+"copy";
                      products[count]=p;
                      count++;
                   }
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (choice != 0);
        System.out.println("Products created in total: " + Product.totalProducts);
    }
}
