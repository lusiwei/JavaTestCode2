import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
//字节流
 */
public class ServerDemo {
    public static void main(String[] args) throws IOException {
        InputStream is;
        ServerSocket ss = new ServerSocket(8001);
        Socket socket = ss.accept();
        is = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len;
        OutputStream outputStream;
        outputStream = socket.getOutputStream();
        while ((len = is.read(bytes)) != -1) {
            System.out.println("Receiving client's request from ->" + socket.getInetAddress().getHostName() + "\n" + new String(bytes, 0, len));
            outputStream.write(("I received your request , your ip address is : " + socket.getInetAddress() + "\n" + " __      __       .__                                  __           ____  ___                     \n" +
                    "/  \\    /  \\ ____ |  |   ____  ____   _____   ____   _/  |_  ____   \\   \\/  / _____   ____  ____  \n" +
                    "\\   \\/\\/   // __ \\|  | _/ ___\\/  _ \\ /     \\_/ __ \\  \\   __\\/  _ \\   \\     / /     \\_/ ___\\/ ___\\ \n" +
                    " \\        /\\  ___/|  |_\\  \\__(  <_> )  Y Y  \\  ___/   |  | (  <_> )  /     \\|  Y Y  \\  \\__\\  \\___ \n" +
                    "  \\__/\\  /  \\___  >____/\\___  >____/|__|_|  /\\___  >  |__|  \\____/  /___/\\  \\__|_|  /\\___  >___  >\n" +
                    "       \\/       \\/          \\/            \\/     \\/                       \\_/     \\/     \\/    \\/ " + "\n").getBytes());
        }
        //给客户端一个回应
        outputStream.close();
        is.close();
        ss.close();
        socket.close();
    }
}
