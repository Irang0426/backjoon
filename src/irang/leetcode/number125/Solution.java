package irang.leetcode.number125;

public class Solution {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
    }

    public static boolean isPalindrome(String s) {
        StringBuffer stringBuffer = new StringBuffer();
        String strReplace = s.toLowerCase().replaceAll("[^0-9a-zA-Z]", "");
        stringBuffer.append(strReplace);

        String str2 = stringBuffer.toString();
        String reverse = stringBuffer.reverse().toString();

        if (str2.equals(reverse)){
            return true;
        }
        return false;
    }
}
