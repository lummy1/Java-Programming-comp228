module org.example.connection {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.connection to javafx.fxml;
    exports org.example.connection;
}