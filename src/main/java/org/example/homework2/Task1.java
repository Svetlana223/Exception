package org.example.homework2;

import java.util.Scanner;

public class Task1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Введите число: ");
            double num1 = scanner.nextDouble();
            positive(num1);
            System.out.println("Число корректно");
        } catch (InvalidInputException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double positive(double num1)
            throws InvalidInputException{
        if (num1 <= 0) {
            throw new  InvalidInputException("Некорректное число");
        }
        return num1;
    }
}
class InvalidInputException extends Exception {
    public InvalidInputException(String message) {
        super(message);
    }
}



