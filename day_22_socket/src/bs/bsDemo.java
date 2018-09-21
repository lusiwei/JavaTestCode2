package bs;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class bsDemo {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket accept = ss.accept();
            new Thread(() -> {
                try {
                    //获取http请求流
                    BufferedReader bufferedReader;
                    bufferedReader = new BufferedReader(new InputStreamReader(accept.getInputStream()));
                    //获取请求路径
                    String requestPath = bufferedReader.readLine().split(" ")[1].substring(1);
                    BufferedInputStream bis = new BufferedInputStream(new FileInputStream(requestPath));
                    BufferedOutputStream bos = new BufferedOutputStream(accept.getOutputStream());
                    //返回http响应
                    bos.write("HTTP/1.1 200 OK\r\n".getBytes());
                    bos.write("Content-Type:text/html\r\n".getBytes());
                    bos.write("\r\n".getBytes());
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = bis.read(bytes)) != -1) {
                        bos.write(bytes, 0, len);
                    }
                    bos.close();
                    bis.close();
                    accept.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    System.out.println("你要访问的页面不存在！");
                }
            }).start();
        }
    }
}
