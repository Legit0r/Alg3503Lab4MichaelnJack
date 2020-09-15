/**
 * @Title: Algorithms 3501 Lab 4
 * @Author: Jack Perala, Michael ???, Elk Oswood (?)
 */

import java.util.ArrayList;
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

        // Bin one for packing
        ArrayList<Integer> binOne = new ArrayList<>();

        // Bin two for packing
        ArrayList<Integer> binTwo = new ArrayList<>();

        // Bin three for packing
        ArrayList<Integer> binThree = new ArrayList<>();

        // Bin for remaining numbers
        ArrayList<Integer> remainderBin = new ArrayList<>();

        int binOneSpace = b;

        int b1 = 0;

        int binTwoSpace = b;

        int b2 = 0;

        int binThreeSpace = b;

        int b3 = 0;

        int rB = 0;

        for (int i = 0; i < inputNums.size(); i++){

            if (inputNums.get(i) <= binOneSpace){
                binOne.add(inputNums.get(i));
                b1++;
                binOneSpace = binOneSpace - inputNums.get(i);
            }else if (inputNums.get(i) <= binTwoSpace){
                binTwo.add(inputNums.get(i));
                b2++;
                binTwoSpace = binTwoSpace - inputNums.get(i);
            } else if (inputNums.get(i) <= binThreeSpace){
                binThree.add(inputNums.get(i));
                b3++;
                binThreeSpace = binThreeSpace - inputNums.get(i);
            } else {
                remainderBin.add(inputNums.get(i));
                rB++;
            }
        }

        System.out.println("Bin one contents:");
        for (int number : binOne){
            System.out.println(number);
        }
        System.out.println("\n");

        System.out.println("Bin two contents:");
        for (int number : binTwo){
            System.out.println(number);
        }
        System.out.println("\n");

        System.out.println("Bin three contents:");
        for (int number : binThree){
            System.out.println(number);
        }
        System.out.println("\n");

        System.out.println("Integers that could not fit into available bins:");
        for (int number : remainderBin){
            System.out.println(number);
        }
    }
}
