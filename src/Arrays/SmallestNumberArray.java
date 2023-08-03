package Arrays;

public class SmallestNumberArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
        int smallestNumber = smallestNumber(arr);
        System.out.println(smallestNumber);
    }

    public static int smallestNumber(int[] arr) {
        int smallestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (smallestNumber > arr[i]) {
                smallestNumber = arr[i];
            }
        }
        return smallestNumber;
    }
}
