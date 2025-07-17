package com.javafxmasterclass.readonlyprops;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Binding extends Application {
    @Override
    public void start(Stage stage){
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        Label label = new Label ("Max with 200");
        TextField textField = new TextField();
        TextField textField2 = new TextField();
        textField.setMaxWidth(200);
        textField2.setMaxWidth(200);
        root.getChildren().addAll(label, textField,textField2);
        label.textProperty().bind(textField.textProperty());
//        textField.textProperty().bindBidirectional(textField2.textProperty());
        Scene scene = new Scene(root,500, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
