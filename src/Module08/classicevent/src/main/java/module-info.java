module classicevent {
    requires javafx.controls;
    requires javafx.fxml;

    opens classicevent to javafx.fxml;
    exports classicevent;
}
