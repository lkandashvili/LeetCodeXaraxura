package org.example;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;


public class ConvertTheTemperature {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(convertTemperature(36.50)));
    }

    public static double[] convertTemperature(double celsius) {
        double[] answer = new double[2];
        answer[0] = celsius + 273.15;
        answer[1] = celsius * 1.80 + 32.00;
        return answer;
    }
}
