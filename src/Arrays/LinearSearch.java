package Arrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
        int index = linearSearch(arr, 3);
        System.out.println(index);
    }

    public static int linearSearch(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                return i;
            }
        }
        return -1;
    }
}
