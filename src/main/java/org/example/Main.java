package org.example;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(calculate(i));
        }
    }

    public static String calculate(int number){
        String result = "";
        if (String.valueOf(number).contains("7")) {
            result = "GitHub";
        } else if (number % 3 == 0 && number % 5 == 0) {
            result = "fizzbuzz";
        } else if (number % 3 == 0) {
            result = "fizz";
        } else if (number % 5 == 0) {
            result = "buzz";
        } else {
            result = String.valueOf(number);
        }
        return result;
    }
}