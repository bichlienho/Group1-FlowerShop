/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package flowershop;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;

/**
 * FXML Controller class
 *
 * @author traht
 */
public class RegisterController implements Initializable {
   
    @FXML
    private AnchorPane FRegister;

    @FXML
    private Button btncancel;

    @FXML
    private Button btncreate;

    @FXML
    private Button btnlogin;

    @FXML
    private CheckBox chnu;

    @FXML
    private CheckBox cknam;

    @FXML
    private TextField txtaddress;

    @FXML
    private TextField txtcode;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;

    @FXML
    private ComboBox<?> combo_role;

    @FXML
    private DatePicker picker_date;



    @FXML
    private PasswordField txtpass;

    @FXML
    private TextField txtphone;

    @FXML
    private void nutlogin(ActionEvent event) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Login");
        stage.setScene(new Scene(root));
        stage.show();
        FRegister.getScene().getWindow().hide();
    }
       
   @FXML
    private void nutthoat(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Register");
        stage.setScene(new Scene(root));
        stage.show();
        FRegister.getScene().getWindow().hide();
    }
        private java.sql.Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    
private void showAlert(Alert.AlertType type, String title, String content) {
    Alert alert = new Alert(type);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);
    alert.showAndWait();
}
      public void EmployeeAdd() {
    String sql = "INSERT INTO Employee (EmployeeName, Address, EmployeePhone, EmployeeEmail, EmployeePass,Dateofbirth,role) "
            + "VALUES(?,?,?,?,?,?,?)";

   connect = ConnectDB.getConnectDB();
    try {
        Alert alert;

        if (txtname.getText().isEmpty()
                || txtaddress.getText().isEmpty()
                || txtphone.getText().isEmpty()
                || txtemail.getText().isEmpty()
                || txtpass.getText().isEmpty()
                || picker_date.getValue() == null
                || combo_role.getSelectionModel().getSelectedItem() == null) {

            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All Blank Fields");
            alert.showAndWait();

                } else {
                prepare = connect.prepareStatement(sql);
                prepare.setString(1, txtname.getText());
                prepare.setString(2, txtaddress.getText());
                prepare.setString(3, txtphone.getText());
                prepare.setString(4, txtemail.getText());
                prepare.setString(5, txtpass.getText());
                prepare.setDate(6, java.sql.Date.valueOf(picker_date.getValue()));
                  prepare.setString(7, (String) combo_role.getSelectionModel().getSelectedItem());
            

         prepare.executeUpdate();

            alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Successfully Added!");
            alert.showAndWait();
registerClear() ;

        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
        public void registerClear() {
        txtname.setText("");
        txtaddress.setText("");
        txtphone.setText("");
                txtemail.setText("");
                           txtpass.setText("");
    }
    String listroleemployee[] = {"Admin", "User"};
         public void statusemployee() {

        List<String> listS = new ArrayList<>();

        for (String data :listroleemployee) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         combo_role.setItems(listData);
    }
    
    
   
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       statusemployee();
    }    
    
}
