/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Record {
    String location;
    String time;

    public Record(String location, String time) {
        this.location = location;
        this.time = time;
    }

    @Override
    public String toString() {
        return location + " " + time;
    }
}

public class RecordManager {

    public static List<Record> createRecords() {
        List<Record> records = new ArrayList<>();
        records.add(new Record("Chicago", "09:00:00"));
        records.add(new Record("Phoenix", "09:00:03"));
        records.add(new Record("Houston", "09:00:13"));
        records.add(new Record("Chicago", "09:00:59"));
        records.add(new Record("Houston", "09:01:10"));
        records.add(new Record("Chicago", "09:11:05"));
        records.add(new Record("Seattle", "09:19:26"));
        records.add(new Record("Seattle", "09:22:54"));
        records.add(new Record("Phoenix", "09:19:32"));
        records.add(new Record("Chicago", "09:25:52"));
        records.add(new Record("Chicago", "09:36:14"));
        records.add(new Record("Seattle", "09:36:14"));
        records.add(new Record("Phoenix", "09:37:44"));
        return records;
    }

    // Sắp xếp theo thời gian
    public static void sortByTime(List<Record> records) {
        // Record <-> time, giữ nguyên
        Collections.sort(records, Comparator.comparing(record -> record.time));
    }

    public static void sortByLocationUnstable(List<Record> records) {
        Collections.sort(records, Comparator.comparing(record -> record.location));
    }

    public static void sortByLocationStable(List<Record> records) {
        records.sort(Comparator.comparing((Record record) -> record.location)
                .thenComparing(record -> record.time));
    }

    public static void printRecords(List<Record> records) {
        for (Record record : records) {
            System.out.println(record);
        }
    }
}
