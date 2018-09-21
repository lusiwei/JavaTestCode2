package upload;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket s=new Socket("192.168.1.11",8008);
        BufferedInputStream bis=new BufferedInputStream(new FileInputStream("F:/b.jpeg"));
        BufferedOutputStream bos=new BufferedOutputStream(s.getOutputStream());
        byte[] bytes=new byte[1024];
        int len;
        while ((len=bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bos.close();
        bis.close();
        s.close();

    }


}
