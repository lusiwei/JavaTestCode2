package pm;

import java.io.File;
import java.util.Arrays;

public class LpcFile {
    public static void main(String[] args) {
        deleteAll(new File("F:\\fileDemo\\test"));
    }

    public static void deleteAll(File file) {
        Arrays.asList(file.listFiles()).forEach(f -> {
            if (f.isFile())
                System.out.println("删除文件" + f.getAbsolutePath() + " ： " + f.delete());
            else {
                deleteAll(f);
                System.out.println("删除文件夹" + f.getAbsolutePath() + " ： " + f.delete());
            }
            System.out.println("删除文件夹" + file.getName() + " ： " + file.delete());
        });

    }
}
