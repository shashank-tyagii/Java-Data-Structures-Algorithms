package hGraphs;
import java.util.Scanner;

public class aDFS {
	public static void print(int[][] edges, int n, int sv, boolean[] visited){
		System.out.println(sv);
		visited[sv] = true; // marked the starting vertex true
		for(int i=0; i<n; i++){// Running the loop over all n nodes and checking
		// if there is an edge between sv and i
			if(i==sv){
					continue;
			}
			if(edges[sv][i]==1){ // As the edge is found, we then checked if the
				// node i was visited or not
				if(visited[i]){
						continue;
					}
				print(edges, n, i, visited); // Otherwise, recursively called over
							// node i taking it as starting vertex
				}
			}
		}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // Number of nodes
		int e = s.nextInt(); // Number of edges
		int[][] edges = new int[n][n]; // adjacency matrix of size n*n
		
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
					edges[i][j]=0; // 0 indicates that there is no edge between i and j
			}
		}
		
		for(int i=0; i<e; i++){
			int f = s.nextInt();
			int ss = s.nextInt(); // Nodes f and s having edges between them
			edges[f][ss]=1; // marking f to s as 1
			edges[ss][f]=1; // also, marking s to f as 1
		}
		
		
		boolean[] visited = new boolean[n]; // this is used to keep the track
		// of nodes if we have visited them or not.
		for(int i=0; i<n; i++){
			visited[i]=false; // Marking all nodes as false which means not visited
			}
		
			print(edges, n, 0, visited); // starting vertex is taken as 0
		}
}
