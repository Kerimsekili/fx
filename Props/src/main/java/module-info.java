module com.javafxmasterclass.props {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.javafxmasterclass.props to javafx.fxml;
    exports com.javafxmasterclass.props;
}