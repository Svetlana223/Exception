package org.example.homework2;


import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();
            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();
            double result = division(num1, num2);
            System.out.println("Результат: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double division(double num1, double num2)
            throws DivisionByZeroException {
        if (num2 == 0) {
            throw new DivisionByZeroException("Деление на 0 невозможно");
        }
        return num1 / num2;
    }
}
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}
