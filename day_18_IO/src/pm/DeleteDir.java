package pm;

import java.io.File;
import java.util.Arrays;

public class DeleteDir {
    private static final String PH = "F:/";

    public static void main(String[] args) {
        File file = new File(PH, "fileDemo/test");
        deleteNullDir(file);
    }

    public static void deleteNullDir(File file) {
        Arrays.asList(file.listFiles()).forEach(f -> {
            if (f.isDirectory()) {
                deleteNullDir(f);
            } else {
                f.delete();
            }
        });
        file.delete();
    }
}
