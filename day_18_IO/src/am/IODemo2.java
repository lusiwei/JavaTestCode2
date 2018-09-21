package am;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class IODemo2 {
    private static final String P_Path="f:/fileDemo";
    public static void main(String[] args) throws IOException {
        File file=new File(P_Path);
        System.out.println("文件夹"+file.exists());
        System.out.println(file.getAbsoluteFile());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.isAbsolute());
        System.out.println(file.canExecute());
        System.out.println(file.canRead());
        System.out.println(file.isFile());
        System.out.println(file.isHidden());


        System.out.println(file.getName());
        File file1=new File(P_Path,"hello");
        System.out.println(file1.getAbsolutePath());
        System.out.println(file1.getAbsoluteFile());
        System.out.println(file1.getName());
        System.out.println(file1.getParent());
        System.out.println(file1.getPath());
        System.out.println(new File(P_Path,"hello.java").createNewFile());
        File file2=new File(P_Path,"hello.java");
        System.out.println(file2.length());
        System.out.println(file2.lastModified());
        Date date=new Date(file2.lastModified());
        System.out.println(date);

        System.out.println(File.listRoots());
        File[] f=File.listRoots();
        for (File file3 : f) {
            System.out.println(file3);
        }

        System.out.println(f.toString());

        System.out.println(f instanceof File[]);
        System.out.println(file.list());
        for (String s : file.list()) {
            System.out.println(s);
        }
        File file3=new File("F:/");
        for (String s : file3.list()) {
            System.out.println(s);

        }
    }
}
