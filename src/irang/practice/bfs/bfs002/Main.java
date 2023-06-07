package irang.practice.bfs.bfs002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] graph = new String[n][m];
        int[] v = new int[]{0, 0, 1};
        LinkedList<int[]> queue = new LinkedList<>();

        for (int i = 0; i < graph.length; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            graph[i] = st1.nextToken().split("");
        }

        queue.add(v);
        while (!queue.isEmpty()) {
            v = queue.poll();

            int v1 = v[0];
            int v2 = v[1];
            int v3 = v[2];

            if (v1 == n - 1 && v2 == m - 1) {
                System.out.println(v3);
                break;
            }

            int up = v1 - 1;
            int down = v1 + 1;
            int right = v2 + 1;
            int left = v2 - 1;
            int nextMoves = v3 + 1;

            if (up >= 0 && graph[up][v2].equals("1")) {
                graph[up][v2] = "2";
                queue.add(new int[]{up, v2, nextMoves});
            }
            if (down < n && graph[down][v2].equals("1")) {
                graph[down][v2] = "2";
                queue.add(new int[]{down, v2, nextMoves});
            }
            if (right < m && graph[v1][right].equals("1")) {
                graph[v1][right] = "2";
                queue.add(new int[]{v1, right, nextMoves});
            }
            if (left >= 0 && graph[v1][left].equals("1")) {
                graph[v1][left] = "2";
                queue.add(new int[]{v1, left, nextMoves});
            }
        }
    }
}
/*
5 6
101010
111111
000001
111111
111111
*/

