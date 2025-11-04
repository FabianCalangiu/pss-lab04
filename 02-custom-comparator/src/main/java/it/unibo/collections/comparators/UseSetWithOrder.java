package it.unibo.collections.comparators;

import java.util.Set;
import java.util.TreeSet;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
public final class UseSetWithOrder {

    private UseSetWithOrder() {
    }

    /**
     * @param s
     *            ignored
     */
    public static void main(final String[] s) {

        /*
         * Write a program which:
         * 
         * 1) Creates a new ORDERED TreeSet of Strings.
         * To order the set, define a new Comparator in a separate class.
         * The comparator must convert the strings to double, then compare the doubles to find the biggest.
         * The comparator does not need to deal with the case of Strings which are not parseable as doubles.
         */
        Comparator<String> ValueComparator = new SortByValue();
        TreeSet<String> setOfStrings = new TreeSet<>(ValueComparator);
        /*
         * 2) Inserts in the set a hundred strings containing randomly generated numbers
         * (use Math.random(), and convert to String appropriately)
         */
        String str;
        for(int i = 0; i < 100; i++){
            str = String.valueOf(Math.random());
            setOfStrings.add(str);
        }
        /*
         * 3) Prints the set, which must be ordered
         */
        System.out.println("'setOfStrings ordered TreeSet: " + setOfStrings);
    }
}
