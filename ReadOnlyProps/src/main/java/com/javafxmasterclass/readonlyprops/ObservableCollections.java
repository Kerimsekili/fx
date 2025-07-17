package com.javafxmasterclass.readonlyprops;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ObservableCollections extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox root = new VBox();
        root.setAlignment(Pos.CENTER);
        root.setSpacing(10);
        ObservableList<String> list = FXCollections.observableArrayList("one","two","three");

        TextField textField = new TextField();
        Button button = new Button("Add");

        ListView<String> items = new ListView<>();
        root.getChildren().addAll(items,textField,button);
        items.setItems(list);
        button.setOnAction(event -> {
            if (!textField.textProperty().get().isEmpty()) {
                list.add(textField.getText());
            }
        });
        Scene scene = new Scene(root,500,550);
        stage.setScene(scene);
        stage.show();

    }
}
