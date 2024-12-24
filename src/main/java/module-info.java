module com.example.lab1javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab1javafx to javafx.fxml;
    exports com.example.lab1javafx;
}