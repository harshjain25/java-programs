public class Graph_matrix {
    private int V;//no.of vertices
    private int E;//no. of edges
    private int[][] adjmatrix;
    public Graph_matrix(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjmatrix=new int[nodes][nodes];
    }
    public void addEdge(int u, int v){
        adjmatrix[u][v]=1;
        adjmatrix[v][u]=1;
        E++;
    }

    public static void main(String[] args) {

    }
}
