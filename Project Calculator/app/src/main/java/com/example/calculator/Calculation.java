package com.example.calculator;

public class Calculation {

    private double value1;
    private double value2;

    public Calculation() {
        value1 = 0;
        value2 = 0;
    }

    public String Operation_Conversion(String text){
        value1 = Double.parseDouble(text);
        value2 = value1 * (-1);

         return String.valueOf(value2);
    }

    public String Operation_Plus(String text1, String text2){
        value1 = Double.parseDouble(text1);
        value2 = Double.parseDouble(text2);

        return String.valueOf(value1+value2);
    }

}
