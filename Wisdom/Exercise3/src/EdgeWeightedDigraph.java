/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class EdgeWeightedDigraph {
    private final int V;
    private int E;
    private Bag<DirectedEdge>[] adj;
    private int[] indegree;

    public EdgeWeightedDigraph(int V) {
        if (V < 0) throw new IllegalArgumentException("Number of vertices must be non-negative");
        this.V = V;
        this.E = 0;
        this.indegree = new int[V];
        adj = (Bag<DirectedEdge>[]) new Bag[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new Bag<DirectedEdge>();
        }
    }

    public EdgeWeightedDigraph(String filename) throws FileNotFoundException {
        Scanner in = new Scanner(new File(filename));
        try {
            this.V = in.nextInt();
            int edges = in.nextInt();
            if (V < 0) throw new IllegalArgumentException("V < 0");
            indegree = new int[V];
            adj = (Bag<DirectedEdge>[]) new Bag[V];
            for (int v = 0; v < V; v++) {
                adj[v] = new Bag<DirectedEdge>();
            }

            for (int i = 0; i < edges; i++) {
                int v = in.nextInt();
                int w = in.nextInt();
                double weight = in.nextDouble();
                addEdge(new DirectedEdge(v, w, weight));
            }
        } catch (NoSuchElementException e) {
            throw new IllegalArgumentException("Invalid input format", e);
        } finally {
            in.close();
        }
    }

    public void addEdge(DirectedEdge e) {
        int v = e.from();
        int w = e.to();
        validateVertex(v);
        validateVertex(w);
        adj[v].add(e);
        indegree[w]++;
        E++;
    }

    public Iterable<DirectedEdge> adj(int v) {
        validateVertex(v);
        return adj[v];
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    private void validateVertex(int v) {
        if (v < 0 || v >= V) {
            throw new IllegalArgumentException("Vertices" + v + " invalid.");
        }
    }

    public String toString() {
        StringBuilder s = new StringBuilder();
        s.append(V + " vertices, " + E + " edges\n");
        for (int v = 0; v < V; v++) {
            s.append(v + ": ");
            for (DirectedEdge e : adj(v)) {
                s.append(e + "  ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
