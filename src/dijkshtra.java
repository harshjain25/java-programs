import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class dijkshtra {
    private HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();

    public dijkshtra(int v) {
        for (int i = 1; i <= v; i++) {
            map.put(i, new HashMap<>());
        }
    }

    public void AddEdge(int v1, int v2, int cost) {
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    private class dijkshtra_pair {
        int vtx;
        String acq_path;
        int cost;

        public dijkshtra_pair(int vtx, String acq_path, int cost) {
            this.acq_path = acq_path;
            this.vtx = vtx;
            this.cost = cost;
        }

        @Override
        public String toString() {
            return this.vtx + " via " + this.acq_path + " @ " + this.cost;
        }


        public void dijkstraAlgo() {
            PriorityQueue<dijkshtra_pair> pq = new PriorityQueue<>(new Comparator<dijkshtra_pair>() {
                @Override
                public int compare(dijkshtra_pair o1, dijkshtra_pair o2) {
                    return o1.cost - o2.cost;
                }
            });
            HashSet<Integer> visited = new HashSet<>();
            pq.add(new dijkshtra_pair(1, "1", 0));
            while (!pq.isEmpty()) {
                dijkshtra_pair rp = pq.remove();
                if (visited.contains(rp.vtx)) {
                    continue;
                }
                visited.add(rp.vtx);
                System.out.println(rp);
                for (int nbrs : map.get(rp.vtx).keySet()) {
                    if (!visited.contains(nbrs)) {
                        int cost = rp.cost + map.get(rp.vtx).get(nbrs);
                        pq.add(new dijkshtra_pair(nbrs, rp.acq_path + nbrs, cost));
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        dijkstraAlgo g=new dijkstraAlgo(7);
        g.addEdge(1,4,6);
        g.addEdge(1,2,10);
        g.addEdge(1,4,6);
        g.addEdge(1,4,6);
        g.addEdge(1,4,6);
        g.addEdge(1,4,6);
        g.addEdge(1,4,6);
        g.addEdge(1,4,6);
    }
}
