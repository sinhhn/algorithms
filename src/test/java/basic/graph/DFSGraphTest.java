package basic.graph;

import org.junit.jupiter.api.Test;

import java.util.List;

public class DFSGraphTest {
    @Test
    public void DFSTest() {
        DFSGraph g = new DFSGraph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        //List<Integer> expextedList = new ArrayList<>(2, 0, 1, 3);
        List<Integer> result = g.DFS(2);
    }
}
