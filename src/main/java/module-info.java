module com.example.twod {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;

    opens com.example.twod to javafx.fxml;
    exports com.example.twod;
}