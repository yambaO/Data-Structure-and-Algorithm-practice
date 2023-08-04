package Strings.stringAlgorithm;

public class CheckStringIdentical {
    public static void main(String[] args) {
        String str1 = "This is a test string";
        String str2 = "This is a test string";
        String str3 = "This is a test string!";
        String str4 = "This is a test string";

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println("str1 == str4: " + (str1 == str4));
    }

}
