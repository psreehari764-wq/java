import java.util.*;

interface Bill {
    void calculate();
}

class Product implements Bill {

    int productId;
    String name;
    int quantity;
    float unitPrice;
    float total;

    void getData(Scanner sc) {
        System.out.print("Enter product id: ");
        productId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter product name: ");
        name = sc.nextLine();

        System.out.print("Enter quantity: ");
        quantity = sc.nextInt();

        System.out.print("Enter unit price: ");
        unitPrice = sc.nextFloat();
    }

    public void calculate() {
        total = quantity * unitPrice;
    }

    void display() {
        System.out.printf("%-10d %-15s %-10d %-10.2f %-10.2f\n",
                productId, name, quantity, unitPrice, total);
    }

    float getTotal() {
        return total;
    }
}

public class co3_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter order number: ");
        int orderNo = sc.nextInt();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        Product[] products = new Product[n];
        float netAmount = 0;

        System.out.println("\nENTER PRODUCT DETAILS\n");

        for (int i = 0; i < n; i++) {
            products[i] = new Product();
            products[i].getData(sc);
            products[i].calculate();
            netAmount += products[i].getTotal();
            System.out.println();
        }

        System.out.println("\nOrder No: " + orderNo);
        System.out.println("Date: " + java.time.LocalDate.now());

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-15s %-10s %-10s %-10s\n",
                "ProdID", "Name", "Qty", "UnitPrice", "Total");
        System.out.println("--------------------------------------------------------------");

        for (Product p : products) {
            p.display();
        }

        System.out.println("--------------------------------------------------------------");
        System.out.printf("%40s %10.2f\n", "Net Amount:", netAmount);

        sc.close();
    }
}
