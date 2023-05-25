package irang.practice.dfs.dfs001;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        int[][] graph = {{1, 2, 7}, {0, 6}, {0, 3, 4}, {2, 4}, {2, 3}, {6}, {1, 5, 7}, {0, 6}};
        int v = 0;
        boolean[] visited = new boolean[graph.length];
        dfsRecursive(graph, v, visited);
    }

    public static void dfsFor(int[][] graph, int v, boolean[] visited) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visited[stack.peek()] = true;

        System.out.println(stack.peek() + 1);
        while (!stack.empty()) {
            int i = stack.peek();
            boolean find = false;
            for (int node : graph[i]) {
                if (!visited[node]) {
                    System.out.println(node + 1);
                    visited[node] = true;
                    stack.push(node);
                    find = true;
                    break;
                }
            }
            if (!find) stack.pop();
        }
    }

    public static void dfsRecursive(int[][] graph, int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v + 1);
        for (int node : graph[v]) {
            if (!visited[node]) {
                dfsRecursive(graph, node, visited);
            }
        }
    }
}
