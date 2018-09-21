package Buffer;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class BufferDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new FileReader("F:/fileDemo/a.txt"));
        String strLine;
        Map<Integer,String> map=new HashMap<>();
        while ((strLine=br.readLine())!=null){
            int index=strLine.indexOf('.');
            map.put(Integer.parseInt(strLine.substring(0,index)),strLine);
        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("F:/fileDemo/a.txt"));
        map.forEach((key,value)->{
            try {
                bw.write(value);
                bw.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        br.close();
        bw.close();
    }
}
