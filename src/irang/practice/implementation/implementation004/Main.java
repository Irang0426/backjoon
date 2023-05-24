package irang.practice.implementation.implementation004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int mapRow = Integer.parseInt(st.nextToken());
        int mapColumn = Integer.parseInt(st.nextToken());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int[] character = new int[3];
        for (int i = 0; i < character.length; i++) {
            character[i] = Integer.parseInt(st1.nextToken());
        }

        int[][] map = new int[mapRow][mapColumn];
        for (int i = 0; i < mapRow; i++) {
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < mapColumn; j++) {
                map[i][j] = Integer.parseInt(st2.nextToken());
            }
        }
        br.close();

        map[character[0]][character[1]] = 2;
        int count = 1;
        int[] moveRow = {-1, 0, 1, 0};
        int[] moveColumn = {0, 1, 0 , -1};
        while (true) {
            int north = map[character[0] - 1][character[1]];
            int east = map[character[0]][character[1] + 1];
            int south = map[character[0] + 1][character[1]];
            int west = map[character[0]][character[1] - 1];

            if (north != 0 && east != 0 && south != 0 && west != 0) {
                int backRow = character[0] - moveRow[character[2]];
                int backColumn = character[0] - moveColumn[character[2]];
                if (map[backRow][backColumn] == 1) break;
                character[0] = backRow;
                character[1] = backColumn;
                continue;
            }

            for (int i = 0; i < 4; i++) {
                character[2] = (character[2] + 3) % 4;
                int frontRow = character[0] + moveRow[character[2]];
                int frontColumn = character[1] + moveColumn[character[2]];
                if (map[frontRow][frontColumn] == 0) {
                    character[0] = frontRow;
                    character[1] = frontColumn;
                    map[character[0]][character[1]] = 2;
                    count++;
                    break;
                }
            }
        }

        System.out.println(count);

        for (int i = 0; i < mapRow; i++) {
            System.out.println(Arrays.toString(map[i]));
        }
    }
}
/*
4 4
1 1 0
1 1 1 1
1 0 0 1
1 1 0 1
1 1 1 1

4 5
1 1 0
1 1 1 1 1
1 0 0 0 1
1 1 0 1 1
1 1 1 1 1

4 6
1 1 0
1 1 1 1 1 1
1 0 0 0 0 1
1 1 0 1 1 1
1 1 1 1 1 1
 */
