package Arrays;

public class SingleElementArray {
    public static void main(String[] args) {
        int[] arr = { 5, 2, 1, 3, 4 };
        int singleElement = singleElement(arr);
        System.out.println(singleElement);
    }

    public static int singleElement(int[] arr) {
        int singleElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (singleElement != arr[i]) {
                singleElement = arr[i];
            }
        }
        return singleElement;
    }
}
