/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Record> records = RecordManager.createRecords();

        RecordManager.sortByTime(records);
        System.out.println("Sorted by time:");
        RecordManager.printRecords(records);

        RecordManager.sortByLocationUnstable(records);
        System.out.println("\nSorted by location (not stable):");
        RecordManager.printRecords(records);

        RecordManager.sortByLocationStable(records);
        System.out.println("\nSorted by location (stable):");
        RecordManager.printRecords(records);
    }
}
