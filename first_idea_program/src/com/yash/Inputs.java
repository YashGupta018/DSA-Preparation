package com.yash;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your roll number : ");
        int rollno = input.nextInt();
        System.out.println("Your roll number is : " + rollno);

        int a = 234_000_000;
        System.out.println(a);

        Scanner name = new Scanner(System.in);
        String name_1 = name.next();
        System.out.println(name_1);

        String name_2 = name.nextLine();
        System.out.println(name_2);

        Scanner myname = new Scanner(System.in);
        String name_3 = myname.nextLine();
        System.out.println(name_3);

        float marks = input.nextFloat();
        System.out.println(marks);

    }
}
