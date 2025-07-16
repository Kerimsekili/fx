package com.javafxmasterclass.firstapp;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("Before the App starts ");
        System.out.println(Thread.currentThread().getName() + "Thread");
    }

    @Override
    public void start(Stage stage) {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setPadding(new Insets(20, 20, 20, 20));
        Label text = new Label("");
        Button button = new Button("Click Me");
        Button blockledButton = new Button("Exit Explicitly");
        button.setOnAction(e -> {
            text.setText("Welcome to JavaFX Masterclass!");
        });
        blockledButton.setOnAction(e -> {
            Platform.exit();
        });
        root.getChildren().addAll(text, button, blockledButton);
        Scene scene = new Scene(root, 350, 300);
        stage.setScene(scene);
        stage.setTitle("JX App");
        stage.show();

    }

    @Override
    public void stop(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("Closing te application");
    }

    public static void main(String[] args) {
        launch(args);
    }

}