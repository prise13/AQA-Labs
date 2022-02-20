package day_2;
import java.util.Arrays;

public class ArraysTask {
    public static void main(String [] args) throws Exception {
        double [] array = new double[]{5, 9, 3, 2, 0, -4, -8.3, 3, -4};
        int [] array2 = new int[]{1, 6, 3, 3, 4, 5, 5, 6, 0,6,4};
        String [] array3 = new String[] {"12", "23", "34", "12", "56", "67"};
        System.out.println(getMaxValue(array));
        printArray(getUniqueArrayValues(array2));
        System.out.println();
        printArray(replaceAll(array3, "12", "replaced"));
        System.out.println();
        printReversed(array2);
    }


    // Returns the maximum value in double array
    private static double getMaxValue(double[] array) throws Exception {
        double maxValue = 0;
        if (array.length != 0) {
            maxValue = array[0];
            for (double value : array) {
                if (value > maxValue) {
                    maxValue = value;
                }
            }
        }
        else {
            throw new Exception("Given array is empty!");
        }
        return maxValue;
    }

    // Returns sorted int array with unique values
    private static int[] getUniqueArrayValues(int [] array) throws Exception {
        if (array.length != 0) {
            int [] uniqueArr = new int[array.length+1];
            int count = 0;
            for (int value : array) {
                if (!contains(value, uniqueArr)) {
                    uniqueArr[count] = value;
                    count++;
                }
                count++;
            }
            Arrays.sort(uniqueArr);
            return uniqueArr;
        }
        throw new Exception("Given array is empty!");
    }

    // Returns true if array contains element, and false if not
    private static boolean contains(int x, int[] array) {
        for(int value : array) {
            if (value == x) {
                return true;
            }
        }
        return false;
    }

    // Replaces all specified values in String array with new value
    private static String[] replaceAll(String[] array, String value, String newValue) throws Exception {
        if (array.length != 0) {
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(value)) {
                    array[i] = newValue;
                }
            }
            return array;
        }
        throw new Exception("Given array is empty!");
    }

    // Prints reversed int array
    private static void printReversed(int [] array) {
        for (int i = array.length-1; i>=0;i--) {
            System.out.print(array[i] + " ");
        }
    }

    // Prints int array elements
    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }
    // Prints string array elements
    private static void printArray(String[] array) {
        for (String value: array) {
            System.out.print(value + " ");
        }
    }
}
