package LinearSearch;

public class Main {
    public static void main(String[] args) {
        int[] array = {2,3,5,1,8,6,9,7};
        int index = linearSeach(array, 8);
        if (index != -1) {
            System.out.println("Element found at " + index);
        }else {
            System.out.println("Element not found");
        }
    }

    public static int linearSeach(int array[], int element) {
        for (int i = 0; i < array.length; i++) {
            if (array[i]== element) {
                return i;
            }
        };
        return -1;
    }
}
