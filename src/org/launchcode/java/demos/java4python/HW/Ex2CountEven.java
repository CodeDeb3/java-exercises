package org.launchcode.java.demos.java4python.HW;

import java.util.ArrayList;

import static java.util.Arrays.asList;

// count all even numbers in a list

/**
 * Created by Debbie on 3/2/2017.
 */
public class Ex2CountEven {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(asList(1,2,3,4,5,6,7,8,9,10));

        Integer count = getSumOfEvens(numbers);

        System.out.println("The sum of the even numbers is: " + count);
    }

    private static Integer getSumOfEvens(ArrayList<Integer> numbers) {
        Integer count = 0;
        for(Integer i : numbers) {
            if(i % 2 == 0){
                count += i;
            }
        }
        return count;
    }
}
