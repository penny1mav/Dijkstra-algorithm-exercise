
import java.util.*; 
import java.lang.*; 
import java.io.*; 


public class algorithm {
 
	class Graph { 
	    class Edge { 
	        int src, dest, weight; 
	        Edge() 
	        { 
	            src = dest = weight = 0; 
	        } 
	    }; 
	  
	    int V, E; 
	    Edge edge[]; 
	  
	    Graph(int v, int e) 
	    { 
	        V = v; 
	        E = e; 
	        edge = new Edge[e]; 
	        for (int i = 0; i < e; ++i) 
	            edge[i] = new Edge(); 
	    } 
	  
	   
	    void BellmanFord(Graph graph, int src) 
	    { 
	        int V = graph.V, E = graph.E; 
	        int dist[] = new int[V]; 
	  
	        
	        for (int i = 0; i < V; ++i) 
	            dist[i] = Integer.MAX_VALUE; 
	        dist[src] = 0; 
	  
	        
	        for (int i = 1; i < V; ++i) { 
	            for (int j = 0; j < E; ++j) { 
	                int u = graph.edge[j].src; 
	                int v = graph.edge[j].dest; 
	                int weight = graph.edge[j].weight; 
	                if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) 
	                    dist[v] = dist[u] + weight; 
	            } 
	        } 
	  
	       
	        for (int j = 0; j < E; ++j) { 
	            int u = graph.edge[j].src; 
	            int v = graph.edge[j].dest; 
	            int weight = graph.edge[j].weight; 
	            if (dist[u] != Integer.MAX_VALUE && dist[u] + weight < dist[v]) { 
	                System.out.println("Graph contains negative weight cycle"); 
	                return; 
	            } 
	        } 
	        printArr(dist, V); 
	    } 
	  
	    // A utility function used to print the solution 
	    void printArr(int dist[], int V) 
	    { 
	        System.out.println("Vertex Distance from Source"); 
	        for (int i = 0; i < V; ++i) 
	            System.out.println(i + "\t\t" + dist[i]); 
	    } 
	  
	    public  void main(String[] args)   { 
	        int V = 5; 
	        int E = 8; 
	  
	        Graph graph = new Graph(V, E); 
	  
	        graph.edge[0].src = 1; 
	        graph.edge[0].dest = 1; 
	        graph.edge[0].weight = 8; 
	        
	        graph.edge[1].src = 1; 
	        graph.edge[1].dest = 4; 
	        graph.edge[1].weight = 1; 
	  
	        graph.edge[2].src = 4; 
	        graph.edge[2].dest = 2; 
	        graph.edge[2].weight = 5; 
	  
	        graph.edge[3].src = 4; 
	        graph.edge[3].dest = 1; 
	        graph.edge[3].weight = 1; 
	  
	        graph.edge[4].src = 4; 
	        graph.edge[4].dest = 5; 
	        graph.edge[4].weight = 1; 
	  
	        graph.edge[5].src = 4; 
	        graph.edge[5].dest = 3; 
	        graph.edge[5].weight = 1; 
	  
	        graph.edge[6].src = 5; 
	        graph.edge[6].dest = 4; 
	        graph.edge[6].weight = 1; 
	  
	        graph.edge[7].src = 5; 
	        graph.edge[7].dest = 3; 
	        graph.edge[7].weight = 1; 
	  
	        graph.edge[8].src = 5; 
	        graph.edge[8].dest = 2; 
	        graph.edge[8].weight = 1; 
	  
	        graph.edge[9].src = 5; 
	        graph.edge[9].dest = 6; 
	        graph.edge[9].weight = 4; 
	  
	        graph.edge[10].src = 6; 
	        graph.edge[10].dest = 5; 
	        graph.edge[10].weight = 4; 
	  
	        graph.edge[11].src = 6; 
	        graph.edge[11].dest = 3; 
	        graph.edge[11].weight = 1; 
	  
	        graph.edge[12].src = 3; 
	        graph.edge[12].dest = 5; 
	        graph.edge[12].weight = 1; 
	        
	        graph.edge[13].src = 3; 
	        graph.edge[13].dest = 2; 
	        graph.edge[13].weight = 4; 
	  
	        graph.edge[14].src = 3; 
	        graph.edge[14].dest = 4; 
	        graph.edge[14].weight = 1; 
	  
	        graph.edge[15].src = 3; 
	        graph.edge[15].dest = 6; 
	        graph.edge[15].weight = 1; 
	  
	        graph.edge[16].src = 2; 
	        graph.edge[16].dest = 4; 
	        graph.edge[16].weight = 5; 
	  
	        graph.edge[17].src = 2; 
	        graph.edge[17].dest = 3; 
	        graph.edge[17].weight = 4; 
	        
	        
	        graph.edge[18].src = 2; 
	        graph.edge[18].dest = 5; 
	        graph.edge[18].weight = 1; 
	        
	        
	        
	        
	        graph.BellmanFord(graph, 0); 
	    } 
	} 

}
