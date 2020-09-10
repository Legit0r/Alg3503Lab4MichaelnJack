import java.util.Scanner;
import java.util.Arrays;

public class main {

    public static void printArray(int[] inputArray) {
        for (Integer element : inputArray){
            System.out.printf("%s ", element);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        //b = bin size
        //n = number of nums
        //num[] = arr of all nums
        Scanner sc = new Scanner(System.in);

        System.out.println("Input Bin Size: ");
        int b = sc.nextInt();

        System.out.println("Input # of unsorted Numbers: ");
        int n = sc.nextInt();

        System.out.println("Enter all Nums: ");
        int num[] = new int[n];
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
            if(num.length > n){
                System.out.println("Oop");
                break;
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
