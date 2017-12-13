package basic.graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class DFSGraph {
    int V;
    LinkedList<Integer> adj[];
    List<Integer> visitedVertex;

    public DFSGraph(int v) {
        V = v;
        adj = new LinkedList[v];
        visitedVertex = new ArrayList<>();
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(int v, int w) {
        adj[v].add(w);
    }

    public void DFSUtil(int v, boolean visited[]) {
        visited[v] = true;
        visitedVertex.add(v);
        //System.out.print(v + " ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    public List<Integer> DFS(int v) {
        boolean visited[] = new boolean[V];
        DFSUtil(v, visited);
        return visitedVertex;
    }

    public static void main(String[] args) {
        DFSGraph g = new DFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal " +
                "(starting from vertex 0)");

        g.DFS(2);
    }

    public static void printArray(boolean[] visited) {
        for (boolean b : visited) {
            System.out.print(b);
            System.out.print("   ");
        }
    }
}

