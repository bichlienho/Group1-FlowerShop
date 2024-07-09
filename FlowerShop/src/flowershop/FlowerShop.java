/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package flowershop;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 *
 * @author traht
 */
public class FlowerShop extends Application {
    private double x=0;
    private double y=0;
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        Scene scene = new Scene(root);
        root.setOnMousePressed((MouseEvent event) -> {
            x=event.getSceneX();
            y=event.getSceneY();
            
        });
        
          root.setOnMouseDragged((MouseEvent event) -> {
           stage.setX(event.getSceneX() - x);
             stage.setY(event.getSceneY() - y);
             
             stage.setOpacity(.8);
        });
           root.setOnMouseReleased((MouseEvent event) -> {
          stage.setOpacity(1);
        });
        
        
        
        
        
        stage.setScene(scene);
        stage.show();
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
