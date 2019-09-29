package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("The sum of the digits in number 125 is " + sumDigits(125));
        System.out.println("The sum of the digits in number -125 is " + sumDigits(-125));
        System.out.println("The sum of the digits in number 4 is " + sumDigits(4));
        System.out.println("The sum of the digits in number 32123 is " + sumDigits(32123));
    }

    public static int sumDigits(int number){
        if(number < 10){
            return -1;
        }
        int sum = 0;
        //125 --> 125 / 10 = 12 --> 12 * 10 = 120 --> 125 -120 = 5
        while(number > 0){
            //extract least-significant digit
            int digit = number % 10;
            sum += digit;

            //drop the least-significant
            number /= 10;  // number = number / 10

        }
        return sum;

    }
}
