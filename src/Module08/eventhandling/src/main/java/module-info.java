module org.example.eventhandling {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.eventhandling to javafx.fxml;
    exports org.example.eventhandling;
}
