/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/
public class Main {
    public static void main(String[] args) {
        SeparateChainingHashTable hashTable = new SeparateChainingHashTable(5);

        hashTable.put("S", 0, 2);
        hashTable.put("E", 1, 0);
        hashTable.put("A", 2, 0);
        hashTable.put("R", 3, 4);
        hashTable.put("C", 4, 4);
        hashTable.put("H", 5, 4);
        hashTable.put("E", 12, 0);
        hashTable.put("X", 7, 2);
        hashTable.put("A", 8, 0);
        hashTable.put("M", 9, 4);
        hashTable.put("P", 10, 3);
        hashTable.put("L", 11, 3);

        hashTable.printHashTable();
    }
}
