package BinarySearch;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int array[] = new int[100];
        int target =42;

        for (int i = 0; i < array.length; i ++) {
            array[i] = i;
        }

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println(target + " found at " + index);
        } else {
            System.out.println("Target not found");
        }
    }

    private static int binarySearch(int[] array, int target) {
        int lowIndex = 0;
        int highIndex = array.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = lowIndex + (highIndex - lowIndex) / 2;
            int middleValue = array[middleIndex];

            System.out.println("Middle value: " + middleValue);

            if (middleValue < target) lowIndex = middleIndex + 1;
            else if (middleValue > target) highIndex = middleIndex -1;
            else return middleIndex;
        }
        return -1;
    }
}
