package am;

import java.io.File;
import java.io.IOException;

public class IODemo {
    private static final String PARENT_PATH="F:/fileDemo/";
    public static void main(String[] args) throws IOException {
        File file=new File(PARENT_PATH);
//        file.createNewFile();
        boolean flag=file.mkdir();
        System.out.println(file);
        System.out.println("文件夹创建"+flag);

        File file1=new File(PARENT_PATH,"a.txt");
        System.out.println(file1);
        System.out.println("文件创建"+file1.createNewFile());


        System.out.println("创建多级文件夹"+new File(PARENT_PATH,"hello/world").mkdirs());
        File hello=new File(PARENT_PATH,"hello/world");

        System.out.println(hello);
        System.out.println(hello.delete());


    }
}
