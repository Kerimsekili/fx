module com.javafxmasterclass.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxmasterclass.firstapp to javafx.fxml;
    exports com.javafxmasterclass.firstapp;
}