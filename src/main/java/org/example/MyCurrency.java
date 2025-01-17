package org.example;

import java.math.BigDecimal;

public class MyCurrency {

    private BigDecimal oneSEKequals;
    //MathContext mc = new MathContext(3, RoundingMode.HALF_UP);

    public MyCurrency (BigDecimal value) {
        this.oneSEKequals = value;
    }

    public BigDecimal convertToSek (BigDecimal amount) {
        return amount.divide(oneSEKequals);
    }

    public BigDecimal convertFromSek (BigDecimal amount) {
        return amount.multiply(oneSEKequals);
    }
}
