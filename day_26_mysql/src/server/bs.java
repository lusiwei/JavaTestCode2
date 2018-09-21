package server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;


public class bs {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        while (true) {
            Socket socket = ss.accept();
            new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();
                    BufferedReader br = new BufferedReader(new InputStreamReader(is));
                    String requestPath = null;
                    requestPath = br.readLine().split(" ")[1].substring(1);
                    System.out.println(requestPath);
                    BufferedInputStream br2 = new BufferedInputStream(new FileInputStream(requestPath));
                    BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
                    bos.write("HTTP/1.1 200 OK\r\n".getBytes());
                    bos.write("Content-Type: text/html\r\n".getBytes());
                    bos.write("\r\n".getBytes());
                    byte[] bytes = new byte[1024];
                    int len = 0;
                    while ((len = br2.read(bytes)) != -1) {
                        bos.write(bytes,0, len);
                    }
                    bos.close();
                    br2.close();
                    br.close();
                    is.close();
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }).start();
        }

    }
}
