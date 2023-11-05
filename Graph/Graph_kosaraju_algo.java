import java.util.*;

public class Graph_kosaraju_algo {
    static class Edg {
        int src;
        int dest;

        public Edge(int s, int d){
            this.src= s;
            this.dest= d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<Edge>();
        }

        graph[0].addd(new Edge(0, 2));
    }

    public static void main(String args[]) {

    }
}