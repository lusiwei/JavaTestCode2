package Stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class TestFileOutputStream {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static void write() throws IOException {
        String path="C:\\Users\\Administrator\\Desktop\\IO\\ioTest.txt";
        OutputStream outputStream=new FileOutputStream(path,true);
        outputStream.write("\r\n一将功成万骨枯".getBytes(),0,10);
//        outputStream.write("凭君莫话封侯事".getBytes());
        outputStream.close();
    }
}
