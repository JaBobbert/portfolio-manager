package com.pluralsight.finance;


import java.math.BigDecimal;

public abstract class  FixedAsset implements Valuable {
    private String name;

    public FixedAsset(String name){

    }

    @Override
    public BigDecimal getValue(){
        return BigDecimal.ZERO;
    }

}
