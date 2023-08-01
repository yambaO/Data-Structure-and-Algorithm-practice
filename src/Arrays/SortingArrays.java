package Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
        int[] sortedArr = sort(arr);
        for (int i : sortedArr) {
            System.out.println(i);
        }
    }

    public static int[] sort(int[] arr) {
        int[] sortedArr = new int[arr.length];
        int min = arr[0];
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            sortedArr[i] = min;
            arr[minIndex] = arr[i];
        }
        return sortedArr;
    }
}
