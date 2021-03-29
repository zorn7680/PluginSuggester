package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Plugin Suggester 1.0");

        TextField myField = new TextField("blub");

        HBox hbox = new HBox(myField);


        Scene scene = new Scene(hbox, 400,275);
        primaryStage.setScene(scene);
        primaryStage.show();

        Controller myCont = new Controller();
        myCont.changeText(myField, "neuerString");
    }


    public static void main(String[] args) {

        launch(args);
    }
}
