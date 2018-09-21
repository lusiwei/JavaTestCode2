import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        Socket s = new Socket("192.168.1.6", 8001);
        OutputStream os = s.getOutputStream();
        String s1;
        while (true){
            System.out.println("请输入你要发送的消息：");
            s1 = scanner.next();
            if(s1.equals("exit")){
                break;
            }else{
                os.write(s1.getBytes());
            }
        }
        os.close();
        s.close();
    }
}
