import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Demo {
    public static  void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(6666);
        Socket server=ss.accept();
    }
}
