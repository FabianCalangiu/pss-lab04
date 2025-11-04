package it.unibo.collections.comparators;

import java.util.Comparator;

public class SortByValue implements Comparator<String>{
    @Override
    public int compare(String s1, String s2){
        double num1 = Double.parseDouble(s1);
        double num2 = Double.parseDouble(s2);

        if(num1 > num2) return 1;
        if(num1 < num2) return -1;
        return 0;
    }
}
