package Arrays;

public class ReversedArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
        int[] reversedArr = reverse(arr);
        for (int i : reversedArr) {
            System.out.println(i);
        }
    }

    public static int[] reverse(int[] arr) {
        int[] reversedArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[arr.length - 1 - i];
        }
        return reversedArr;
    }
}
