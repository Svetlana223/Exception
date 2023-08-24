package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        System.out.println(ask());
    }

    public static Double ask(){

        Scanner sc = new Scanner(System.in);
        System.out.printf("Введите число: ");
        Double num = sc.nextDouble();
        System.out.println();

        try {
            double n = num;
        } catch (Exception e){
            System.out.println("err");
        }
        return num;
    }

}
