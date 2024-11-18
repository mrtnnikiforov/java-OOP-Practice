package lab1;

import java.util.Scanner;

public class yearBorn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age: ");
        int age = sc.nextInt();
        System.out.printf("You were born in %d", 2024-age);
    }
}
