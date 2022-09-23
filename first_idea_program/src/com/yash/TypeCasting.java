package com.yash;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a number : ");
        float num1 = input.nextFloat();
        //int num2 = input.nextInt(); this will not work if you provide a float value
        System.out.println("The number entered is : " + num1);

        //TypeCasting
        int num3 = (int)(76.43f);
        System.out.println(num3);

        //Automatic type promotion in expressions
    }
}
