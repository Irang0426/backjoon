package irang.practice.dfs.dfs002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        String[][] graph = new String[n][m];

        for (int i = 0; i < graph.length; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            graph[i] = st1.nextToken().split("");
        }

        int count = 0;
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                if (graph[i][j].equals("0")) {
                    dfs(graph, new int[]{i, j});
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    static void dfs(String[][] graph,int[] v) {
        int v1 = v[0];
        int v2 = v[1];

        graph[v1][v2] = "2";

        int up = v1 - 1;
        int down = v1 + 1;
        int right = v2 + 1;
        int left = v2 - 1;

        if (down < graph.length && graph[down][v2].equals("0")) {
            dfs(graph, new int[]{down, v2});
        }
        if (up > 0 && graph[up][v2].equals("0")) {
            dfs(graph, new int[]{up, v2});
        }
        if (right < graph[v1].length && graph[v1][right].equals("0")) {
            dfs(graph, new int[]{v1, right});
        }
        if (left > 0 && graph[v1][left].equals("0")) {
            dfs(graph, new int[]{v1, left});
        }
    }
}
/*
15 14
00000111100000
11111101111110
11011101101110
11011101100000
11011111111111
11011111111100
11000000011111
01111111111111
00000000011111
01111111111000
00011111111000
00000001111000
11111111110011
11100011111111
11100011111111

8
 */