package Data_Sructures;

import java.util.*;

class Graph {
    private int V; // Number of vertices
    private Map<Integer, List<Integer>> adjList;

    public Graph(int vertices) {
        V = vertices;
        adjList = new HashMap<>();
        for (int i = 0; i < V; i++) {
            adjList.put(i, new LinkedList<>());
        }
    }

    // Add an edge to the graph
    public void addEdge(int v, int w) {
        adjList.get(v).add(w); // Add w to v's list
        adjList.get(w).add(v); // Add v to w's list (for an undirected graph)
    }

    // Print the graph
    public void printGraph() {
        for (int v = 0; v < V; v++) {
            System.out.print("Adjacency list of vertex " + v + ": ");
            for (Integer neighbor : adjList.get(v)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class Graphs {
    public static void main(String[] args) {
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        // Add edges to the graph
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        // Print the graph
        graph.printGraph();
    }
}

