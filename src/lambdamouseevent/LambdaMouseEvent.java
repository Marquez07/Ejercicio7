/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdamouseevent;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class LambdaMouseEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text texto = new Text(100,125,"Programming is fun");
        
        texto.setOnMouseDragged(e-> {
            //Modificar las coordenadas x e y del texto conforme a la posicion del raton
            //texto.setCursor(e->getScreenX());
            texto.setX(e.getX());
            texto.setY(e.getY());
        });
        
        Pane root = new Pane();
        root.getChildren().add(texto);               
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Mover Texto Con Un Ratón");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
