package sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Козак on 01.11.2016.
 */
public class MyFx1 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane root = new BorderPane();
        VBox vbox = new VBox(10);
        HBox hbox = new HBox(10);
        hbox.setAlignment(Pos.CENTER);

        Button btn1 = addButton("1");
        Button btn2 = addButton("2");
        Button btn3 = addButton("3");
        Button btn4 = addButton("4");
        Button btn5 = addButton("5");
        Button btn6 = addButton("6");

        vbox.getChildren().addAll(btn1,btn2,btn3);
        hbox.getChildren().addAll(btn4,btn5,btn6);

        root.setTop(hbox);
        root.setLeft(vbox);

        Scene scene = new Scene(root,400,300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    private Button addButton(String name) {
        Button btn = new Button(name);
        btn.setPrefSize(100,20);
        return btn;
    }
    public static void main(String args[]) {
        launch(args);
    }
}
