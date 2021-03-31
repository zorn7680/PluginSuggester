package sample;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

public class View implements Observer {

    private Model model;

    private Stage stage;
    private Label label;
    private Button countButton;

    public View(Model model, Stage stage) {
        this.model = model;
        this.stage = stage;

        label = new Label("Countdown: " + model.getCountDown());
        countButton = new Button("Count");
        VBox root = new VBox(label, countButton);
        Scene scene = new Scene(new VBox(root));

        stage.setScene(scene);
        model.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        label.setText("Countdown: " + model.getCountDown());
    }

    public Button getCountButton() {
        return countButton;
    }

    public Stage getStage() {
        return stage;
    }
}