module local.murilo.calcgrafico {
    requires javafx.controls;
    requires javafx.fxml;

    opens local.murilo.calcgrafico to javafx.fxml;
    exports local.murilo.calcgrafico;
}
