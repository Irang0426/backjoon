package irang.practice.implement.implement001;

/*
5
R R R U D D

3 4
 */

import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String[] strList = str.split(" ");

        int x = 1;
        int y = 1;

//        HashMap<String, Integer[]> hashMap = new HashMap<>();
//        hashMap.put("L", new Integer[]{0, -1});
//        hashMap.put("R", new Integer[]{0, 1});
//        hashMap.put("U", new Integer[]{-1, 0});
//        hashMap.put("D", new Integer[]{1, 0});

//        for (String s : strList) {
//            int next_x = x + hashMap.get(s)[0];
//            int next_y = y + hashMap.get(s)[1];
//            if (next_x <= n && next_x >= 1 && next_y <= n && next_y >= 1) {
//                x = next_x;
//                y = next_y;
//            }
//        }
//

        HashMap<String, Integer> directions = new HashMap<>();
        directions.put("L", 0);
        directions.put("R", 1);
        directions.put("U", 2);
        directions.put("D", 3);

        int[] directions_x = {0, 0, -1, 1};
        int[] directions_y = {-1, 1, 0, 0};

        for (String s : strList) {
            int next_x = x + directions_x[directions.get(s)];
            int next_y = y + directions_y[directions.get(s)];
            if (next_x <= n && next_x >= 1 && next_y <= n && next_y >= 1) {
                x = next_x;
                y = next_y;
            }
        }

        System.out.println(x + ", " + y);

    }
}
