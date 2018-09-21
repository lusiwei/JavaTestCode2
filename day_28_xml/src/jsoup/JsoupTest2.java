package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.File;
import java.io.IOException;

public class JsoupTest2 {
    public static void main(String[] args) throws IOException {
        String path = JsoupTest2.class.getClassLoader().getResource("student.xml").getPath();
        Document document = Jsoup.parse(new File(path), "utf-8");
//        System.out.println(document);
        Elements select = document.select("student[number=\"stu1\"] name");
        System.out.println(select);

    }
}
