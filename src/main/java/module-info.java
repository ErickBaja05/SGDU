module com.EC2026.SGDU {
    // Módulos JavaFX
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.fontawesome;

    // Otros módulos comunes
    requires java.sql;
    requires java.desktop;
    requires javafx.base;

    opens com.EC2026.SGDU.administración.gestionUsuarios.controller to javafx.fxml;
    opens com.EC2026.SGDU.administración.gestionParámetros.controller to javafx.fxml;
    opens com.EC2026.SGDU.contratos.controller to javafx.fxml;
    opens com.EC2026.SGDU.eventos.controller to javafx.fxml;
    opens com.EC2026.SGDU.finanzas.controller to javafx.fxml;
    opens com.EC2026.SGDU.membresias.controller to javafx.fxml;
    opens com.EC2026.SGDU.socios.controller to javafx.fxml;
    opens com.EC2026.SGDU.app to javafx.fxml;

    opens com.EC2026.SGDU.administración.gestionUsuarios.dto to javafx.base;
    opens com.EC2026.SGDU.administración.gestionParámetros.dto to javafx.base;
    opens com.EC2026.SGDU.contratos.dto to javafx.base;
    opens com.EC2026.SGDU.eventos.dto to javafx.base;
    opens com.EC2026.SGDU.finanzas.dto to javafx.base;
    opens com.EC2026.SGDU.membresias.dto to javafx.base;
    opens com.EC2026.SGDU.socios.dto to javafx.base;

    exports com.EC2026.SGDU.app;
}