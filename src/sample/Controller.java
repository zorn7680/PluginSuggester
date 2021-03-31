package sample;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

import java.util.Observable;
import java.util.Observer;

public class Controller implements Observer {

    private View view;
    private Model model;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

        view.getCountButton().setOnAction(event -> model.tick());

        model.addObserver(this);
        view.getStage().show();
    }

    @Override
    public void update(Observable o, Object arg) {
        if (model.getCountDown() == 1) {
            new Alert(Alert.AlertType.WARNING, "Gleich!", ButtonType.OK).show();
        }
    }
}