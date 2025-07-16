module mavenfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.javafxmasterclass.mavenfx to javafx.fxml;
    exports com.javafxmasterclass.mavenfx;
}