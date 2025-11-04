package it.unibo.collections.sets;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Collection;
import java.util.Iterator;
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
        TreeSet<String> setOfStrings = new TreeSet<>(); 
        /*
         * 2) Populates such Collection with all the Strings representing numbers ranging from "1" to
         * "20" (both included)
         */
        String num;
        for(int i = 1; i < 21; i++){
            num = String.valueOf(i);
            setOfStrings.add(num);
        }
        /*
         * 3) Prints its content
         */
        System.out.println("The TreeSet 'setStrings' contains: " + setOfStrings);
        /*
         * 4) Removes all those strings whose represented number is divisible by three.
         * Note: the method removeIf(Predicate) is not allowed.
         */
        int n;

        TreeSet<String> toRemove = new TreeSet<>();
        for(String s : setOfStrings){
            n = Integer.parseInt(s);
            if(n % 3 == 0){
                toRemove.add(s);
            }
        }

        setOfStrings.removeAll(toRemove);
        System.out.println("The TreeSet 'setStrings' now contains: " + setOfStrings);
        /*
         * 5) Prints the content of the Set using a for-each construct
         */
        for(String s : setOfStrings){
            System.out.println(s);
        }
        /*
         * 6) Verifies whether all the numbers left in the set are even
         */
        boolean allEven = true;

        for(String s : setOfStrings){
            n = Integer.parseInt(s);
            if(n % 2 != 0){
                allEven = false;
                break;
            }
        }

        System.out.println("Are all items in 'setOfStrings' even? " + allEven);
    }
}
