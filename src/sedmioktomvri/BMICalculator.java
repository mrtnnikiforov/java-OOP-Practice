package sedmioktomvri;

import java.util.Scanner;

public class BMICalculator {
    public void printIntroduction(){
        System.out.println("This is a BMI calculator");
    }

    public double bmiFor(double weight, double height){
        return weight * 703 / (height * height);
    }

    public double getBMI(Scanner sc){
        System.out.println("Enter height in inches:");
        double height = sc.nextDouble();

        System.out.println("Enter weight in pounds:");
        double weight = sc.nextDouble();

        return bmiFor(weight, height);
    }

    public String getStatus(double bmi) {
        if (bmi <= 18.5)
        {
            return "underweight";
        }
        else if (bmi <= 25)
        {
            return "normal";
        }
        else if (bmi <= 30)
        {
            return "overweight";
        }
        else
        {
            return "obese";
        }
    }

    public void reportResults(int resultNumber, double bmi, String status){
        System.out.printf("Person %d has BMI = %.2f and status: %s.%n", resultNumber, bmi, status);
    }

}