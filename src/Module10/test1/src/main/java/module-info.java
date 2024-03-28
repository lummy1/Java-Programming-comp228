module org.example.test1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.test1 to javafx.fxml;
    exports org.example.test1;
}