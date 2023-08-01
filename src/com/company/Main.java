package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("Enter an operator (+,-,*,/)");
        char op = sc.next().charAt(0);

        switch (op){
            case '+'-> System.out.println(num1+" + "+num2+" = "+(num1+num2));
            case '-' -> System.out.println(num1+" - "+num2+" = "+(num1-num2));
            case '*'-> System.out.println(num1+" * "+num2+" = "+(num1*num2));

        }



    }

}





























//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a date (MM/DD/YYYY)");
//        String date = sc.next();
//
//        if (date.length() == 10) {
//
//            int month = Integer.parseInt(date.substring(0, 2));
//            int day = Integer.parseInt(date.substring(3, 5));
//            int year = Integer.parseInt(date.substring(6));
//
//            if ((month >= 1 && month <= 12) && (day >= 1 && day <= 31) && month >= 1) {
//                if (year % 4 == 0) {
//                    if (month == 02 && (day >= 1 && day <= 29)) {
//                        System.out.println("Valid Leap Year Date!");
//                    } else if (month != 02 && (day >= 1 && day <= 31)) {
//                        System.out.println("Valid date! ");
//                    } else {
//                        System.out.println("Invalid date!");
//                    }
//                }
//                else {
//                    if (month != 02 && (day >= 1 && day <= 31)) {
//                        System.out.println("Valid Date!");
//                    } else if (month == 02 && (day >= 1 && day <= 28)) {
//                        System.out.println("Valid Date");
//                    } else {
//                        System.out.println("Invalid Date");
//                    }
//                }
//            }
//            else {
//                System.out.println("Not valid");
//            }
//
//        }
//        else if(date.length() == 9) {
//            int index = date.indexOf("/");
//            if(index == 1){
//                    // Month is of single digit
//
//                int month = Integer.parseInt(date.substring(0,1));
//                int day = Integer.parseInt(date.substring(2,4));
//                int year = Integer.parseInt(date.substring(5));
//
//                    if(year %4 ==0){
//                        //For leap year!
//                        if ((month == 2) && (day>=1 && day<=29)){
//                            System.out.println("Valid leap year day!");
//                        }
//                        else if((month!=2) && (day>=1 && day<=31)){
//                            System.out.println("Valid date!");
//                        }
//                        else{
//                            System.out.println("Invalid date!");
//                        }
//                    }
//                    else{
//                        //For Non-leap year!
//                        if ((month == 2) && (day>=1 && day<=28)){
//                            System.out.println("Valid leap year day!");
//                        }
//                        else if((month!=2) && (day>=1 && day<=31)){
//                            System.out.println("Valid date!");
//                        }
//                        else{
//                            System.out.println("Invalid date!");
//                        }
//
//                    }
//
//            }
//            else {
//                    // Day is of single digit
//                int month = Integer.parseInt(date.substring(0,2));
//                int day = Integer.parseInt(date.substring(3,4));
//                int year = Integer.parseInt(date.substring(5));
//
//                if(year %4 ==0){
//                    //For leap year!
//                    if ((month == 2) && (day>=1 && day<10)){
//                        System.out.println("Valid Date!");
//                    }
//                    else if((month!=2) && (day>=1 && day<10)){
//                        System.out.println("Valid date!");
//                    }
//                    else{
//                        System.out.println("Invalid date!");
//                    }
//                }
//                else{
//                    //For Non-leap year!
//                    if ((month == 2) && (day>=1 && day<10)){
//                        System.out.println("Valid leap year day!");
//                    }
//                    else if((month!=2) && (day>=1 && day<10)){
//                        System.out.println("Valid date!");
//                    }
//                    else{
//                        System.out.println("Invalid date!");
//                    }
//
//                }
//
//            }
//
//        }
//        else if(date.length() == 8 ){
//
//            int day =0,month = 0,year=0;
//            try {
//                month = Integer.parseInt(date.substring(0,1));
//                day = Integer.parseInt(date.substring(2,3));
//                year = Integer.parseInt(date.substring(4));
//            }catch (Exception e){
//                System.out.println(e);
//            }
//
//
//        }





















//
//        System.out.println("Enter 3 numbers");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        int first = 0;
//        int second = 0;
//        int third = 0;
//
//        if(a<=b && a<=c){
//            first = a;
//            if(b<=c){
//                second = b;
//                third = c;
//            }
//            else{
//                second = c;
//                third = b;
//            }
//        }
//        else if (b<=a && b<=c) {
//            first = b;
//            if(a<=c){
//                second = a;
//                third = c;
//            }
//            else{
//                second = c;
//                third = a;
//            }
//
//        }
//        else if(c<=a && c<=b){
//            first = c;
//            if(a<=b){
//                second = a;
//                third = b;
//            }
//            else{
//                second = b;
//                third = a;
//            }
//        }
//        else{
//            System.out.println("Incorrect input!");
//        }
//
//        System.out.println("The accesending order is: "+first +" "+second+" "+third);
//




















































