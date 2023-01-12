import java.util.*;
import java.lang.*;
class Graph {
    class Edge implements Comparable<Edge>
    {
        int s, d, w;
        public int compareTo(Edge compareEdge)
        {
            return this.w - compareEdge.w;
        }
    }
    class sublist
    {
        int parent, rank;
    }

    int V, E;
    Edge edge[];
    Graph(int v, int e)
    {
        V = v;
        E = e;
        edge = new Edge[E];
        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }
    int find(sublist sublists[], int i)
    {
        if (sublists[i].parent != i)
            sublists[i].parent = find(sublists, sublists[i].parent);
        return sublists[i].parent;
    }
    void Union(sublist sublists[], int x, int y)
    {
        int a = find(sublists, x);
        int b = find(sublists, y);
        if (sublists[a].rank < sublists[b].rank)
            sublists[a].parent = b;
        else if (sublists[a].rank > sublists[b].rank)
            sublists[b].parent = a;
        else {
            sublists[b].parent = a;
            sublists[a].rank++;
        }
    }
    void KruskalMST()
    {
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        for (i = 0; i < V; ++i)
            result[i] = new Edge();
        Arrays.sort(edge);
        sublist sublists[] = new sublist[V];
        for (i = 0; i < V; ++i)
            sublists[i] = new sublist();
        for (int v = 0; v < V; ++v)
        {
            sublists[v].parent = v;
            sublists[v].rank = 0;
        }

        i = 0;
        while (e < V - 1)
        {
            Edge next_edge = edge[i++];
            int x = find(sublists, next_edge.s);
            int y = find(sublists, next_edge.d);
            if (x != y) {
                result[e++] = next_edge;
                Union(sublists, x, y);
            }
        }
        System.out.println("Following are the edges in the constructed MST");
        int mincost = 0;
        for (i = 0; i < e; ++i)
        {
            System.out.println(result[i].s + " -- " + result[i].d + " == " + result[i].w);
            mincost += result[i].w;
        }
        System.out.println("Minimum Cost Spanning Tree " + mincost);
    }
    public static void main(String[] args)
    {
        int V = 4;
        int E = 5;
        Graph graph = new Graph(V, E);
        graph.edge[0].s = 0;
        graph.edge[0].d = 1;
        graph.edge[0].w = 10;


        graph.edge[1].s = 0;
        graph.edge[1].d = 2;
        graph.edge[1].w = 6;


        graph.edge[2].s = 0;
        graph.edge[2].d = 3;
        graph.edge[2].w = 5;


        graph.edge[3].s = 1;
        graph.edge[3].d = 3;
        graph.edge[3].w = 15;


        graph.edge[4].s = 2;
        graph.edge[4].d = 3;
        graph.edge[4].w = 4;

        graph.KruskalMST();
    }
}