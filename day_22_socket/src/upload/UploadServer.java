package upload;

import Util.NameUtil;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        while (true) {
            //等待连接
            System.out.println("等待连接");
            Socket accept = ss.accept();
            new Thread(() -> {
                BufferedInputStream bis;
                BufferedOutputStream bos;
                try {
                    bis = new BufferedInputStream(accept.getInputStream());
                    bos = new BufferedOutputStream(new FileOutputStream(Constant.getBasePath()+ NameUtil.getName()+".jpg"));
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1){
                        bos.write(bytes, 0, len);
                    }
                    System.out.println("上传成功！！！");
                    bos.close();
                    bis.close();
                    accept.close();
                } catch (IOException e) {
                    System.out.println("上传失败");
                    e.printStackTrace();
                }
            }).start();
        }
    }
}
