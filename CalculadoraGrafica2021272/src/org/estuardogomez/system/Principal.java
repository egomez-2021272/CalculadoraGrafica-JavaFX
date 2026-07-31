/*
    Programdor: Estuardo Daniel Gómez Chity
    Código Técnico: IN5AM 
    Carné: 2021272
    Fecha de creacion: 19/03/25
    Fecha de modificaciónÑ 26/03/25

*/

package org.estuardogomez.system;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

public class Principal extends Application {//proporciona la infraestructura para manejar una aplicacion FX
    
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage escenarioPrincipal) throws Exception{// punto de entrada para configurar la vista
        Parent root = FXMLLoader.load(getClass().getResource("/org/estuardogomez/view/CalculadoraView.fxml"));

        // lectura de un documento FXML
        escenarioPrincipal.getIcons().add(new Image("/org/estuardogomez/image/iconoCalculadora.png"));
        escenarioPrincipal.setTitle("Estuardo Daniel Gómez Chity");
        //String css = Principal.class.getResource("/org/estuardogomez/resource/CalcuCSS.css").toExternalForm();
        Scene escena = new Scene(root);   
        //escena.getStylesheets().add(css);
        escenarioPrincipal.setScene(escena);
        escenarioPrincipal.show();

    }
    
}
