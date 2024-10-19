package lab1;
import java.util.Scanner;

public class discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("What loyalty level are you: ");
        int level = sc.nextInt();
        double discount = 0;
        if (level > 10){
            discount = 0.1;
        } else if (5 <= level && level < 10) {
            discount = 0.07;
        }
        else {
            discount = 0.05;
        }
        System.out.println("Product price: ");
        double purchaseAmount = sc.nextDouble();
        double newAmount = purchaseAmount * (1 - discount);
        System.out.printf("You are %s, your old price is %.2f and the new one is %.2f", name, purchaseAmount, newAmount);
    }
}
