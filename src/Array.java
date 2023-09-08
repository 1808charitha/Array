import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arraySize = Integer.parseInt(scan.nextLine()); //size=5
        int[] demoArray = new int[5]; //[0,0,0,0,0]
        for (int iterator = 0; iterator < arraySize; iterator++) {
            demoArray[iterator] = Integer.parseInt(scan.nextLine()); //[3,4,5,6,7]
        }
            // [1,2,3,4,5]
        sumOfArray(demoArray);
        // [15,15,15,15,15]

        for (int iterator : demoArray)
        {
            System.out.println(iterator);
        }
    }


    static int[] sumOfArray(int[] demoArray)
    {
        int sum = 0;
        for (int iterator : demoArray)
        {
            sum += iterator;
        }

        for (int iterator = 0; iterator < demoArray.length; iterator++)
        {
            demoArray[iterator] = sum;
        }

        return demoArray;
    }




}
