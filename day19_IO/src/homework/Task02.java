package homework;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Task02 {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("f:/fileDemo/a.txt");
        OutputStream os = new FileOutputStream("f:/fileDemo/c.txt");
        byte[] bytes = new byte[1024];
        List<Byte> list = new ArrayList<>();
        int len = 0;
        os.write("1.".getBytes());
        while ((len = is.read(bytes)) != -1) {
            for (byte aByte : bytes) {
                list.add(aByte);
            }
            os.write(bytes, 0, len);
        }
        is.close();
        os.close();
    }
}
