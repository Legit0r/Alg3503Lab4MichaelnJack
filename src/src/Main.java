/**
 * @Title: Algorithms 3501 Lab 4
 * @Author: Jack Perala, Michael ???, Elk Oswood (?)
 */

import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void printArray(int[] inputArray) {
        for (Integer element : inputArray) {
            System.out.printf("%s ", element);
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Input desired bin size:");
        int b = sc.nextInt();

        System.out.println("Input number of integers to sort: ");
        int n = sc.nextInt();

        System.out.println("Enter the first integer to be sorted");
        int maxCapacity = 0;
        int[] inputNums = new int[n];
        while (maxCapacity != n) {
            int inputNum = sc.nextInt();
            if (inputNum > b) {
                System.out.println("Integers must be less than or " +
                        "equal to the size of the bin.");
            } else {
                inputNums[maxCapacity] = inputNum;
                maxCapacity++;
                if (n - maxCapacity > 1) {
                    System.out.println("Please enter " + (n - maxCapacity) + " more integers.");
                } else {
                    System.out.println("Please enter 1 more integer.");
                }
            }
        }
        System.out.print(Arrays.toString(inputNums) + " ");

        System.out.println("\n");

        // Bin one for packing
        int[] binOne = new int[b];

        // Bin two for packing
        int[] binTwo = new int[b];

        // Bin three for packing
        int[] binThree = new int[b];

        // Bin for remaining numbers
        int[] remainderBin = new int[b];

        int binOneSpace = b;

        int b1 = 0;

        int binTwoSpace = b;

        int b2 = 0;

        int binThreeSpace = b;

        int b3 = 0;

        int rB = 0;

        for (int i = 0; i < inputNums.length; i++){

            if (inputNums[i] <= binOneSpace){
                binOne[b1] = inputNums[i];
                b1++;
                binOneSpace = binOneSpace - inputNums[i];
            }else if (inputNums[i] <= binTwoSpace){
                binTwo[b2] = inputNums[i];
                b2++;
                binTwoSpace = binTwoSpace - inputNums[i];
            } else if (inputNums[i] <= binThreeSpace){
                binThree[b3] = inputNums[i];
                b3++;
                binThreeSpace = binThreeSpace - inputNums[i];
            } else {
                remainderBin[rB] = inputNums[i];
                rB++;
            }
        }

        System.out.println("Bin one contents");
        for (int number : binOne){
            System.out.println(number);
        }
        System.out.println("\n");

        System.out.println("Bin two contents");
        for (int number : binTwo){
            System.out.println(number);
        }
        System.out.println("\n");

        System.out.println("Bin three contents");
        for (int number : binThree){
            System.out.println(number);
        }
        System.out.println("\n");
    }
}
