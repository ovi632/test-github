module com.example.test_github {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test_github to javafx.fxml;
    exports com.example.test_github;
}