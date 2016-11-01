package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Козак on 01.11.2016.
 */
public class MyFx2 extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root = new Pane();

        Button btn = new Button();
        btn.setText("Close window");
        btn.setTranslateX(200);
        btn.setTranslateY(5);

        Label label = new Label();
        label.setTranslateX(5);
        label.setTranslateY(5);
        label.setText("This is a label");

        Image image = new Image(getClass().getResourceAsStream("images/мясуня.bmp"));
        ImageView img = new ImageView(image);
        img.setFitHeight(300);
        img.setFitWidth(380);
        Label labelImg = new Label();
        labelImg.setGraphic(img);
        labelImg.setTranslateX(60);
        labelImg.setTranslateY(50);
        labelImg.setText("ROASTBEEF");
        labelImg.setGraphicTextGap(20);
        labelImg.setContentDisplay(ContentDisplay.TOP);

        root.getChildren().addAll(label, labelImg, btn);
        Scene scene = new Scene(root,500,400);
        primaryStage.setScene(scene);
        primaryStage.show();

        btn.setOnAction(event -> {
            primaryStage.close();
        });

    }
    public static void main(String args) {
        launch(args);
    }
}
