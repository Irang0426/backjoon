package irang.practice.sort;

import java.util.*;

public class Sort003 {
    public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2};
        int[] arr2 = new int[10];

        for (int i : arr) {
            arr2[i]++;
        }

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i]; j++) {
                System.out.print(i + ", ");
            }
        }

        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "사과");
        map.put(2, "바나나");
        map.put(3, "당근");
        map.put(20, "포도");

        List<Integer> list = new ArrayList<>(map.keySet());
        list.sort(null);

        System.out.println(list);

    }
}
