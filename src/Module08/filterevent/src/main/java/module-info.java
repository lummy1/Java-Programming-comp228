module filterevent {
    requires javafx.controls;
    requires javafx.fxml;

    opens filterevent to javafx.fxml;
    exports filterevent;
}
