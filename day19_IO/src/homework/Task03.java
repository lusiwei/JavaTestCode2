package homework;

import java.io.*;

public class Task03 {
    public static void main(String[] args) throws IOException {
        Writer fw=new FileWriter("f:/fileDemo/d.txt");
        Reader fr=new FileReader("f:/fileDemo/a.txt");

        char[] chars=new char[1024];
        int len=0;
        while ((len=fr.read(chars))!=-1){
            fw.write(chars,0,len);
            fw.flush();
        }
        fw.close();
        fr.close();
    }
}
