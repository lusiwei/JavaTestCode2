package Stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class TestFileInputStream {
    public static void main(String[] args) throws IOException {
        read();
    }
    public static void read() throws IOException {
        InputStream is =new FileInputStream("f:/fileDemo/a.txt");
        int i=is.read();
        System.out.println(i);
        is.close();
    }
}
