/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        try {
            EdgeWeightedDigraph G = new EdgeWeightedDigraph("data/tinyEWD.txt");
            System.out.println(G);
        } catch (FileNotFoundException e) {
            System.out.println("File not exist: " + e.getMessage());
        }
    }
}

