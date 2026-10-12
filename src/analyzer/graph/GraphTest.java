package analyzer.graph;

public class GraphTest {

    public static void main(String[] args) {

        Graph graph = new Graph(6);

        System.out.println(
                "========== GRAPH TEST ==========");

        System.out.println(
                "\n--- EMPTY GRAPH TEST ---");

        System.out.println(
                "Is graph empty? "
                + graph.isEmpty());

        graph.displayGraph();

        System.out.println(
                "\n--- ADD VERTEX TEST ---");

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        System.out.println(
                "\n--- VERTEX VALIDATION TEST ---");

        graph.addVertex("B");
        graph.addVertex("");
        graph.addVertex("G");

        System.out.println(
                "\n--- DISPLAY VERTICES ---");

        graph.displayVertices();

        System.out.println(
                "\n--- ADD EDGE TEST ---");

        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");
        graph.addEdge("E", "F");
        graph.addEdge("C", "F");

        System.out.println(
                "\n--- EDGE VALIDATION TEST ---");

        graph.addEdge("A", "B");
        graph.addEdge("A", "A");
        graph.addEdge("A", "Unknown");

        System.out.println(
                "\n--- DISPLAY GRAPH ---");

        graph.displayGraph();

        System.out.println(
                "\n--- CONNECTION CHECK TEST ---");

        System.out.println(
                "B connected to D: "
                + graph.hasEdge("B", "D"));

        System.out.println(
                "A connected to F: "
                + graph.hasEdge("A", "F"));

        System.out.println(
                "\n--- BFS TEST ---");

        graph.breadthFirstSearch("A");

        System.out.println(
                "\n--- DFS TEST ---");

        graph.depthFirstSearch("A");

        System.out.println(
                "\n--- INVALID TRAVERSAL TEST ---");

        graph.breadthFirstSearch("Unknown");
        graph.depthFirstSearch("Unknown");

        System.out.println(
                "\n--- REMOVE EDGE TEST ---");

        graph.removeEdge("C", "F");
        graph.displayGraph();

        System.out.println(
                "\n--- INVALID EDGE REMOVAL TEST ---");

        graph.removeEdge("C", "F");
        graph.removeEdge("A", "Unknown");

        System.out.println(
                "\n--- GRAPH INFORMATION ---");

        System.out.println(
                "Total vertices: "
                + graph.getVertexCount());

        System.out.println(
                "Is graph full? "
                + graph.isFull());

        System.out.println(
                "\n===== TESTING COMPLETED =====");
    }
}