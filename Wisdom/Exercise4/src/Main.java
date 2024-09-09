/** Author: Pham Ho Dang Huy - Zohanubis
 // zohanubis.work@gmail.com
 // https://github.com/zohanubis **/
public class Main {

    public static void main(String[] args) {
        FileReaderService fileReaderService = new FileReaderService();

        String filePath = "data/file.txt";

        fileReaderService.readAndPrintFile(filePath);
    }
}
