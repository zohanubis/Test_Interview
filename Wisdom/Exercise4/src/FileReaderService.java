/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/

import java.io.*;

public class FileReaderService {

    public void readAndPrintFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
