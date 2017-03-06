package org.launchcode.java.demos.java4python;

/**
 * Created by Debbie on 3/2/2017.
 */
public class HwSamples {

    public static void main(String[] args) {
// this prints all items in list l
        int l[] = {1, 1, 2, 3, 5, 8, 13, 21};
        for(int i : l) {
            System.out.println(i);
        }
// this converts all strings to arrays
        String msg = "Hello World";
        for (char c : msg.toCharArray()) {
            System.out.println(c);
        }
// In this example, the variable item holds the current value from
// the numbers array


        int[] numbers =
                {1,2,3,4,5,6,7,8,9,10};
        for (int item : numbers) {
            System.out.println("Count is: " + item);
        }






    }
}
