package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Plugin Suggester 1.0");

        Pane rootPane = new Pane();
        Scene scene = new Scene(rootPane, 400,275);

        Label myLabel = new Label("blub");
        Rectangle rect = new Rectangle(50,50);

        rootPane.getChildren().add(myLabel);
        rootPane.getChildren().add(rect);


        rect.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                myLabel.setText("Lorem ipsum dolor sit amet sed iam.");
            }
        });



        primaryStage.setScene(scene);
        primaryStage.show();




    }


    public static void main(String[] args) {

        launch(args);
    }
}
