package org.launchcode.java.demos.HWexercises;

import java.util.ArrayList;

import static java.util.Arrays.asList;


/**
 * Created by Debbie on 3/2/2017.
 */
// gets sum's of even numbers from list



public class Ex1CountEven{

    public static void main(String[] args){
        ArrayList<Integer> numbers = new ArrayList<>(asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        Integer count = getSumOfEvens(numbers);

        System.out.println("The sum of the even numbers is: " + count);

    }

    private static Integer getSumOfEvens(ArrayList<Integer> numbers){
        Integer count = 0;
        for (Integer i : numbers){
            if (numbers.get(i) % 2 == 0){
                count += numbers.get(i);
            }
        }
        return count;
    }
}

