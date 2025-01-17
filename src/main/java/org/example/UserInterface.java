package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {

    public static void startProgram () {
        //collectUserInput();
        System.out.println(displayDateAndTime());
    }

    public static void printMenuFromValue () {
        System.out.println("What currency would you like to exchange?");
        System.out.println("1. SEK");
        System.out.println("2. USD");
        System.out.println("3. EUR");
    }

    public static void printMenuToValue () {
        System.out.println("To what currency would you like to exchange to?");
        System.out.println("1. SEK");
        System.out.println("2. USD");
        System.out.println("3. EUR");
    }

    public static void enterAmount () {
        System.out.println("How much would you like to exchange? :");
    }

    public static void collectUserInput() {
        Scanner sc = new Scanner(System.in);
        int optionOne, optionTwo;
        printMenuFromValue();
        optionOne = sc.nextInt();
        printMenuFromValue();
        optionTwo = sc.nextInt();
    }

    public static String displayDateAndTime () {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd - HH:mm:ss");
        return localDateTime.format(dateTimeFormatter);
    }


}
