package jsoup;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class JsoupTest {
    public static void main(String[] args) throws IOException {
        String path = JsoupTest.class.getClassLoader().getResource("student.xml").getPath();
        System.out.println(path);
        Document parse = Jsoup.parse(new File(path), "utf-8");
        System.out.println(parse);

//        System.out.println(parse.getElementsByTag("name"));
//        System.out.println(parse.getElementsByTag("name").text());
//        System.out.println(parse.body());
    }
}
