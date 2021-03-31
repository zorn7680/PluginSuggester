package sample;

import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Model model = new Model();
        View view = new View(model, stage);
        Controller controller = new Controller(model, view);
    }

    public static void main(String[] args) {
        launch(args);
    }

}