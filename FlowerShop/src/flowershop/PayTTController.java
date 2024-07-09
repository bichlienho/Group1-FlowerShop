/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package flowershop;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author traht
 */



public class PayTTController implements Initializable {
    @FXML
    private Button card_btn;

    @FXML
    private Button cash_btn;

    @FXML
    private Button thoat_btn;
        @FXML
    private AnchorPane purchase_from;
    /**
     * Initializes the controller class.
     */
     @FXML
    private void nutvepurchase(ActionEvent event) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("PayTT.fxml"));
        Stage stage = new Stage();
        stage.setTitle("ForgetPassword");
        stage.setScene(new Scene(root));
        stage.show();
        purchase_from.getScene().getWindow().hide();
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
