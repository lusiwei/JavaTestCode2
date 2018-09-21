package am;

import java.io.*;

public class TransformStream {
    public static void main(String[] args) throws IOException {
        write();
    }


    public static void write() throws IOException {
        OutputStream os=new FileOutputStream("f:/12.txt");
        OutputStreamWriter osw=new OutputStreamWriter(os,"utf-8");
        osw.write(read());
        osw.close();
        os.close();
    }
    public static String read() throws IOException {
        InputStream is=new FileInputStream("F:/11.txt");
        InputStreamReader isr=new InputStreamReader(is,"gbk");
        char[] chars=new char[1024];
        int len;
        while ((len=isr.read(chars))!=-1){
            String str=new String(chars,0,len);
            System.out.println(str);
        }
        isr.close();
        is.close();
        return new String(chars);
    }
}
