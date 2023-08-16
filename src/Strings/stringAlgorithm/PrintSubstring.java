package Strings.stringAlgorithm;
//Input :  abcd
//        Output :  a
//        b
//        c
//        d
//        ab
//        bc
//        cd
//        abc
//        bcd
//        abcd
public class PrintSubstring {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i+1; j <= str.length(); j++) {
                System.out.println(str.substring(i,j));
            }
        }
    }
}
