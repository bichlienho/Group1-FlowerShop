/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package flowershop;

import java.io.IOException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 * FXML Controller class
 *
 * @author traht
 */

public class ForgetpasswordController implements Initializable {
    
    @FXML
    private Button btnsend;

    @FXML
    private AnchorPane fForget;

    @FXML
    private TextField txtemail;

    @FXML
    private TextField txtname;

    @FXML
    private PasswordField txtpass;
      @FXML
    private TextField employee_address;

    @FXML
    private TableColumn<Employee,String> employee_col_address;

    @FXML
    private TableColumn<Employee,String> employee_col_date;

    @FXML
    private TableColumn<Employee,String> employee_col_email;

    @FXML
    private TableColumn<Employee,Integer> employee_col_id;

    @FXML
    private TableColumn<Employee,String> employee_col_name;

    @FXML
    private TableColumn<Employee,String> employee_col_phone;

    @FXML
    private TableColumn<Employee,String> employee_col_status;

    @FXML
    private TableColumn<Employee,String> employee_col_pass;
    @FXML
    private TableColumn<Employee,String> employee_col_role;
    @FXML
    private ComboBox<?> employee_role;
    @FXML
    private DatePicker employee_date;
    @FXML
    private TextField employee_email;

    @FXML
    private TextField employee_id;

    @FXML
    private TextField employee_name;

    @FXML
    private TextField employee_pass;

    @FXML
    private TextField employee_phone;
    @FXML
    private ComboBox<?> employee_status;

      
   @FXML
    private void nutthoat(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Register");
        stage.setScene(new Scene(root));
        stage.show();
        fForget.getScene().getWindow().hide();
    }
        private java.sql.Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
      public ObservableList<Employee> EmployeeListData() {
 ObservableList<Employee> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Employee";
         connect = ConnectDB.getConnectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            Employee emp;

            while (result.next()) {
                emp = new Employee(result.getInt("EmployeeId"),
                         result.getString("EmployeeName"), result.getString("Address"),
                         result.getString("EmployeePhone"), result.getString("EmployeeEmail"),
                         result.getString("EmployeePass"), result.getDate("Dateofbirth"), result.getString("status"), result.getString("role"));

                listData.add(emp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    
   public void Employeeforget() {
    connect = ConnectDB.getConnectDB();
    
    // Validate input fields
    if (txtname.getText().isEmpty()
            || txtemail.getText().isEmpty()
            || txtpass.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Please fill all blank fields.");
        return;
    }

    // Confirmation dialog
    Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
    confirmation.setTitle("Confirmation Dialog");
    confirmation.setHeaderText(null);
    confirmation.setContentText("Are you sure you want to get this user's new password?");
    Optional<ButtonType> option = confirmation.showAndWait();

    if (option.isPresent() && option.get() == ButtonType.OK) {
        final String checkSql = "SELECT * FROM Employee WHERE EmployeeName = ? AND EmployeeEmail = ?";
        
        try (PreparedStatement checkStmt = connect.prepareStatement(checkSql)) {
            checkStmt.setString(1, txtname.getText());
            checkStmt.setString(2, txtemail.getText());
            
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    final String updateSql = "UPDATE Employee SET EmployeePass = ? WHERE EmployeeId = ?";
                    
                    try (PreparedStatement updateStmt = connect.prepareStatement(updateSql)) {
                        updateStmt.setString(1, txtpass.getText());
                        updateStmt.setInt(2, rs.getInt("EmployeeId"));
                        
                        int affectedRows = updateStmt.executeUpdate();
                        
                        if (affectedRows > 0) {
                            showAlert(Alert.AlertType.INFORMATION, "Information Message", "Successfully!");
                        } else {
                            showAlert(Alert.AlertType.WARNING, "Warning Message", "Unsuccessful.");
                        }
                    }
                } else {
                    showAlert(Alert.AlertType.ERROR, "Error Message", "Invalid Name or Email.");
                }
                 forgetClear();
            }
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error Message", e.getMessage());
        }
    }
}
  public void forgetClear() {
        txtname.setText("");
        txtemail.setText("");
        txtpass.setText("");
    }
// Helper method to show alerts
private void showAlert(Alert.AlertType type, String title, String content) {
    Alert alert = new Alert(type);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);
    alert.showAndWait();
}

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
