import java.util.*;
public class ConnectedComponents {
    static class Edge {
        int src;
        int dest;
        int wt;
        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    //For BFS
public static void bfs(ArrayList<Edge>[] graph){
    boolean vis[] = new boolean[graph.length]; //size of V
    for(int i=0; i<graph.length; i++){
        if(!vis[i]){
            bfsUtil(graph, vis);
        }
    }
}
    public static void bfsUtil(ArrayList<Edge>[] graph, boolean vis[]){ //O(V+E)
        Queue<Integer> q= new LinkedList<>();
        q.add(0); //source=0;
        while(!q.isEmpty()){
            int curr= q.remove();
            if(!vis[curr]){ //visit curr
                System.out.print(curr+ " ");
                vis[curr]= true;
                //to find the neighbours of the vertex
                for(int i=0; i<graph[curr].size(); i++){
                    Edge e= graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    //FOR DFS
    public static void dfs(ArrayList<Edge>[] graph){
        boolean vis[] = new boolean[graph.length];
        for(int i=0; i<graph.length; i++){
            dfsUtil(graph, i, vis);
        }
    }
    public static void dfsUtil(ArrayList<Edge>[] graph, int curr, boolean vis[]) {
        // visit the current
        //O(V+E)
        System.out.print(curr + " ");
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);
            // cheching for neighbour
            if (!vis[e.dest]) {
                dfsUtil(graph, e.dest, vis);
            }
        }
    }
    public static void main(String[] args) {
        int V= 7;
        ArrayList<Edge> graph[]= new ArrayList[V];
        
        
    }
}
