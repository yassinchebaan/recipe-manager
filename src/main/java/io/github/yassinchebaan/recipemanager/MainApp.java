package io.github.yassinchebaan.recipemanager;

import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) {
        stage.setTitle("Recipe Manager");
        stage.setWidth(800);
        stage.setHeight(600);
        stage.show(); // blank window
    }

    public static void main(String[] args) {
        launch(args);
    }
}
