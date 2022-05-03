import java.util.*;
public class AdjMatGraph {
    private int V; //no. of vertices in graph
    private int E; //no. of edges in graph
    private int[][] adjMatrix;
    public AdjMatGraph(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix=new int[nodes][nodes];
    }
    public void addEdge(int u,int v){
        adjMatrix[u][v]=1;
        adjMatrix[v][u]=1;
        E++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" vertices, "+E+" edges "+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+": ");
            for(int w:adjMatrix[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        AdjMatGraph g=new AdjMatGraph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,0);
        System.out.println(g);
    }
}
