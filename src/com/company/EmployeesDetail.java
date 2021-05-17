package com.company;

import java.util.Scanner;
import java.util.Date;
import java.time.LocalDate;

public class EmployeesDetail {

    public static void main(String[] args) {
        // write your code here
//        System.out.println(" Name : John" + "\n" +
//                " Address : 27th Ave '9th' Mill  " + "\n" +
//                " File : C:/john");
        System.out.println("Please enter DOB =" );
        Scanner do1 = new Scanner(System.in);
        int dob = Integer.parseInt(do1.nextLine());

        Date d = new Date();
        LocalDate currentd = LocalDate.now();
        int year = currentd.getYear();

        int diff = year - dob;

        System.out.println("You are " + diff + " year.");





        System.out.println("Please enter price for 1st item =" );
        Scanner op1 = new Scanner(System.in);
        int p1 = Integer.parseInt(op1.nextLine());
        System.out.println("Please enter price for 2nd item =" );
        Scanner op2 = new Scanner(System.in);
        int p2 = Integer.parseInt(op2.nextLine());
        System.out.println("Please enter price for 3rd item =" );
        Scanner op3 = new Scanner(System.in);
        int p3 = Integer.parseInt(op3.nextLine());
        System.out.println("Please enter price for 4th item =" );
        Scanner op4 = new Scanner(System.in);
        int p4 = Integer.parseInt(op4.nextLine());
        System.out.println("Please enter price for 5th item =" );
        Scanner op5 = new Scanner(System.in);
        int p5 = Integer.parseInt(op5.nextLine());

        int total = p1 + p2+ p3+ p4+ p5;
        System.out.println("Total price = " +  total);




    }

}
