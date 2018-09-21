package Demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Demo1 extends Application {

    @Override
    public void start(Stage stage) {
        Label message=new Label("hello world");
        message.setFont(new Font(100));
        stage.setScene(new Scene(message));
        stage.setTitle("hello");
        Button red=new Button("Red");
        red.setOnAction(event -> message.setTextFill(Color.RED));
        stage.show();
    }
}
