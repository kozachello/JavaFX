package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("MyWindow");
        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        Pane root = new Pane();
        Button btn = new Button();
        btn.setText("CLICK HERE");
        btn.setTranslateX(100);
        btn.setTranslateY(110);
        btn.setPrefSize(100,20);
        Rectangle rect = new Rectangle(50,50);
        btn.setOnAction(event -> {
            rect.setFill(Color.YELLOW);
            System.out.println("it wooooorks!");
        });

        Scene scene = new Scene(root);

        root.getChildren().addAll(btn,rect);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String args[]) {
        launch(args);
    }
}
