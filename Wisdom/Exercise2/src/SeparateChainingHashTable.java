/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/

import java.util.LinkedList;

class Node {
    String key;
    int value;
    Node next;

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}

public class SeparateChainingHashTable {

    private int size;
    private LinkedList<Node>[] table;

    public SeparateChainingHashTable(int size) {
        this.size = size;
        table = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            table[i] = new LinkedList<Node>();
        }
    }

    public int hash(String key) {
        return (key.hashCode() & 0x7fffffff) % size;
    }

    public void put(String key, int value, int hashValue) {
        int index = hashValue % size;
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                node.value = value;
                return;
            }
        }

        table[index].addFirst(new Node(key, value));
    }

    public Integer get(String key) {
        int index = hash(key);
        for (Node node : table[index]) {
            if (node.key.equals(key)) {
                return node.value;
            }
        }
        return null;
    }

    public void printHashTable() {
        for (int i = 0; i < size; i++) {
            System.out.print("Bucket " + i + ": ");
            for (Node node : table[i]) {
                System.out.print("(" + node.key + ", " + node.value + ") -> ");
            }
            System.out.println("null");
        }
    }
}
