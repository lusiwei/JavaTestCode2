package pm;

import java.io.File;
import java.util.Arrays;

public class FindJava {
    private static final String PTH="F:/";
    public static void main(String[] args) {
//        File file=new File(PTH,"fileDemo");
        File file=new File("F:/");
        findJava(file);
    }

    public static void findJava(File file){
        if(file==null||!file.exists()){
            System.out.println("it does not exists");
        }
        if(file.isFile()){
            if(file.getName().endsWith(".java")){
                System.out.println(file);
            }
        }
        Arrays.asList(file.listFiles()).forEach(f->{
            if(f.isDirectory()){
                findJava(f);
            }
            if(f.getName().endsWith(".java")){
                System.out.println(f);
            }
        });
    }
}
