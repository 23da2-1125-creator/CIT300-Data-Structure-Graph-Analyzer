package analyzer.graph;

public class Graph {

    private final String[] vertices;
    private final int[][] adjacencyMatrix;
    private final int maxVertices;
    private int vertexCount;

    public Graph(int maxVertices) {

        if (maxVertices <= 0) {
            throw new IllegalArgumentException(
                    "Graph capacity must be greater than zero.");
        }

        this.maxVertices = maxVertices;
        this.vertices = new String[maxVertices];
        this.adjacencyMatrix =
                new int[maxVertices][maxVertices];
        this.vertexCount = 0;
    }

    public boolean isEmpty() {
        return vertexCount == 0;
    }

    public boolean isFull() {
        return vertexCount == maxVertices;
    }

    public int getVertexCount() {
        return vertexCount;
    }

    public boolean addVertex(String vertexName) {

        if (vertexName == null
                || vertexName.trim().isEmpty()) {

            System.out.println(
                    "Vertex name cannot be empty.");
            return false;
        }

        vertexName = vertexName.trim();

        if (getVertexIndex(vertexName) != -1) {

            System.out.println(
                    "Vertex already exists: "
                    + vertexName);
            return false;
        }

        if (isFull()) {

            System.out.println(
                    "Graph is full. Cannot add vertex: "
                    + vertexName);
            return false;
        }

        vertices[vertexCount] = vertexName;
        vertexCount++;

        System.out.println(
                "Vertex added successfully: "
                + vertexName);

        return true;
    }

    public boolean addEdge(
            String firstVertex,
            String secondVertex) {

        int firstIndex =
                getVertexIndex(firstVertex);
        int secondIndex =
                getVertexIndex(secondVertex);

        if (firstIndex == -1
                || secondIndex == -1) {

            System.out.println(
                    "Cannot add edge. Vertex not found.");
            return false;
        }

        if (firstIndex == secondIndex) {

            System.out.println(
                    "A vertex cannot connect to itself.");
            return false;
        }

        if (adjacencyMatrix[firstIndex]
                [secondIndex] == 1) {

            System.out.println(
                    "Edge already exists between "
                    + vertices[firstIndex]
                    + " and "
                    + vertices[secondIndex]);
            return false;
        }

        adjacencyMatrix[firstIndex]
                [secondIndex] = 1;

        adjacencyMatrix[secondIndex]
                [firstIndex] = 1;

        System.out.println(
                "Edge added: "
                + vertices[firstIndex]
                + " <-> "
                + vertices[secondIndex]);

        return true;
    }

    public boolean removeEdge(
            String firstVertex,
            String secondVertex) {

        int firstIndex =
                getVertexIndex(firstVertex);
        int secondIndex =
                getVertexIndex(secondVertex);

        if (firstIndex == -1
                || secondIndex == -1) {

            System.out.println(
                    "Cannot remove edge. Vertex not found.");
            return false;
        }

        if (adjacencyMatrix[firstIndex]
                [secondIndex] == 0) {

            System.out.println(
                    "No edge exists between "
                    + vertices[firstIndex]
                    + " and "
                    + vertices[secondIndex]);
            return false;
        }

        adjacencyMatrix[firstIndex]
                [secondIndex] = 0;

        adjacencyMatrix[secondIndex]
                [firstIndex] = 0;

        System.out.println(
                "Edge removed: "
                + vertices[firstIndex]
                + " <-> "
                + vertices[secondIndex]);

        return true;
    }

    public boolean hasEdge(
            String firstVertex,
            String secondVertex) {

        int firstIndex =
                getVertexIndex(firstVertex);
        int secondIndex =
                getVertexIndex(secondVertex);

        if (firstIndex == -1
                || secondIndex == -1) {
            return false;
        }

        return adjacencyMatrix[firstIndex]
                [secondIndex] == 1;
    }

    public void displayVertices() {

        if (isEmpty()) {

            System.out.println(
                    "Graph has no vertices.");
            return;
        }

        System.out.println(
                "===== GRAPH VERTICES =====");

        for (int index = 0;
                index < vertexCount;
                index++) {

            System.out.println(
                    index + ": " + vertices[index]);
        }
    }

    public void displayGraph() {

        if (isEmpty()) {

            System.out.println(
                    "Graph is empty.");
            return;
        }

        System.out.println(
                "===== GRAPH CONNECTIONS =====");

        for (int row = 0;
                row < vertexCount;
                row++) {

            System.out.print(
                    vertices[row] + " -> ");

            boolean connectionFound = false;

            for (int column = 0;
                    column < vertexCount;
                    column++) {

                if (adjacencyMatrix[row]
                        [column] == 1) {

                    if (connectionFound) {
                        System.out.print(", ");
                    }

                    System.out.print(
                            vertices[column]);

                    connectionFound = true;
                }
            }

            if (!connectionFound) {
                System.out.print(
                        "No connections");
            }

            System.out.println();
        }
    }

    public void breadthFirstSearch(
            String startVertex) {

        int startIndex =
                getVertexIndex(startVertex);

        if (startIndex == -1) {

            System.out.println(
                    "BFS cannot start. Vertex not found: "
                    + startVertex);
            return;
        }

        boolean[] visited =
                new boolean[vertexCount];

        int[] queue = new int[vertexCount];
        int front = 0;
        int rear = 0;

        visited[startIndex] = true;
        queue[rear++] = startIndex;

        System.out.println(
                "BFS traversal starting from "
                + vertices[startIndex] + ":");

        boolean firstOutput = true;

        while (front < rear) {

            int currentIndex = queue[front++];

            if (!firstOutput) {
                System.out.print(" -> ");
            }

            System.out.print(
                    vertices[currentIndex]);

            firstOutput = false;

            for (int neighbour = 0;
                    neighbour < vertexCount;
                    neighbour++) {

                if (adjacencyMatrix[currentIndex]
                        [neighbour] == 1
                        && !visited[neighbour]) {

                    visited[neighbour] = true;
                    queue[rear++] = neighbour;
                }
            }
        }

        System.out.println();
    }

    public void depthFirstSearch(
            String startVertex) {

        int startIndex =
                getVertexIndex(startVertex);

        if (startIndex == -1) {

            System.out.println(
                    "DFS cannot start. Vertex not found: "
                    + startVertex);
            return;
        }

        boolean[] visited =
                new boolean[vertexCount];

        int[] stack = new int[vertexCount];
        int top = -1;

        stack[++top] = startIndex;
        visited[startIndex] = true;

        System.out.println(
                "DFS traversal starting from "
                + vertices[startIndex] + ":");

        boolean firstOutput = true;

        while (top >= 0) {

            int currentIndex = stack[top--];

            if (!firstOutput) {
                System.out.print(" -> ");
            }

            System.out.print(
                    vertices[currentIndex]);

            firstOutput = false;

            for (int neighbour =
                    vertexCount - 1;
                    neighbour >= 0;
                    neighbour--) {

                if (adjacencyMatrix[currentIndex]
                        [neighbour] == 1
                        && !visited[neighbour]) {

                    visited[neighbour] = true;
                    stack[++top] = neighbour;
                }
            }
        }

        System.out.println();
    }

    private int getVertexIndex(
            String vertexName) {

        if (vertexName == null) {
            return -1;
        }

        for (int index = 0;
                index < vertexCount;
                index++) {

            if (vertices[index].equalsIgnoreCase(
                    vertexName.trim())) {

                return index;
            }
        }

        return -1;
    }
}