import java.util.Scanner;
public class PurchasePrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of a product: ");
        float unit_price = sc.nextFloat();
        System.out.println("Enter the quantity: ");
        float quantity = sc.nextFloat();
        float total_sales = unit_price * quantity;
        System.out.println("The total purchase price is "+total_sales+" if the quantity "+quantity+" and unit price is "+unit_price);
    }
}
