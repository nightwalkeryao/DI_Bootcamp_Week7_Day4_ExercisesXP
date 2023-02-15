package Exercise2;

import java.util.Scanner;

public class Calculus {
    private double number1 = 0;
    private double number2 = 0;
    private double number3 = 0;

    public Calculus(double number1, double number2, double number3) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber3() {
        return number3;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public double getProduct() {
        return number1 * number2 * number3;
    }

    public double getAverage() {
        return getSum() / 3;
    }

    public double getSum() {
        return number1 + number3 + number3;
    }

    public double getLargest() {
        return Math.max(Math.max(number1, number2), number3);
    }

    public double getSmallest() {
        return Math.min(Math.min(number1, number2), number3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        double number1 = sc.nextDouble();
        System.out.println("Enter number 2: ");
        double number2 = sc.nextDouble();
        System.out.println("Enter number 3: ");
        double number3 = sc.nextDouble();

        Calculus calc = new Calculus(number1, number2, number3);
        System.out.println("Product: " + calc.getProduct());
        System.out.println("Average: " + calc.getAverage());
        System.out.println("Sum: " + calc.getSum());
        System.out.println("Largest: " + calc.getLargest());
        System.out.println("Smallest: " + calc.getSmallest());
    }
}
