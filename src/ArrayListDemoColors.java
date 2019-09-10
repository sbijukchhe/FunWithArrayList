/*
Try the following exercises:

Write a Java program to create a new array list to hold colors.
Add at least 3 colors (string) to the array list and print out all its values.
Using the array list created above, print out the value at index 1.
Using the array list above, prompt the user for one new color, and add that color to the array list.
Using the array list, continue prompting the user for colors until they type in "Q" or "q" to quit.
Each time the user enters a color, add that to the array list. Print out the list at the end.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayListDemoColors {

    public static void main(String[] args) {

        String newColor = "";

        // creating array
        ArrayList<String> al = new ArrayList<>();

        // printing all the values of array
        System.out.println("Contents of arraylist" + al);

        al.add("White");
        al.add("Black");
        al.add("Green");
        al.add("Red");

        // printing all the values of array
        System.out.println("Contents of arraylist" + al);

        // printing value at index 1
        System.out.println(al.get(1));

        // prompting user to provide new color
        System.out.println("\nPlease enter a color: ");
        Scanner input = new Scanner(System.in);

        while (!(newColor.equalsIgnoreCase("q"))) {

            newColor = input.next();
            al.add(newColor);

            // printing a list of colors after users add
            System.out.println("------------------------------------------------------------------------------------");
            System.out.println("Contents of arraylist after adding " + al);
            System.out.println("------------------------------------------------------------------------------------");

            System.out.println("\nPlease add more colors");
            System.out.println("Or, press \"Q\" to quit !!!");

        }
    }
}
