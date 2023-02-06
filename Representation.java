import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Representation{
	public static void main(String[] args) {
		//where m and n is the number of vertices and edges
		int m =5;
		int n=5;
		// representationByMatrix(m,n);
		representationByAdjList(m);
		
	}

	public static void representationByMatrix(int vertex, int edges){
		int [][]matrix = new int [vertex][edges];
		Scanner sc= new Scanner(System.in);
		for(int i=0;i<vertex;i++){
			// u and v is the index from which node move from poitn u to v 
			int u =sc.nextInt();
			int v =sc.nextInt();

			matrix[u][v]=1;
		}

		for(int []arr:matrix){
			System.out.println(Arrays.toString(arr));
		}
	}

	public static void representationByAdjList(int vertex){
		//First we create a list of list of integer to store a list corresponding to the vertex
		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>(vertex);

		//adding every arraylist corresponding to every index 
		for(int i=0;i<vertex; i++){
			adjList.add(new ArrayList<>());
		}	

		//calling a new function for adding new edges 
		addEdge(adjList, 0, 1);
        addEdge(adjList, 0, 4);
        addEdge(adjList, 1, 2);
        addEdge(adjList, 1, 3);
        addEdge(adjList, 1, 4);
        addEdge(adjList, 2, 3);
        addEdge(adjList, 3, 4);

        for (int i = 0; i < adjList.size(); i++) {
            System.out.println("\nAdjacency list of vertex "
                               + i);
            System.out.print("head");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(" -> "
                                 + adjList.get(i).get(j));
            }
            System.out.println();
        }

	}

	public static void addEdge(ArrayList<ArrayList<Integer>> adjList, int u , int v){
		//if it is a directed graph
		adjList.get(u).add(v);

		//if it is non directed graph
		/*
		adjList.get(u).add(v);			
		adjList.get(v).add(u);
		*/
	}

	//https://visualgo.net/en/graphds you can visualise the above representation on this website 


}