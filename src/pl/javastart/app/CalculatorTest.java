package pl.javastart.app;

import pl.javastart.model.Calculator;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("Podaj dwie liczby:");
        int number1 = scanner.nextInt();
        scanner.nextLine();
        int number2 = scanner.nextInt();
        scanner.nextLine();

        calculator.compareNumbers(number1, number2);
        System.out.println(calculator.showResult());
        scanner.close();
    }
}
