package am;
/**
 * IO  list() listFiles() FilenameFilter()
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.List;

public class IODemo3 {
    public static void main(String[] args) {
        File file = new File("F:/fileDemo");
        file.list();
        Arrays.asList(file.list()).forEach(f -> {
            if (f.endsWith(".java")) {
                System.out.println(f);
            }
        });
        System.out.println("lambda表达式");
        Arrays.asList(file.listFiles()).forEach(f -> {
            if (f.isDirectory()) {
                System.out.println("这是一个文件夹" + f);
            } else if (f.isFile()) {
                System.out.println("这是一个文件" + f);
            }
        });
        System.out.println("**************************");
        List<File> list = Arrays.asList(file.listFiles());

        for (File file1 : list) {
            if (file1.isFile()) {
                System.out.println("这是一个文件" + file1);
            } else if (file1.isDirectory()) {
                System.out.println("这是一个文件夹" + file1);
            }
        }

        System.out.println("----------------------------------");
        Arrays.asList(file.listFiles((dir, name) -> new File(dir, name).isDirectory())).forEach(f -> System.out.println(f));
        System.out.println("++++++++++++++++++++++++++++++++++++++");
        file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (file.isFile()) {
                    System.out.println(name);
                    return true;
                }
                return false;
            }
        });
    }
}
