package irang.practice.bfs.bfs001;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        int[][] graph = {{1, 2, 7}, {0, 6}, {0, 3, 4}, {2, 4}, {2, 3}, {6}, {1, 5, 7}, {0, 6}};
        int v = 0;
        boolean[] visited = new boolean[graph.length];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[v] = true;
        queue.add(v);

        while(!queue.isEmpty()) {
            v = queue.poll();
            System.out.print(v + " ");

            for (int node : graph[v]) {
                if(!visited[node]) {
                    visited[node] = true;
                    queue.add(node);
                }
            }
        }
    }
}
