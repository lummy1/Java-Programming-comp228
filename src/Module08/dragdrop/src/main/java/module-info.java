module dragdrop {
    requires javafx.controls;
    requires javafx.fxml;

    opens dragdrop to javafx.fxml;
    exports dragdrop;
}
