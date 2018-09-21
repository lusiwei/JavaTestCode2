package homework;

import java.io.*;

public class Task01 {
    public static void main(String[] args) throws IOException {
        InputStream is=new FileInputStream("f:/fileDemo/bg.jpeg");
        OutputStream os=new FileOutputStream("f:/b.jpeg");
        byte[] bytes=new byte[1024];
        int len=0;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        is.close();
        os.close();
    }
}
