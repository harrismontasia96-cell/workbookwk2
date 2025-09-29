package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("please Enter your name: ");
        System.out.print("first name");
                String firstname = myscanner.nextLine();

        System.out.print("Middle name");
                String middlename = myscanner.nextLine();

        System.out.print("Last name");
                String lastname = myscanner.nextLine();

                System.out.print("Suffix");
                String suffix = myscanner.nextLine();

                System.out.println(firstname + " " + middlename + " " + lastname + " " + suffix);







    }
}
