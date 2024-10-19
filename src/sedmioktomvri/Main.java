package sedmioktomvri;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        BMICalculator calculator = new BMICalculator();
        Scanner scanner = new Scanner(System.in);

        calculator.printIntroduction();
        double bmi = calculator.getBMI(scanner);
        String status = calculator.getStatus(bmi);
        calculator.reportResults(1, bmi, status);

        scanner.close();
    }
}