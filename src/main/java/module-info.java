module sixquiprend.javafx.sixquiprenddiane {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires java.logging;


    opens sixquiprend.javafx.sixquiprendjava to javafx.fxml;
    exports sixquiprend.javafx.sixquiprendjava;
}