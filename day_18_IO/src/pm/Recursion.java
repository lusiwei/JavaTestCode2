package pm;

import java.io.File;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Recursion {
    public static final String PARENT_PATH="f:/";
    public static void main(String[] args) {
        File file=new File(PARENT_PATH,"/fileDemo");
        dirRecursion(file);
    }

    public static void dirRecursion(File file){
        Arrays.asList(file.listFiles()).forEach(f->{
            if(f.isDirectory()){
                System.out.println("这是目录："+f);
                dirRecursion(f);
            }else if(f.isFile()){
                System.out.println("这是文件:"+f);
            }
        });
    }
}
