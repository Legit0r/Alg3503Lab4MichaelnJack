/*
  @Title: Algorithms 3501 Lab 4
 * @Author: Jack Perala, Michael ???, Elk Oswood (?)
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Setting up the scanner.
        Scanner sc = new Scanner(System.in);

        // Reads the user input to determine the size of each bin.
        System.out.println("Input desired bin size:");
        int b = sc.nextInt();

        // Reads the user input to determine the number of integers that will be sorted into bins.
        System.out.println("Input number of integers to sort: ");
        int n = sc.nextInt();

        // Reading the user inputs to place integers into an ArrayList to later be sorted into bins.
        System.out.println("Enter the first integer to be sorted");
        int maxCapacity = 0;
        ArrayList<Integer> inputNums = new ArrayList<>();
        while (maxCapacity != n) {
            int inputNum = sc.nextInt();
            if (inputNum > b) {
                System.out.println("Integers must be less than or " +
                        "equal to the size of the bin.");
            } else {
                inputNums.add(inputNum);
                maxCapacity++;
                if (n - maxCapacity > 1) {
                    System.out.println("Please enter " + (n - maxCapacity) + " more integers.");
                } else {
                    System.out.println("Please enter 1 more integer.");
                }
            }
        }

        System.out.println("\n");

        // Bin one for packing.
        ArrayList<Integer> binOne = new ArrayList<>();

        // Bin two for packing.
        ArrayList<Integer> binTwo = new ArrayList<>();

        // Bin three for packing.
        ArrayList<Integer> binThree = new ArrayList<>();

        // Bin for remaining numbers.
        ArrayList<Integer> remainderBin = new ArrayList<>();

        // Setting up variable counters to check if the first available bin has enough space.
        int binOneSpace = b;
        int binTwoSpace = b;
        int binThreeSpace = b;

        // Iterating through the input numbers to see which bin they fit into first.
        for (Integer inputNum : inputNums) {

            if (inputNum <= binOneSpace) {
                binOne.add(inputNum);
                binOneSpace = binOneSpace - inputNum;
            } else if (inputNum <= binTwoSpace) {
                binTwo.add(inputNum);
                binTwoSpace = binTwoSpace - inputNum;
            } else if (inputNum <= binThreeSpace) {
                binThree.add(inputNum);
                binThreeSpace = binThreeSpace - inputNum;
            } else {
                remainderBin.add(inputNum);
            }
        }

        // Printing the contents of bin one.
        int count = 0;
        System.out.println("Bin one of size " + b + " contains integers:");
        System.out.print("[");
        for (int number : binOne){
            if(count > 0){
                System.out.print(", ");
            }
            System.out.print(number);
            count++;
        }
        System.out.print("]");
        System.out.println("\n");

        // Printing the contents of bin two.
        System.out.println("Bin two of size " + b + " contains integers:");
        System.out.print("[");
        count = 0;
        for (int number : binTwo){
            if(count > 0){
                System.out.print(", ");
            }
            System.out.print(number);
            count++;
        }
        System.out.print("]");
        System.out.println("\n");

        // Printing the contents of bin three.
        System.out.println("Bin three of size " + b + " contains integers:");
        System.out.print("[");
        count = 0;
        for (int number : binThree){
            if(count > 0){
                System.out.print(", ");
            }
            System.out.print(number);
            count++;
        }
        System.out.print("]");
        System.out.println("\n");

        // Printing the integers that could not fit into the available bins.
        System.out.println("Integers that could not fit into available bins:");
        System.out.print("[");
        count = 0;
        for (int number : remainderBin){
            if(count > 0){
                System.out.print(", ");
            }
            System.out.print(number);
            count++;
        }
        System.out.print("]");
    }
}
