public class AdjacencyMatrix {
    public static void main(String[] args) {
        int adjMatrix[][] = new int[5][5]; // create a matrix
        addEdges(adjMatrix, 0, 1);
        addEdges(adjMatrix, 0, 2);
        addEdges(adjMatrix, 0, 4);

        addEdges(adjMatrix, 1, 2);
        addEdges(adjMatrix, 1, 3);

        addEdges(adjMatrix, 2, 3);
        addEdges(adjMatrix, 2, 4);

        displayMatrix(adjMatrix);
    }

    public static void addEdges(int adjMatrix[][], int i, int j) {
        adjMatrix[i][j] = 1; // i--row suppose path dont have the value then we make it as one
        adjMatrix[j][i] = 1; // j--col
    }

    public static void displayMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) { // traverse the start to end
            for (int j = 0; j < matrix[i].length; j++) { // it check one by one
                System.out.print(matrix[i][j] + " "); // print those 2d array
            }
            System.out.println();
        }
    }

}
