package Strings.stringAlgorithm;

public class RemoveOccurrenceInString {
//remove all occurrences of a given character from input String
    public static void main(String[] args) {
        String str = "This is a test string";
        char ch = 'i';
        System.out.println("Original string: " + str);
        str = removeChar(str, ch);
        System.out.println("String after removing '" + ch + "': " + str);
    }

    public static String removeChar(String str, char ch) {
        if (str == null)
            return null;
        return str.replaceAll(Character.toString(ch), "");
    }
}

