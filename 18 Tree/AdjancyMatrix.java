import java.io.*;
import java.util.*;

class A {
    public static void main(String[] args) {
        int v = 5;
        int e = 10;

        // Adjancy matrix
        int arr[][] = new int[v+1][v+1];

        // array
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0; i<v; i++) {
            adj.add(new ArrayList<Integer>());
        }
    }

    static void addEdge(int arr[][], int source, int dest) {
        // bidirectional edges
        arr[source][dest] = 1;
        arr[dest][source] = 1;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        // bidirectional edges
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }
}