package org.example;

import java.math.BigDecimal;

public class Currency {

    BigDecimal oneSEKequals;

    public BigDecimal convertToSek (BigDecimal amount) {
        return amount.divide(oneSEKequals);
    }

    public BigDecimal convertFromSek (BigDecimal amount) {
        return amount.multiply(oneSEKequals);
    }
}
