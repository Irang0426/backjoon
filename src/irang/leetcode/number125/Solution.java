package irang.leetcode.number125;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        String strReplace = s.toLowerCase().replaceAll("[^0-9a-z]", "");
        stringBuffer.append(strReplace);

        String str2 = stringBuffer.toString();
        String reverse = stringBuffer.reverse().toString();

        if (str2.equals(reverse)){
            return true;
        }
        return false;
    }
}
