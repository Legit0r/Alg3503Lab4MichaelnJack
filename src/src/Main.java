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

        // Sorting the array of input integers
        Arrays.sort(inputNums);
        System.out.println("Sorted array: ");
        for (int number : inputNums){
            System.out.println(number);
        }
    }
}
