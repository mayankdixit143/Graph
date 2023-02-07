import java.io.*;
import java.util.*;

public class Bfs{
	private int vertices;
	private LinkedList<Integer> adjList[];

	Bfs(int vertices){
		this.vertices=vertices;
		adjList = new LinkedList[vertices];

		for (int i=0;i<vertices ;i++ ) {
			adjList[i]=new LinkedList();
		}
	}

	void addEdge(int u, int v){
		adjList[u].add(v);
	}

	void bfsTraversal(int source){
		boolean []visited = new boolean[this.vertices];

		LinkedList<Integer> queue= new LinkedList<Integer>();

		visited[source]=true;
		queue.add(source);

		while(queue.size()!=0){
			source = queue.poll();
			System.out.println(" path is " + source);

			Iterator<Integer> iter = adjList[source].listIterator();

			while(iter.hasNext()){
				int nextAdjElement=iter.next();
				if(!visited[nextAdjElement]){
					visited[nextAdjElement]=true;
					queue.add(nextAdjElement);
				}
			}
		}

	}

	public static void main(String args[])
    {
        Bfs g = new Bfs(4);
 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println(
            "Breadth First Traversal "
            + "(starting from vertex 2)");
 
        g.bfsTraversal(2);
    }

}