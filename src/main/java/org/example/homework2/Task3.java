//package org.example.homework2;
//
//import java.util.Scanner;
//
//public class Task3 {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        try {
//            System.out.print("Введите первое число: ");
//            int num1 = scanner.nextInt();
//
//            System.out.print("Введите второе число: ");
//            int num2 = scanner.nextInt();
//
//            System.out.print("Введите третье число: ");
//            int num3 = scanner.nextInt();
//
//            double result = check(num1, num2, num3);
//            System.out.println("Результат: " + result);
//        } catch (ArithmeticException e) {
//            System.out.println("Ошибка: " + e.getMessage());
//        } catch (Exception e) {
//            System.out.println("Произошла ошибка: " + e.getMessage());
//        }
//    }
//
//    public static double check(int num1, int num2, int num3)
//            throws NumberOutOfRangeException, NumberSumException, DivisionByZeroException2 {
//        switch (num1) {
//            case '1':
//                if (num1 > 100) {
//                    throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
//                }
//                return 1;
//            case '2':
//                if (num2 < 0) {
//                    throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
//                }
//                return 2;
//            case '3':
//                if ((num1+num2) < 10) {
//                    throw new NumberSumException("Сумма первого и второго чисел слишком мала");
//                }
//                return 3;
//            case '4':
//                if (num3 == 0) {
//                    throw new DivisionByZeroException2("Деление на ноль недопустимо");
//                }
//                return 3;
////            default:
////                throw new InvalidInputException("Невозможная операция");
//        }
//    }
//}
//
//class NumberSumException extends Exception {
//    public NumberSumException(String str) {
//        super(str);
//    }
//}
//
//class NumberOutOfRangeException extends Exception {
//    public NumberOutOfRangeException(String str) {
//        super(str);
//    }
//}
//class DivisionByZeroException2 extends Exception {
//    public DivisionByZeroException2(String str) {
//        super(str);
//    }
//}