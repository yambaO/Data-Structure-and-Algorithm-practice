package Arrays;

public class BiggestNumberArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
        int biggestNumber = biggestNumber(arr);
        System.out.println(biggestNumber);
    }

    public static int biggestNumber(int[] arr) {
        int biggestNumber = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (biggestNumber < arr[i]) {
                biggestNumber = arr[i];
            }
        }
        return biggestNumber;
    }
}
