package it.unibo.collections.sets;

import java.util.Collection;
import java.util.TreeSet;

/**
 * Example class using {@link java.util.Set}.
 *
 */
public final class UseSet {

    private static final int ELEMS = 20;

    private UseSet() {
    }

    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
        /*
         * Considering the content of "UseCollection, write a program which, in
         * order:
         *
         * 1) Builds a TreeSet containing Strings
         */
        TreeSet<String> setStrings = new TreeSet<>(); 
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        String num;
        for(int i = 1; i < 21; i++){
            num = String.valueOf(i);
            setStrings.add(num);
        }
        /*
         * 3) Prints its content
         */
        System.out.println("The TreeSet 'setStrings' contains: " + setStrings);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
    }
}
