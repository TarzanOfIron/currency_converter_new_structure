package org.example;

import java.math.BigDecimal;

public class Converter {
    static MyCurrency SEK = UserInterface.SEK;
    static MyCurrency USD = UserInterface.USD;
    static MyCurrency EUR = UserInterface.EUR;

    public static BigDecimal convert(int optionOne, int optionTwo, BigDecimal amount) {
        return switch (optionTwo) {
            case 1 -> SEK.convertFromSek(convertFrom(optionOne,amount));
            case 2 -> USD.convertFromSek(convertFrom(optionOne,amount));
            case 3 -> EUR.convertFromSek(convertFrom(optionOne,amount));
            default -> new BigDecimal("0");
        };
    }

  public static BigDecimal convertFrom (int optionOne, BigDecimal amount) {
       return switch (optionOne) {
           case 1 -> SEK.convertToSek(amount);
           case 2 -> USD.convertToSek(amount);
           case 3 -> EUR.convertToSek(amount);
           default -> new BigDecimal("0");
       };
   }
}
