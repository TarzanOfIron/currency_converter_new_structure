package org.example;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class UserInterface {

    public static MyCurrency SEK = new MyCurrency(new BigDecimal("1"));
    public static MyCurrency USD = new MyCurrency(new BigDecimal("0.09"));
    public static MyCurrency EUR = new MyCurrency(new BigDecimal("0.087"));


    public static void startProgram () {
        System.out.println(Converter.convert(printMenuFromCurrency(), printMenuToCurrency(), enterAmountToExchange()));
        System.out.println(displayDateAndTime());
    }

    public static int printMenuFromCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What currency would you like to exchange?");
        System.out.println("1. SEK");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        return sc.nextInt();
    }

    public static int printMenuToCurrency() {
        Scanner sc = new Scanner(System.in);
        System.out.println("To what currency would you like to exchange to?");
        System.out.println("1. SEK");
        System.out.println("2. USD");
        System.out.println("3. EUR");
        return sc.nextInt();
    }

    public static BigDecimal enterAmountToExchange() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How much would you like to exchange? :");
        return sc.nextBigDecimal();
    }

    public static String displayDateAndTime () {
        LocalDateTime localDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd - HH:mm:ss");
        return localDateTime.format(dateTimeFormatter);
    }


}
