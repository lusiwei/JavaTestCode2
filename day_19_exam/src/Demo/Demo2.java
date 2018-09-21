package Demo;

import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class Demo2 {
    public static void main(String[] args) {
        String location="http://baidu.com";
        WebView browser=new WebView();
        WebEngine engine=browser.getEngine();
        engine.load(location);
    }
}
