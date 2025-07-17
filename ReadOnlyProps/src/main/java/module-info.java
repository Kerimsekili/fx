module com.javafxmasterclass.readonlyprops {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxmasterclass.readonlyprops to javafx.fxml;
    exports com.javafxmasterclass.readonlyprops;
}