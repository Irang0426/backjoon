package irang.backjoon.number1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        boolean[] visited = new boolean[node + 1];  // 인덱스로 저장할 것 이므로 + 1
        int[][] graph = new int[node + 1][node+ 1]; // 인덱스로 저장할 것 이므로 + 1

        for (int i = 0; i < edge; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st1.nextToken());
            int b = Integer.parseInt(st1.nextToken());

            // 인덱스로 저장하므로 자동 정렬
            graph[a][b] = b;
            graph[b][a] = a;
        }

        System.out.print(v + " ");
        dfs(graph, visited, v);

        bfs(graph, v);
    }

    static void dfs(int[][] graph, boolean[] visited, int v) {
        visited[v] = true;
        for (int node : graph[v]) {
            if (node != 0 && !visited[node]) {
                System.out.print(node + " ");
                dfs(graph, visited, node);
            }
        }
    }

    static void bfs(int[][] graph, int v) {
        boolean[] visited = new boolean[graph.length + 1];
        LinkedList<Integer> queue = new LinkedList<>();
        visited[v] = true;
        System.out.println();
        queue.add(v);   // 시작할 정점 넣기
        while (queue.size() != 0 ) {
            v = queue.poll(); // 큐에 있는 값 추출 후 삭제
            System.out.print(v + " ");

            for (int node : graph[v]) {
                if (node != 0 && !visited[node]) {
                    visited[node] = true;
                    queue.add(node);    // for 문을 이용해 인접한 모든 노드를 큐에 넣기
                }
            }
        }
    }
}
