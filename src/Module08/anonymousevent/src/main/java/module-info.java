module anonymousevent {
    requires javafx.controls;
    requires javafx.fxml;

    opens anonymousevent to javafx.fxml;
    exports anonymousevent;
}
