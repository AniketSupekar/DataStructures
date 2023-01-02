package Graphs;

import java.util.Scanner;

public class AdjMatrixGraph {

    int vertices;
    int matrix[][];

    AdjMatrixGraph(int vertices) {
        this.vertices = vertices;
        matrix = new int[vertices][vertices];
    }

    void AddEdge(int source , int destination) {
        matrix[source][destination] = 1;
        matrix[destination][source] = 1;
    }

    void PrintGraph() {
        for(int i=0;i<vertices;i++) {
            for(int j=0;j<vertices;j++) {
                System.out.println(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of vetices :");
        int v = sc.nextInt();

        AdjMatrixGraph Amg = new AdjMatrixGraph(v);

        System.out.println("Enter the number of edges :");
        int e = sc.nextInt();

        for(int i=0;i<e;i++) {
            System.out.println("Enter the source vertex :");
            int a = sc.nextInt();

            System.out.println("Enter the destination vertex :");
            int b = sc.nextInt();

            Amg.AddEdge(a, b);
        }
        Amg.PrintGraph();
    }

}
