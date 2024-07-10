/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package flowershop;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.sql.*;
import java.util.Optional;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
/**
 *
 * @author traht
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private FontAwesomeIcon close;
    @FXML
    private CheckBox ckshow;
    @FXML
    private Button loginBtn;
    @FXML
    private TextField pass_show;
    @FXML
    private AnchorPane main_from;

    @FXML
    private PasswordField password;

    @FXML
        private TextField email;
       @FXML
    private Button forgetbtn;
        @FXML
    private AnchorPane fLogin;
    
  private Connection connect;
  private PreparedStatement prepare;
  private ResultSet result;
  
     @FXML
    private void nutdk(ActionEvent event) throws IOException {
      Parent root = FXMLLoader.load(getClass().getResource("Register.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Register");
        stage.setScene(new Scene(root));
        stage.show();
        fLogin.getScene().getWindow().hide();
    }
  
  

    private double x = 0;
    private double y = 0;
  
 public void login() {
    String sql = "SELECT * FROM Employee WHERE EmployeeEmail = ? and EmployeePass = ?";
    connect = ConnectDB.getConnectDB();
    try {
        prepare = connect.prepareStatement(sql);
        prepare.setString(1, email.getText());
        prepare.setString(2, password.getText());

        result = prepare.executeQuery();

        Alert alert;
        if (email.getText().isEmpty() || password.getText().isEmpty()) {
            alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all blank fields");
            alert.showAndWait();
        } else {
            if (result.next()) {
                String userEmail = email.getText();
                
                // Validate email format and length
                if (userEmail.length() <= 30 && userEmail.matches("^[A-Za-z0-9._%+-]+@gmail\\.com$")) {
                    String role = result.getString("role");  // Get user role from query result

                    alert = new Alert(Alert.AlertType.INFORMATION);
                    alert.setTitle("Information Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Successfully Logged In as " + role);
                    alert.showAndWait();

                    getData.username = userEmail;
                    
                    // Close current login window
                    loginBtn.getScene().getWindow().hide();

                    // Open interface based on user role
                    Parent root;
                    if ("Admin".equals(role)) {
                        root = FXMLLoader.load(getClass().getResource("Dashboard.fxml"));
                    } else {
                        root = FXMLLoader.load(getClass().getResource("fUser.fxml"));
                    }

                    Stage stage = new Stage();
                    Scene scene = new Scene(root);

                    // Add window drag functionality
                    root.setOnMousePressed((MouseEvent event) -> {
                        x = event.getSceneX();
                        y = event.getSceneY();
                    });
                    root.setOnMouseDragged((MouseEvent event) -> {
                        stage.setX(event.getScreenX() - x);
                        stage.setY(event.getScreenY() - y);
                    });

                    stage.initStyle(StageStyle.TRANSPARENT);
                    stage.setScene(scene);
                    stage.show();
                } else {
                    alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error Message");
                    alert.setHeaderText(null);
                    alert.setContentText("Invalid Email Format or Length (max 30 characters, must be @gmail.com)");
                    alert.showAndWait();
                }
            } else {
                alert = new Alert(Alert.AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Wrong Email/Password");
                alert.showAndWait();
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}


    public void close(){
        System.exit(0);
    }
       
    public void showPassword() {

        if (ckshow.isSelected()) {
            pass_show.setText(password.getText());
            pass_show.setVisible(true);
            password.setVisible(false);
        } else {
            password.setText(pass_show.getText());
            pass_show.setVisible(false);
            password.setVisible(true);
        }

    }
   public void likforget() {

         try {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("You Are Forgetting Your Password !");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                // HIDE YOUR DASHBOARD FORM
                forgetbtn.getScene().getWindow().hide();

                // LINK YOUR LOGIN FORM
                Parent root = FXMLLoader.load(getClass().getResource("Forgetpassword.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();

                root.setOnMousePressed((MouseEvent event) -> {
                    x = event.getSceneX();
                    y = event.getSceneY();
                });

                root.setOnMouseDragged((MouseEvent event) -> {
                    stage.setX(event.getScreenX() - x);
                    stage.setY(event.getScreenY() - y);

                    stage.setOpacity(.8);
                });

                root.setOnMouseReleased((MouseEvent event) -> {
                stage.setOpacity(1);
                });

                stage.initStyle(StageStyle.TRANSPARENT);

                stage.setScene(scene);
                stage.show();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
