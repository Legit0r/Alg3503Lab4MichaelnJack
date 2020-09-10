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
        //b = bin size
        //n = number of nums
        //num[] = arr of all nums
        Scanner sc = new Scanner(System.in);

        System.out.println("Input desired bin size:");
        int b = sc.nextInt();

        System.out.println("Input number of integers to sort: ");
        int n = sc.nextInt();

        System.out.println("Enter the integers to be sorted");
        int maxCapacity = 0;
        int[] num = new int[n];
        while (maxCapacity != n) {
            int inputNum = sc.nextInt();
            if (inputNum > b) {
                System.out.println("Integers must be less than or " +
                        "equal to the size of the bin.");
            } else {
                num[maxCapacity] = inputNum;
                maxCapacity++;
            }
        }
        printArray(num);
        //new main().binSort(num, n, b)
    }
//    3 Bins MAX
//    Minimize amount of unused bin space
//
//    Scanner
//    Input: Takes in Bin Size, # of Nums, and Nums themselves
//    Output: Elements in each bin, list of unpacked items, amount of unused space

}
