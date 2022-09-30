import java.util.*;

class AdjacencyList {
    // add edge
    static void addEdge(ArrayList<ArrayList<Integer>> adj, int source, int dest) {
        adj.get(source).add(dest);
        adj.get(dest).add(source);
    }

    public static void main(String[] args) {
        int v = 6;
        // int e =10;

        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>(v);
        for (int i = 0; i < v; i++)
            adj.add(new ArrayList<Integer>());
        // add edges
        addEdge(adj, 1, 2);
        addEdge(adj, 1, 3);
        addEdge(adj, 1, 5);

        addEdge(adj, 2, 3);
        addEdge(adj, 2, 4);

        addEdge(adj, 3, 4);
        addEdge(adj, 3, 5);

        printGraph(adj);
    }

    static void printGraph(ArrayList<ArrayList<Integer>> adj) {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("\nVertex " + i + ":👇");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.println("👉" + adj.get(i).get(j));
            }
            System.out.println();
        }
    }
}
