package irang.programmers.number120890;

public class Solution {
    public static int solution(int[] array, int n) {
        int subMin = 101;
        int index = 0;
        int value = 0;

        for (int i = 0; i < array.length; i++) {
            if (Math.abs(n - array[i]) < subMin) {
                subMin = Math.abs(n - array[i]);
                index = i;
                value = array[i];
            } else if (n - Math.abs(array[i]) == subMin && value > array[i]) {
                index = i;
                value = array[i];
            }
        }
        return array[index];
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{3, 21, 23}, 20));
        System.out.println(solution(new int[]{10, 14, 12}, 13));
    }
}
