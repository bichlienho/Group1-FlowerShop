/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package flowershop;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.Stack;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.application.Platform;
import javafx.scene.chart.XYChart;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.control.DatePicker;
import org.w3c.dom.Document;
/**
 * FXML Controller class
 *
 * @author traht
 */
public class UserController implements Initializable {
  @FXML
    private TextField edit_address;

    @FXML
    private DatePicker edit_date;

    @FXML
    private TextField edit_email;

    @FXML
    private AnchorPane edit_form;

    @FXML
    private TextField edit_name;

    @FXML
    private TextField edit_phone;

    @FXML
    private Button edit_save;

    @FXML
    private Button editprofile;
    @FXML
    private AnchorPane main_from;
    @FXML
    private Button Customer;
    @FXML
    private AnchorPane Customer_Form;
    @FXML
    private AnchorPane Employee_form;
    @FXML
    private TableColumn<flower_Data, String> availableFlower_col_flowerid;
    @FXML
    private TableColumn<flower_Data, String> availableFlower_col_flowername;
    @FXML
    private TableColumn<flower_Data, String> availableFlower_col_flowerprice;
    @FXML
    private TableColumn<flower_Data, String> availableFlower_col_flowerstatus;
    @FXML
    private AnchorPane availableFlower_form;
    @FXML
    private TableView<flower_Data> availableFlower_tableView;
    @FXML
    private Button availableflower;
    @FXML
  private FontAwesomeIcon cancelbtn;

    @FXML
    private Button employee;
    @FXML
    private Button home;
       @FXML
    private ComboBox<?> sell_customerid;
    @FXML
    private TextField employee_search;
    @FXML
    private ComboBox<?> invendetailbtn;
      @FXML
    private  BarChart<String, Number> home_chart;
    
    @FXML
    private TextField supplier_search;
    @FXML
    private TextField home_customer;
    @FXML
    private AnchorPane home_form;
    @FXML
    private TextField home_income;
    @FXML
    private TextField home_sell;
    @FXML
    private Button inventory;
    @FXML
    private AnchorPane inventory_form;
    @FXML
    private FontAwesomeIcon logoutBtn;
        @FXML
    private TextField detail_search;
            @FXML
    private Button bill_btn;
    @FXML
   private Button product_addBtn;
    @FXML
    private Button product_deleteBtn;
    @FXML
    private TextField product_flowerID;
    @FXML
    private TextField product_flowername;
    @FXML
    private TextField product_flowerprice;
    @FXML
    private ImageView product_imageView;
    @FXML
    private Button product_importBtn;
    @FXML
    private Button product_reserBtn;
    @FXML
    private TextField product_search;
    @FXML
    private ComboBox<?> product_status;
    @FXML
    private Button product_uploadBtn;
    @FXML
    private Button productdetail;
    @FXML
    private AnchorPane productdetail_form;
    @FXML
    private Button purchase;
    @FXML
    private AnchorPane purchase_from;
    @FXML
    private Button addtocartbtn;
    @FXML
    private TableView<invoicedata> sell_tableview;
    @FXML
    private TableColumn<invoicedata, Integer> sell_col_flowerID;
    @FXML
    private TableColumn<invoicedata, String> sell_col_flowername;
    @FXML
    private TableColumn<invoicedata, String> sell_col_flowerprice;
    @FXML
    private TableColumn<invoicedata,Integer> sell_col_flowerquantity;
    @FXML
    private TableColumn<invoicedata, String> sell_col_flowerpayment;
    @FXML
    private TableColumn<invoicedata, Date> sell_col_flowerdate;
    @FXML
    private TableColumn<invoicedata,Integer> sell_col_customerid;
    @FXML
    private ComboBox<?> sell_flowerID;
    @FXML
    private ComboBox<?> sell_payment;
    @FXML
    private ComboBox<?> sell_flowername;
    @FXML
    private Button sell_paybtn;
    @FXML
    private TextField quantityinvoice;
    @FXML
    private TextField sell_total;
    @FXML
    private Button supplier;
    @FXML
    private AnchorPane supplier_form;
    @FXML
    private Label username;
    @FXML
    private ComboBox<?> detailflowerid;
    @FXML
    private TableColumn<customer, String> customer_col_ADDRESS;
    @FXML
    private TableColumn<customer, String> customer_col_EMAIL;
    @FXML
    private TableColumn<customer, Integer> customer_col_GENDER;
    @FXML
    private TableColumn<customer, Integer> customer_col_ID;
    @FXML
    private TableColumn<customer, String> customer_col_NAME;
    @FXML
    private TableColumn<customer, String> customer_col_PHONE;
    @FXML
    private TableView<customer> customer_tableView;
    @FXML
    private TableColumn<customer, String> customer_col_pass;
    @FXML
    private TableColumn<customer, String> customer_col_STATUS;
    @FXML
    private ComboBox<?> customerstatus;
    @FXML
    private RadioButton gtnam;
    @FXML
    private RadioButton gtnu;
    @FXML
    private Button customer_addbtn;
    @FXML
    private TextField customer_address;
    @FXML
    private Button customer_deletebtn;
    @FXML
    private TextField customer_email;
    @FXML
    private TextField customer_id;
    @FXML
    private TextField customer_name;
    @FXML
    private TextField customer_pass;
    @FXML
    private TextField customer_phone;
    @FXML
    private Button customer_resetbtn;
    @FXML
    private Button customer_updatebtn;
    @FXML
    private ComboBox<?> detail_name;
    @FXML
    private TableColumn<Detail,String> detail_col_color;
    @FXML
    private TableColumn<Detail,String> detail_col_des;
    @FXML
    private TableColumn<Detail,Integer> detail_col_id;
    @FXML
    private TableColumn<Detail,String> detail_col_mass;
    @FXML
    private TableColumn<Detail,String> detail_col_price;
    @FXML
    private TextField detail_color;
    @FXML
    private TextField detail_des;
    @FXML
    private Button detail_image;
    @FXML
    private TextField detail_mass;
    @FXML
    private ComboBox<?> detail_price;
    @FXML
    private TableView<Detail> detail_tableview;
        @FXML
    private TextField search_inventory;
    @FXML
    private TableColumn<Supplier,Integer> supplier_col_productid;
   @FXML
    private TableColumn<Supplier,String> supplier_col_address;
    @FXML
    private TableColumn<Supplier,String> supplier_col_email;
    @FXML
    private TableColumn<Supplier,String> supplier_col_id;
    @FXML
    private TableColumn<Supplier,String> supplier_col_name;
    @FXML
    private TableColumn<Supplier,String> supplier_col_phone;
    @FXML
    private TableColumn<Supplier,String> supplier_col_price;
    @FXML
    private TableColumn<Supplier,String> supplier_col_quantity;
    @FXML
    private TableColumn<Supplier,String> supplier_col_status;
    @FXML
    private TableView<Supplier> supplier_tavleview;
    @FXML
    private TextField supplieraddress;
    @FXML
    private TextField supplieremail;
    @FXML
    private TextField supplierid;
    @FXML
    private TextField suppliername;
    @FXML
    private TextField supplierphone;
    @FXML
    private TextField supplierpriceinput;
    @FXML
    private TextField supplierquantity;
    @FXML
    private ComboBox<?> supplierstatus;
        @FXML
    private ComboBox<?> supplier_productid;
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
    private TableView<Employee> employee_tableview;
     @FXML
    private TableColumn<Inventory,String> inventoru_col_quantity;


    @FXML
    private TableColumn<Inventory,String> inventory_col_dateadd;

    @FXML
    private TableColumn<Inventory,String> inventory_col_dateupdate;

    @FXML
    private TableColumn<Inventory,Integer> inventory_col_id;

    @FXML
    private TableColumn<Inventory,Integer> inventory_col_product;

    @FXML
    private TableColumn<Inventory,String> inventory_col_supplier;

    @FXML
    private DatePicker inventory_dateadd;

    @FXML
    private DatePicker inventory_dateupdate;

    @FXML
    private TableColumn<Detail,Integer> inventorydetail;

    @FXML
    private TextField inventory_id;

    @FXML
    private ComboBox<?> inventory_product;

    @FXML
    private TextField inventory_quantity;

    @FXML
    private ComboBox<?> inventory_supplier;
    @FXML
    private TextField customer_seach;
    @FXML
    private TableView<Inventory> inventory_tableview;
        @FXML
    private AnchorPane bill_form;
    private ObservableList<flower_Data> CustomerListData;

    private java.sql.Connection connect;
    private PreparedStatement prepare;
    private Statement statement;
    private ResultSet result;
    private Image image;

 //show home   
  public void homeAF() {
    String sql = "SELECT COUNT(*) AS count_available FROM Product WHERE status = 'Available'";
    
    Connection connect = null;
    Statement statement = null;
    ResultSet result = null;

    try {
        connect = ConnectDB.getConnectDB();
        statement = connect.createStatement();
        result = statement.executeQuery(sql);
        
        int countAF = 0;
        
        if (result.next()) {
            countAF = result.getInt("count_available");
        }
        home_sell.setText(String.valueOf(countAF));

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close resources in a finally block
        try {
            if (result != null) result.close();
            if (statement != null) statement.close();
            if (connect != null) connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

     public void homeTI(){
        
      String sql = "SELECT COUNT(*) AS count_invoices FROM Invoice";
    
    Connection connect = null;
    Statement statement = null;
    ResultSet result = null;

    try {
        connect = ConnectDB.getConnectDB();
        statement = connect.createStatement();
        result = statement.executeQuery(sql);
        
        int countCustomers = 0;
        
        if (result.next()) {
            countCustomers = result.getInt("count_invoices");
        }
        
        home_income.setText(String.valueOf(countCustomers));

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close resources in a finally block
        try {
            if (result != null) result.close();
            if (statement != null) statement.close();
            if (connect != null) connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    }
    
    public void homeTC() {
    String sql = "SELECT COUNT(*) AS count_customers FROM Customer";
    
    Connection connect = null;
    Statement statement = null;
    ResultSet result = null;

    try {
        connect = ConnectDB.getConnectDB();
        statement = connect.createStatement();
        result = statement.executeQuery(sql);
        
        int countCustomers = 0;
        
        if (result.next()) {
            countCustomers = result.getInt("count_customers");
        }
        
        home_customer.setText(String.valueOf(countCustomers));

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        // Close resources in a finally block
        try {
            if (result != null) result.close();
            if (statement != null) statement.close();
            if (connect != null) connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
    
public void homeChart() {
    home_chart.getData().clear();

    String sql = "SELECT date, total FROM Invoice_info ORDER BY date ASC;";

    try (Connection connect = ConnectDB.getConnectDB();
         PreparedStatement prepare = connect.prepareStatement(sql);
         ResultSet result = prepare.executeQuery()) {

        XYChart.Series<String, Number> series = new XYChart.Series<>();
        series.setName("Total Income");

        while (result.next()) {
            String date = result.getString("date");
            String totalStr = result.getString("total");

            if (date != null && !date.trim().isEmpty() && totalStr != null && !totalStr.trim().isEmpty()) {
                try {
                    Double total = Double.parseDouble(totalStr.trim());
                    Platform.runLater(() -> series.getData().add(new XYChart.Data<>(date, total)));
                } catch (NumberFormatException e) {
                    Logger.getLogger(getClass().getName()).log(Level.WARNING, "Invalid total value: {0}", totalStr);
                }
            }
        }

        Platform.runLater(() -> home_chart.getData().add(series));

    } catch (Exception e) {
        Logger.getLogger(getClass().getName()).log(Level.SEVERE, "SQL error: {0}", e.getMessage());
    }
}





//product
 public void availableFlowersSelect() {
        flower_Data flower = availableFlower_tableView.getSelectionModel().getSelectedItem();
        int num = availableFlower_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        product_flowerID.setText(String.valueOf(flower.getFlower_id()));
        product_flowername.setText(flower.getName());
        product_flowerprice.setText(String.valueOf(flower.getPrice()));

        getData.path = flower.getImage();

        String uri = "file:" + flower.getImage();

        image = new Image(uri, 154, 150, false, true);
        product_imageView.setImage(image);

    }

public void availableFlowersUpdate() {
        Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Update ");
            alert.showAndWait();

}


 public void availableFlowersAdd() {
      Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Add ");
            alert.showAndWait();
}


     public void availableFlowersDeleted() {
       Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Delete ");
            alert.showAndWait();
    }

    //status product
       String listStatus[] = {"Available", "Not Available"};
         public void availableFlowersStatus() {

        List<String> listS = new ArrayList<>();

        for (String data : listStatus) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         product_status.setItems(listData);

    }

        public void availableFlowersClear() {

        product_flowerID.setText("");
        product_flowername.setText("");
        product_status.getSelectionModel().clearSelection();
        product_flowerprice.setText("");
        getData.path = "";

        product_imageView.setImage(null);

    }

    public void availableFlowersInsertImage() {

        FileChooser open = new FileChooser();
        open.setTitle("Open Image File");
        open.getExtensionFilters().add(new ExtensionFilter("Image File", "*jpg", "*png"));

        File file = open.showOpenDialog(main_from.getScene().getWindow());

        if (file != null) {

            getData.path = file.getAbsolutePath();

            image = new Image(file.toURI().toString(), 154, 150, false, true);
            product_imageView.setImage(image);

        }

    }
 //productshow   
  public ObservableList<flower_Data> availableFlowersListData() {
 ObservableList<flower_Data> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Product";

         connect = ConnectDB.getConnectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            flower_Data flower;

            while (result.next()) {
                flower = new flower_Data(result.getInt("flower_id"),
                         result.getString("name"), result.getString("status"),
                         result.getString("price"), result.getString("image"),
                         result.getDate("date"));

                listData.add(flower);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
        
    }

 private ObservableList<flower_Data> availableFlowersList;

    public void availableFlowersShowListData() {
        availableFlowersList = availableFlowersListData();

        availableFlower_col_flowerid.setCellValueFactory(new PropertyValueFactory<>("flower_id"));
        availableFlower_col_flowername.setCellValueFactory(new PropertyValueFactory<>("name"));
        availableFlower_col_flowerprice.setCellValueFactory(new PropertyValueFactory<>("price"));
        availableFlower_col_flowerstatus.setCellValueFactory(new PropertyValueFactory<>("status"));
        
        availableFlower_tableView.setItems(availableFlowersList);
    }
    
     public void availableFlowersSearch() {

        FilteredList<flower_Data> filter = new FilteredList<>(availableFlowersList, e -> true);

    product_search.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(flowerData -> {
            if (newValue == null || newValue.isEmpty()) {
                return true;
            }

            String searchKey = newValue.toLowerCase();

            if (flowerData.getFlower_id().toString().contains(searchKey)) {
                return true;
            } else if (flowerData.getName().toLowerCase().contains(searchKey)) {
                return true;
            } else if (flowerData.getStatus().toLowerCase().contains(searchKey)) {
                return true;
            } else if (flowerData.getPrice().toString().contains(searchKey)) {
                return true;
            } else {
                return false;
            }
        });
    });

    availableFlower_tableView.setItems(filter);

    }
     
     
     
//sell    
         public void purchaseFlowerId() {
 String sql = "SELECT status, flower_id FROM Product WHERE status IN ('Available', 'Not Available')";

        connect = ConnectDB.getConnectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            ObservableList listsp = FXCollections.observableArrayList();

            while (result.next()) {
                listsp.add(result.getInt("flower_id"));
            }
            sell_flowerID.setItems(listsp);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public void purchaseFlowerName() {

        String sql = "SELECT status, name FROM Product WHERE status IN ('Available', 'Not Available')";

        connect = ConnectDB.getConnectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            ObservableList listsp = FXCollections.observableArrayList();

            while (result.next()) {
                listsp.add(result.getString("name"));
            }
            sell_flowername.setItems(listsp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
        public void purchasecustomerid() {
        String sql = "SELECT CustomerID FROM Customer WHERE status IN ('Normal Customers', 'Vip Customers')";

        connect = ConnectDB.getConnectDB();

        try {
            ObservableList listsp = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                listsp.add(result.getInt("CustomerID"));
            }
             sell_customerid.setItems(listsp);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    //invoiceshowcart
public ObservableList<invoicedata> InvoiceListData() {
 ObservableList<invoicedata> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Invoice";

         connect = ConnectDB.getConnectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            invoicedata inv;

            while (result.next()) {
                inv = new invoicedata(result.getInt("customer_id"),
                         result.getInt("flower_id"), result.getString("name"),
                         result.getInt("quantity"), result.getString("price"),result.getDate("date"),
                         result.getString("payment"),result.getInt("CustomerID"));

                listData.add(inv);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
        
    }
private ObservableList<invoicedata> InvoiceList;
public void InvoiceShowListData() {
        InvoiceList=  InvoiceListData();

        sell_col_flowerID.setCellValueFactory(new PropertyValueFactory<>("flower_id"));
       sell_col_flowername.setCellValueFactory(new PropertyValueFactory<>("name"));
       sell_col_flowerquantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        sell_col_flowerprice.setCellValueFactory(new PropertyValueFactory<>("price"));
       sell_col_flowerpayment.setCellValueFactory(new PropertyValueFactory<>("payment"));
       sell_col_flowerdate.setCellValueFactory(new PropertyValueFactory<>("date"));
      sell_col_customerid.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
       sell_tableview.setItems(InvoiceList);
    }

public void sellAdd() {
    String sql = "INSERT INTO Invoice (flower_id, name, quantity, price, date, payment, CustomerID) VALUES (?, ?, ?, ?, ?, ?, ?)";
    Connection connect = null;
    PreparedStatement prepare = null;

    try {
        connect = ConnectDB.getConnectDB();

        // Validate inputs
        if (sell_flowerID.getSelectionModel().isEmpty() ||
            sell_flowername.getSelectionModel().isEmpty() ||
            quantityinvoice.getText().isEmpty() ||
            sell_payment.getSelectionModel().isEmpty() ||
            sell_customerid.getSelectionModel().isEmpty()) {

            // Display an error message if any field is empty
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please fill all blank fields.");
            alert.showAndWait();
            return; // Exit method if fields are empty
        }

        // Prepare statement for inserting data
        prepare = connect.prepareStatement(sql);

        // Ensure the selected item is cast to Integer
        prepare.setInt(1, (Integer) sell_flowerID.getSelectionModel().getSelectedItem());
        prepare.setString(2, (String) sell_flowername.getSelectionModel().getSelectedItem());

        // Convert quantity to int
        int quantity = Integer.parseInt(quantityinvoice.getText());
        prepare.setInt(3, quantity);

        // Calculate price (assuming calculatePrice() returns a String)
        String price = calculatePrice((String) sell_flowername.getSelectionModel().getSelectedItem(), quantity);
        prepare.setString(4, price);

        // Set current date
        java.sql.Date sqlDate = new java.sql.Date(System.currentTimeMillis());
        prepare.setDate(5, sqlDate);

        // Set payment and customer ID
        prepare.setString(6, (String) sell_payment.getSelectionModel().getSelectedItem());

        // Ensure the selected item is cast to Integer
        prepare.setInt(7, (Integer) sell_customerid.getSelectionModel().getSelectedItem());

        // Execute insert statement
        int rowsInserted = prepare.executeUpdate();
        if (rowsInserted > 0) {
            // Show success message
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Successfully added!");
            alert.showAndWait();

            // Refresh table view and clear inputs
            InvoiceShowListData();
            purchaseDisplayTotal();
            PurchaseClear();
        } else {
            // Handle case where no rows were inserted (optional)
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Failed to add record. Please try again.");
            alert.showAndWait();
        }

    } catch (NumberFormatException e) {
        // Handle number format exception (if quantity is not a valid integer)
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Invalid quantity format. Please enter a valid number.");
        alert.showAndWait();
        e.printStackTrace();
    } catch (Exception e) {
        // Handle SQL exception (e.g., database connectivity issues)
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error Message");
        alert.setHeaderText(null);
        alert.setContentText("Database error: " + e.getMessage());
        alert.showAndWait();
        e.printStackTrace();
    } finally {
        // Ensure resources are closed
        try { if (prepare != null) prepare.close(); } catch (Exception e) { e.printStackTrace(); }
        try { if (connect != null) connect.close(); } catch (Exception e) { e.printStackTrace(); }
    }
}




private String calculatePrice(String flowerName, int quantity) {
    String basePrice = "0";
    String query = "SELECT price FROM Product WHERE name = ?";

    try (Connection connection = ConnectDB.getConnectDB();
         PreparedStatement statement = connection.prepareStatement(query)) {

        statement.setString(1, flowerName);
        try (ResultSet resultSet = statement.executeQuery()) {
            if (resultSet.next()) {
                basePrice = resultSet.getString("price");
            } else {
                throw new RuntimeException("No price found for flower: " + flowerName);
            }

            double price = Double.parseDouble(basePrice);

            if (quantity > 10) {
                price = price * 10 + price * 0.05 * (quantity - 10);
            } else {
                price = price * quantity;
            }

            return String.format("%.2f", price);
        }

    } catch (Exception e) {
        e.printStackTrace();
        return basePrice; // Return base price on error
    }
}

private int customerId;
public void purchaseCustomerId() {

        String sql = "SELECT MAX(customer_id) FROM Invoice";

        connect = ConnectDB.getConnectDB();

        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            if (result.next()) {
                customerId = result.getInt("MAX(customer_id)");
            }

            int countData = 0;

            String checkInfo = "SELECT MAX(customer_id) FROM Invoice_info";

            prepare = connect.prepareStatement(checkInfo);
            result = prepare.executeQuery();

            if (result.next()) {
                countData = result.getInt("MAX(customer_id)");
            }

            if (customerId == 0) {
                customerId += 1;
            } else if (customerId == countData) {
                customerId = countData + 1;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
private double totalP = 0;
public void purchaseDisplayTotal() {

       invoicedata flower = sell_tableview.getSelectionModel().getSelectedItem();
        int num = sell_tableview.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        sell_total.setText(String.valueOf(flower.getPrice()));
}
public void purchasePay() {
    String sql = "INSERT INTO Invoice_info (customer_id, total, date) VALUES (?, ?, ?)";

    // Ensure input is valid before proceeding
    if (sell_total.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Please enter the total amount.");
        return;
    }

    // Check if the input can be parsed to a valid number
    double totalP;
    try {
        totalP = Double.parseDouble(sell_total.getText());
    } catch (NumberFormatException e) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Invalid total amount. Please enter a valid number.");
        return;
    }

    // Confirmation alert
    Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
    alert.setTitle("Confirmation Message");
    alert.setHeaderText(null);
    alert.setContentText("Are you sure you want to proceed with the payment?");
    Optional<ButtonType> option = alert.showAndWait();

    if (option.isPresent() && option.get() == ButtonType.OK) {
        try (Connection connect = ConnectDB.getConnectDB();
             PreparedStatement prepare = connect.prepareStatement(sql)) {

            // Assume customerId is a predefined variable
            prepare.setInt(1, customerId);
            prepare.setDouble(2, totalP);

            Date date = new Date();
            java.sql.Date sqlDate = new java.sql.Date(date.getTime());
            prepare.setDate(3, sqlDate);

            prepare.executeUpdate();
               
            showAlert(Alert.AlertType.INFORMATION, "Information Message", "Payment successful! Thank you for your purchase.");
          PurchaseClear();
        } catch (Exception e) {
            e.printStackTrace();
            showAlert(Alert.AlertType.ERROR, "Error Message", "An error occurred during the payment process. Please try again.");
        }
    }
}
     // Helper method to show alerts
private void showAlert(Alert.AlertType type, String title, String content) {
    Alert alert = new Alert(type);
    alert.setTitle(title);
    alert.setHeaderText(null);
    alert.setContentText(content);
    alert.showAndWait();
}
    public void PurchaseClear() {
        sell_flowerID.getSelectionModel().clearSelection();
       sell_flowername.getSelectionModel().clearSelection();
       sell_payment.getSelectionModel().clearSelection();
      quantityinvoice.setText("");
      sell_total.setText("");
      sell_customerid.getSelectionModel().clearSelection();
    }
    //choose payment
      String listpayment[] = {"Payment in cash", "Payment by card"};
         public void sell_Payment() {

        List<String> listS = new ArrayList<>();

        for (String data : listpayment) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         sell_payment.setItems(listData);
    }
  
         
         
//customer
         //customershow
      public ObservableList<customer> CustomerListData() {
 ObservableList<customer> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Customer";
         connect = ConnectDB.getConnectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            customer cus;

            while (result.next()) {
                cus = new customer(result.getInt("CustomerID"),
                         result.getString("CustomerName"), result.getString("Address"),
                         result.getString("Phone"), result.getString("Email"),result.getString("Password"),result.getInt("gender"),
                         result.getString("status"));

                listData.add(cus);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
      private ObservableList<customer> CustomerList;
      public void CustomerShowListData() {
        CustomerList=  CustomerListData();

        customer_col_ID.setCellValueFactory(new PropertyValueFactory<>("CustomerID"));
        customer_col_NAME.setCellValueFactory(new PropertyValueFactory<>("CustomerName"));
       customer_col_ADDRESS.setCellValueFactory(new PropertyValueFactory<>("Address"));
        customer_col_PHONE.setCellValueFactory(new PropertyValueFactory<>("Phone"));
       customer_col_EMAIL.setCellValueFactory(new PropertyValueFactory<>("Email"));
        customer_col_GENDER.setCellValueFactory(new PropertyValueFactory<>("gender"));
       customer_col_pass.setCellValueFactory(new PropertyValueFactory<>("Password"));
        customer_col_STATUS.setCellValueFactory(new PropertyValueFactory<>("status"));
       customer_tableView.setItems(CustomerList);
    }
     public void CustomerSearch() {
    FilteredList<customer> filter = new FilteredList<>(CustomerList, e -> true);

    customer_seach.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(custo -> {
            if (newValue == null || newValue.isEmpty()) {
                return true; // Show all items if filter text is empty
            }

            String searchKey = newValue.toLowerCase();

            // Modify conditions based on your Supplier class properties
            if (custo.getCustomerID().toString().contains(searchKey) ||
                custo.getCustomerName().toLowerCase().contains(searchKey) ||
                custo.getEmail().toLowerCase().contains(searchKey) ||
                custo.getPhone().toString().contains(searchKey)) {
                return true; // Filter matches one of the properties
            } else {
                return false; // Filter does not match any property
            }
        });
    });

    customer_tableView.setItems(filter); // Apply the filtered list to your table view
} 
public void CustomerAdd() {
      Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Add ");
            alert.showAndWait();

}

public void CustomerUpdate() {
       Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Update ");
            alert.showAndWait();

}

public void CustomerDeleted() {
       Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Delete");
            alert.showAndWait();

}
public void customerClear() {

       customer_id.setText("");
        customer_name.setText("");
        customer_address.setText("");
        customer_phone.setText("");
        customer_email.setText("");
       customer_pass.setText("");
        gtnam.setSelected(false);
        gtnu.setSelected(false);
        customerstatus.getSelectionModel().clearSelection();
        getData.path = "";


    }
public void CustomerSelect() {
        customer flower = customer_tableView.getSelectionModel().getSelectedItem();
        int num = customer_tableView.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }

        customer_id.setText(String.valueOf(flower.getCustomerID()));
        customer_name.setText(flower.getCustomerName());
        customer_address.setText(flower.getAddress());
        customer_phone.setText(flower.getPhone());
        customer_email.setText(flower.getEmail());
        customer_pass.setText(flower.getPassword());
    }
    //status product
       String chooseStatus[] = {"Normal Customers", "Vip Customers"};
         public void customerStatus() {

        List<String> listS = new ArrayList<>();

        for (String data : chooseStatus) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         customerstatus.setItems(listData);

    }
  
         
            
//productdetail
     public void ProductFlowerId() {
        String sql = "SELECT flower_id FROM Product WHERE status IN ('Available', 'Not Available')";

        connect = ConnectDB.getConnectDB();

        try {
            ObservableList listData = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                listData.add(result.getInt("flower_id"));
            }
             detailflowerid.setItems(listData);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
     
         public void SupplierFlowerId() {
        String sql = "SELECT NhacungcapID FROM Nhacungcap WHERE status IN ('Providing', 'Not Providing')";

        connect = ConnectDB.getConnectDB();

        try {
            ObservableList listData = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                listData.add(result.getInt("NhacungcapID"));
            }
             invendetailbtn.setItems(listData);
       

        } catch (Exception e) {
            e.printStackTrace();
       }
    }
  //choose payment
      String listprice[] = {"0$-10$", "11$-20$","20$-100$",">100$"};
         public void price() {

        List<String> listS = new ArrayList<>();

        for (String data :listprice) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         detail_price.setItems(listData);
    }
 public ObservableList<Detail> DetailListData() {
 ObservableList<Detail> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM ProductDetail";
         connect = ConnectDB.getConnectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            Detail del;

            while (result.next()) {
                del = new Detail(result.getInt("ProductDetailID"),
                         result.getString("mass"), result.getString("price"),
                         result.getString("color"), result.getInt("NhacungcapID"),result.getString("des"));

                listData.add(del);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
    private ObservableList<Detail>DetailList;
    public void DetailShowListData() {
       DetailList=   DetailListData();

        detail_col_id.setCellValueFactory(new PropertyValueFactory<>("ProductDetailID"));
        detail_col_mass.setCellValueFactory(new PropertyValueFactory<>("mass"));
       detail_col_price.setCellValueFactory(new PropertyValueFactory<>("price"));
        detail_col_color.setCellValueFactory(new PropertyValueFactory<>("color"));
         inventorydetail.setCellValueFactory(new PropertyValueFactory<>("NhacungcapID"));
       detail_col_des.setCellValueFactory(new PropertyValueFactory<>("des"));

       detail_tableview.setItems(DetailList);
    }
public void DetailSearch() {
    FilteredList<Detail> filter = new FilteredList<>(DetailList, e -> true);

    detail_search.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(detail -> {
            if (newValue == null || newValue.isEmpty()) {
                return true; // Show all items if filter text is empty
            }
            String searchKey = newValue.toLowerCase();

            // Modify conditions based on your Detail class properties
            return detail.getProductDetailID().toString().contains(searchKey) ||
                   detail.getMass().toLowerCase().contains(searchKey) ||
                   detail.getPrice().toLowerCase().contains(searchKey) ||
                   detail.getColor().toLowerCase().contains(searchKey) ||
                   detail.getDes().toLowerCase().contains(searchKey);
        });
    });

    // Bind the filtered list to the table view
    detail_tableview.setItems(filter);
}

     
public void DetailAdd() {   
        Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Add ");
            alert.showAndWait();

}

  public void DetailUpdate() {
       Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Update ");
            alert.showAndWait();

}

// Helper Methods



    public void DetailSelect() {
        Detail flower = detail_tableview.getSelectionModel().getSelectedItem();
        int num = detail_tableview.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        detail_mass.setText(flower.getMass());
        detail_color.setText(flower. getColor());
        detail_des.setText(flower.getDes());

    }
    public void DetailClear() {

        detail_mass.setText("");
       detail_color.setText("");
        detail_des.setText("");
        detailflowerid.getSelectionModel().clearSelection();
       detail_price.getSelectionModel().clearSelection();
       invendetailbtn.getSelectionModel().clearSelection();


    }
public void DetailDeleted() {
        Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Delete");
            alert.showAndWait();

}

  
//Supplier
  public void SupplierProductId() {
        String sql = "SELECT flower_id FROM Product WHERE status IN ('Available', 'Not Available')";

        connect = ConnectDB.getConnectDB();

        try {
            ObservableList listData = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                listData.add(result.getInt("flower_id"));
            }
             supplier_productid.setItems(listData);
           

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   public ObservableList<Supplier> SupplierListData() {
 ObservableList<Supplier> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Nhacungcap";
         connect = ConnectDB.getConnectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            Supplier sup;

            while (result.next()) {
                sup = new Supplier(result.getInt("NhacungcapID"),
                         result.getString("fullname"), result.getString("email"),
                         result.getString("phone"), result.getString("address"),
                         result.getString("priceinput"), result.getString("quantity"), result.getString("status"),result.getInt("ProductID"));

                listData.add(sup);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
   private ObservableList<Supplier>supplierlList;
    public void SupplierShowListData() {
       supplierlList= SupplierListData();

        supplier_col_id.setCellValueFactory(new PropertyValueFactory<>("NhacungcapID"));
        supplier_col_name.setCellValueFactory(new PropertyValueFactory<>("fullname"));
         supplier_col_email.setCellValueFactory(new PropertyValueFactory<>("email"));
        supplier_col_phone.setCellValueFactory(new PropertyValueFactory<>("phone"));
        supplier_col_address.setCellValueFactory(new PropertyValueFactory<>("address"));
        supplier_col_productid.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
       supplier_col_price.setCellValueFactory(new PropertyValueFactory<>("priceinput"));
        supplier_col_quantity.setCellValueFactory(new PropertyValueFactory<>("quantity"));
       supplier_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
       supplier_tavleview.setItems(supplierlList);
    }
    public void SupplierSelect() {
        Supplier flower = supplier_tavleview.getSelectionModel().getSelectedItem();
        int num = supplier_tavleview.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        supplierid.setText(String.valueOf(flower.getNhacungcapID() ));
        suppliername.setText(flower. getFullname());
        supplieremail.setText(flower. getEmail() );
        supplierphone.setText(flower.getPhone());
        supplieraddress.setText(flower. getAddress());
        supplierpriceinput.setText(flower.getPriceinput());
       supplierquantity.setText(flower.getQuantity());
    }
public void SupplierAdd() {   
        Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Add ");
            alert.showAndWait();

}

public void SupplierUpdate() {
      Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot update ");
            alert.showAndWait();

}

// Helper method to validate fields
private boolean areFieldsValid() {
    // Validate supplierid - must be numeric
    if (!supplierid.getText().matches("\\d+")) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Supplier ID must be numeric!");
        return false;
    }

    // Validate suppliername - maximum 20 characters
    if (suppliername.getText().length() > 20) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Supplier Name must not exceed 20 characters!");
        return false;
    }

    // Validate supplieremail - maximum 20 characters and ends with @gmail.com
    if (supplieremail.getText().length() > 20 || !supplieremail.getText().endsWith("@gmail.com")) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Email must be a valid @gmail.com address and not exceed 20 characters!");
        return false;
    }

    // Validate supplierphone - Vietnamese phone number pattern (example: 09xxxxxxx or 01xxxxxxx)
    if (!supplierphone.getText().matches("0[1-9][0-9]{8,9}")) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Phone number must follow Vietnamese phone number standards (09xxxxxxx or 01xxxxxxx)!");
        return false;
    }

    return true;
}


 public void SupplierDeleted() {
             Alert alert;

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("User Cannot Delete ");
            alert.showAndWait();

}
  public void SupplierClear() {

        supplierid.setText("");
       suppliername.setText("");
        supplieremail.setText("");
       supplierphone.setText("");
      supplieraddress.setText("");
        supplierpriceinput.setText("");
         supplierquantity.setText("");
       supplierstatus.getSelectionModel().clearSelection();
 supplier_productid.getSelectionModel().clearSelection();

    }
 
     String liststatussupp[] = {"Providing", "Not Providing"};
         public void statussupplier() {

        List<String> listS = new ArrayList<>();

        for (String data :liststatussupp) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         supplierstatus.setItems(listData);
    }
  public void SupplierSearch() {
    FilteredList<Supplier> filter = new FilteredList<>(supplierlList, e -> true);

    supplier_search.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(supplier -> {
            if (newValue == null || newValue.isEmpty()) {
                return true; // Show all items if filter text is empty
            }

            String searchKey = newValue.toLowerCase();

            // Modify conditions based on your Supplier class properties
            if (supplier.getNhacungcapID().toString().contains(searchKey) ||
                supplier.getFullname().toLowerCase().contains(searchKey) ||
                supplier.getEmail().toLowerCase().contains(searchKey) ||
                supplier.getPriceinput().toString().contains(searchKey)) {
                return true; // Filter matches one of the properties
            } else {
                return false; // Filter does not match any property
            }
        });
    });

    supplier_tavleview.setItems(filter); // Apply the filtered list to your table view
}


  
  //Employee
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
   private ObservableList<Employee>employeeList;
    public void EmployeeShowListData() {
       employeeList= EmployeeListData();

        employee_col_id.setCellValueFactory(new PropertyValueFactory<>("EmployeeId"));
        employee_col_name.setCellValueFactory(new PropertyValueFactory<>("EmployeeName"));
         employee_col_address.setCellValueFactory(new PropertyValueFactory<>("Address"));
        employee_col_phone.setCellValueFactory(new PropertyValueFactory<>("EmployeePhone"));
        employee_col_email.setCellValueFactory(new PropertyValueFactory<>("EmployeeEmail"));
        employee_col_pass.setCellValueFactory(new PropertyValueFactory<>("EmployeePass"));
        employee_col_date.setCellValueFactory(new PropertyValueFactory<>("Dateofbirth"));
       employee_col_status.setCellValueFactory(new PropertyValueFactory<>("status"));
       employee_col_role.setCellValueFactory(new PropertyValueFactory<>("role"));
       employee_tableview.setItems(employeeList);
    }
    public void EmployeeSearch() {
    FilteredList<Employee> filter = new FilteredList<>(employeeList, e -> true);

    employee_search.textProperty().addListener((observable, oldValue, newValue) -> {
        filter.setPredicate(emplo-> {
            if (newValue == null || newValue.isEmpty()) {
                return true; // Show all items if filter text is empty
            }
            String searchKey = newValue.toLowerCase();

            // Modify conditions based on your Detail class properties
            return emplo.getEmployeeId().toString().contains(searchKey) ||
                   emplo.getEmployeeName().toLowerCase().contains(searchKey) ||
                   emplo.getAddress().toLowerCase().contains(searchKey) ||
                   emplo.getEmployeePhone().toLowerCase().contains(searchKey) ||
                   emplo.getEmployeeEmail().toLowerCase().contains(searchKey);
        });
    });

    // Bind the filtered list to the table view
    employee_tableview.setItems(filter);
}

public void EmployeeAdd() {
    String sql = "INSERT INTO Employee (EmployeeId, EmployeeName, Address, EmployeePhone, EmployeeEmail, EmployeePass, Dateofbirth, status, role) "
            + "VALUES(?,?,?,?,?,?,?,?,?)";

    connect = ConnectDB.getConnectDB();
    try {
        Alert alert;

        // Validate input fields
        if (employee_id.getText().isEmpty()
                || employee_name.getText().isEmpty()
                || employee_address.getText().isEmpty()
                || employee_phone.getText().isEmpty()
                || employee_email.getText().isEmpty()
                || employee_pass.getText().isEmpty()
                || employee_date.getValue() == null
                || employee_status.getSelectionModel().getSelectedItem() == null
                || employee_role.getSelectionModel().getSelectedItem() == null) {

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All Blank Fields");
            alert.showAndWait();

        } else {
            // Validate Employee ID (should be numeric)
            String employeeId = employee_id.getText();
            if (!employeeId.matches("\\d+")) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Employee ID should be numeric!");
                alert.showAndWait();
                return;
            }

            // Validate Employee Name (should not exceed 30 characters)
            String employeeName = employee_name.getText();
            if (employeeName.length() > 30) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Employee Name should not exceed 30 characters!");
                alert.showAndWait();
                return;
            }

            // Validate Employee Phone (Vietnam phone format)
            String employeePhone = employee_phone.getText();
            if (!employeePhone.matches("^\\+?\\d{10,11}$")) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid Vietnam phone number format!");
                alert.showAndWait();
                return;
            }

            // Validate Employee Email (should not exceed 30 characters and should match @gmail.com format)
            String employeeEmail = employee_email.getText();
            if (employeeEmail.length() > 30 || !employeeEmail.matches("^[\\w.-]+@gmail\\.com$")) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Invalid email format or exceeds 30 characters!");
                alert.showAndWait();
                return;
            }

            // Check if Employee ID already exists
            String checkData = "SELECT EmployeeId FROM Employee WHERE EmployeeId = ?";
            prepare = connect.prepareStatement(checkData);
            prepare.setInt(1, Integer.parseInt(employeeId));
            result = prepare.executeQuery();
            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Employee ID: " + employeeId + " already exists!");
                alert.showAndWait();
                return;
            }

            // Insert new employee if all validations pass
            prepare = connect.prepareStatement(sql);
            prepare.setInt(1, Integer.parseInt(employeeId));
            prepare.setString(2, employeeName);
            prepare.setString(3, employee_address.getText());
            prepare.setString(4, employeePhone);
            prepare.setString(5, employeeEmail);
            prepare.setString(6, employee_pass.getText());
            prepare.setDate(7, java.sql.Date.valueOf(employee_date.getValue()));
            prepare.setString(8, (String) employee_status.getSelectionModel().getSelectedItem());
            prepare.setString(9, (String) employee_role.getSelectionModel().getSelectedItem());

            prepare.executeUpdate();

            alert = new Alert(AlertType.INFORMATION);
            alert.setTitle("Information Message");
            alert.setHeaderText(null);
            alert.setContentText("Successfully Added!");
            alert.showAndWait();

            // Update TableView and clear fields
            EmployeeShowListData();
            EmployeeClear();
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}

public void EmployeeUpdate() {
    Connection connect = ConnectDB.getConnectDB();
    
    // Validate input fields
    if (employee_id.getText().isEmpty()
            || employee_name.getText().isEmpty()
            || employee_address.getText().isEmpty()
            || employee_phone.getText().isEmpty()
            || employee_email.getText().isEmpty()
            || employee_pass.getText().isEmpty()
            || employee_date.getValue() == null
            || employee_status.getSelectionModel().getSelectedItem() == null
            || employee_role.getSelectionModel().getSelectedItem() == null) {

        showAlert(AlertType.ERROR, "Error Message", "Please fill all blank fields.");
        return;
    }

    // Validate Employee ID (should be numeric)
    String employeeId = employee_id.getText();
    if (!employeeId.matches("\\d+")) {
        showAlert(AlertType.ERROR, "Error Message", "Employee ID should be numeric.");
        return;
    }

    // Validate Employee Name (should not exceed 30 characters)
    String employeeName = employee_name.getText();
    if (employeeName.length() > 30) {
        showAlert(AlertType.ERROR, "Error Message", "Employee Name should not exceed 30 characters.");
        return;
    }

    // Validate Employee Phone (Vietnam phone format)
    String employeePhone = employee_phone.getText();
    if (!employeePhone.matches("^\\+?\\d{10,11}$")) {
        showAlert(AlertType.ERROR, "Error Message", "Invalid Vietnam phone number format.");
        return;
    }

    // Validate Employee Email (should not exceed 30 characters and should match @gmail.com format)
    String employeeEmail = employee_email.getText();
    if (employeeEmail.length() > 30 || !employeeEmail.matches("^[\\w.-]+@gmail\\.com$")) {
        showAlert(AlertType.ERROR, "Error Message", "Invalid email format or exceeds 30 characters.");
        return;
    }

    // Confirmation dialog
    Alert confirmation = new Alert(AlertType.CONFIRMATION);
    confirmation.setTitle("Confirmation Dialog");
    confirmation.setHeaderText(null);
    confirmation.setContentText("Are you sure you want to update this Employee?");
    Optional<ButtonType> option = confirmation.showAndWait();

    if (option.isPresent() && option.get() == ButtonType.OK) {
        final String sql = "UPDATE Employee SET EmployeeName=?, Address=?, EmployeePhone=?, EmployeeEmail=?, EmployeePass=?, Dateofbirth=?, status=?, role=? WHERE EmployeeId=?";

        try (PreparedStatement prepare = connect.prepareStatement(sql)) {
            // Set query parameters
            prepare.setString(1, employeeName);
            prepare.setString(2, employee_address.getText());
            prepare.setString(3, employeePhone);
            prepare.setString(4, employeeEmail);
            prepare.setString(5, employee_pass.getText());
            prepare.setDate(6, java.sql.Date.valueOf(employee_date.getValue()));
            prepare.setString(7, (String) employee_status.getSelectionModel().getSelectedItem());
            prepare.setString(8, (String) employee_role.getSelectionModel().getSelectedItem());
            prepare.setInt(9, Integer.parseInt(employeeId));

            // Execute update
            int affectedRows = prepare.executeUpdate();

            if (affectedRows > 0) {
                showAlert(AlertType.INFORMATION, "Information Message", "Successfully Updated!");

                // Refresh the table view to reflect updated data
                EmployeeShowListData();
                EmployeeClear();
            } else {
                showAlert(AlertType.WARNING, "Warning Message", "No records were updated. Please check the Employee.");
            }
        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Error Message", "Invalid Employee ID format.");
        } catch (Exception e) {
            // Log the exception using a logging framework
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, e);
            showAlert(AlertType.ERROR, "Error Message", "An error occurred: " + e.getMessage());
        }
    }
}


public void EmployeeClear() {
        employee_id.setText("");
       employee_name.setText("");
        employee_address.setText("");
       employee_phone.setText("");
      employee_email.setText("");
        employee_pass.setText("");
         employee_date.getValue();
       employee_status.getSelectionModel().clearSelection();


    }
public void EmployeeSelect() {
        Employee flower = employee_tableview.getSelectionModel().getSelectedItem();
        int num = employee_tableview.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        employee_id.setText(String.valueOf(flower.getEmployeeId() ));
        employee_name.setText(flower. getEmployeeName());
        employee_address.setText(flower. getAddress() );
        employee_phone.setText(flower.getEmployeePhone());
        employee_email.setText(flower. getEmployeeEmail());
        employee_pass.setText(flower.getEmployeePass());


    }
public void EmployeeDeleted() {
    String deleteSql = "DELETE FROM Employee WHERE EmployeeId = ?";
    Connection connect = null;
    PreparedStatement prepareDelete = null;

    try {
        connect = ConnectDB.getConnectDB(); // Ensure ConnectDB.getConnectDB() is implemented correctly

        Alert alert;

        // Check if Employee ID is provided
        if (employee_id.getText().isEmpty()) {
            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please enter the Employee ID to delete.");
            alert.showAndWait();
            return;
        }

        // Confirm the delete action
        alert = new Alert(AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to DELETE Employee ID: " + employee_id.getText() + "?");
        Optional<ButtonType> option = alert.showAndWait();

        if (option.isPresent() && option.get() == ButtonType.OK) {
            // Prepare the SQL delete statement
            prepareDelete = connect.prepareStatement(deleteSql);
            prepareDelete.setInt(1, Integer.parseInt(employee_id.getText()));

            // Execute the delete statement
            int rowsAffected = prepareDelete.executeUpdate();

            if (rowsAffected > 0) {
                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Deleted!");
                alert.showAndWait();

                // Update the TableView to reflect the deletion
                EmployeeShowListData();

                // Clear the input fields
                EmployeeClear();
            } else {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("No record found with Employee ID: " + employee_id.getText());
                alert.showAndWait();
            }
        }

    } catch (NumberFormatException e) {
        showAlert(AlertType.ERROR, "Error Message", "Invalid Employee ID format.");
    } catch (Exception e) {
        e.printStackTrace();
        showAlert(AlertType.ERROR, "Error Message", "Database error: " + e.getMessage());
    } finally {
        // Close resources in finally block
        try {
            if (prepareDelete != null) prepareDelete.close();
            if (connect != null) connect.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
  String liststatusemp[] = {"Online", "Offline"};
         public void statusemployee() {

        List<String> listS = new ArrayList<>();

        for (String data :liststatusemp) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         employee_status.setItems(listData);
    }
    
          String listrole[] = {"Admin", "User"};
         public void roleemploy() {

        List<String> listS = new ArrayList<>();

        for (String data :listrole) {
            listS.add(data);
        }

        ObservableList listData = FXCollections.observableArrayList(listS);
         employee_role.setItems(listData);
    }
     
         
//inventory
           public ObservableList<Inventory> InventoryListData() {
 ObservableList<Inventory> listData = FXCollections.observableArrayList();
        String sql = "SELECT * FROM Hangtonkho";
         connect = ConnectDB.getConnectDB();
        try {
            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            Inventory iven;

            while (result.next()) {
                iven = new Inventory(result.getInt("InventoryID"),
                         result.getInt("ProductID"), result.getString("Quantity"),
                         result.getDate("DateAddes"), result.getDate("LastUpdated"),
                         result.getInt("supplier"));

                listData.add(iven);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listData;
    }
   private ObservableList<Inventory>invenList;
    public void InventoryShowListData() {
       invenList= InventoryListData();

        inventory_col_id.setCellValueFactory(new PropertyValueFactory<>("InventoryID"));
        inventory_col_product.setCellValueFactory(new PropertyValueFactory<>("ProductID"));
         inventoru_col_quantity.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        inventory_col_dateadd.setCellValueFactory(new PropertyValueFactory<>("DateAddes"));
        inventory_col_dateupdate.setCellValueFactory(new PropertyValueFactory<>("LastUpdated"));
        inventory_col_supplier.setCellValueFactory(new PropertyValueFactory<>("supplier"));

       inventory_tableview.setItems(invenList);
    }   
      public void InventorySearch() {
    FilteredList<Inventory> filter = new FilteredList<>(invenList, e -> true);

    search_inventory.textProperty().addListener((observable, oldValue, newValue) -> {
         filter.setPredicate(inven -> {
            if (newValue == null || newValue.isEmpty()) {
                return true; // Show all items if filter text is empty
            }

            String searchKey = newValue.toLowerCase();

            // Modify conditions based on your Supplier class properties
            if (inven.getInventoryID().toString().contains(searchKey)  ) {
                return true; // Filter matches one of the properties
            } else {
                return false; // Filter does not match any property
            }
        });
    });

    // Bind the filtered list to the table view
    inventory_tableview.setItems(filter);
}
      public class DataFetcher {
    public static List<String> fetchIds() {
        List<String> ids = new ArrayList<>();
        String query = "SELECT id FROM Product";

        try (Connection connection = ConnectDB.getConnectDB();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                ids.add(resultSet.getString("id"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ids;
    }
}
    public void InventoryFlowerId() {
        String sql = "SELECT flower_id FROM Product WHERE status IN ('Available', 'Not Available')";

        connect = ConnectDB.getConnectDB();

        try {
            ObservableList listData = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                listData.add(result.getInt("flower_id"));
            }
             inventory_product.setItems(listData);
        

        } catch (Exception e) {
            e.printStackTrace();
        }
    }          
    public void InventorySupplierId() {
        String sql = "SELECT NhacungcapID FROM Nhacungcap WHERE status IN ('Providing','Not Providing')";

        connect = ConnectDB.getConnectDB();

        try {
            ObservableList listData = FXCollections.observableArrayList();

            prepare = connect.prepareStatement(sql);
            result = prepare.executeQuery();

            while (result.next()) {
                listData.add(result.getInt("NhacungcapID"));
            }
             inventory_supplier.setItems(listData);
     

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
public void InventoryAdd() {
    String sql = "INSERT INTO Hangtonkho(InventoryID, ProductID, Quantity, DateAddes, LastUpdated, Supplier) "
            + "VALUES (?, ?, ?, ?, ?, ?)";

    connect = ConnectDB.getConnectDB();
    try {
        Alert alert;

        if (inventory_id.getText().isEmpty()
                || !inventory_id.getText().matches("\\d+")  // Check if inventory_id contains only digits
                || inventory_product.getSelectionModel().getSelectedItem() == null
                || inventory_quantity.getText().isEmpty()
                || inventory_dateadd.getValue() == null
                || inventory_dateupdate.getValue() == null
                || inventory_supplier.getSelectionModel().getSelectedItem() == null) {

            alert = new Alert(AlertType.ERROR);
            alert.setTitle("Error Message");
            alert.setHeaderText(null);
            alert.setContentText("Please Fill All Blank Fields or Enter Valid Inventory ID (only numbers)");
            alert.showAndWait();

        } else {
            // Check if the flower ID already exists
            String checkData = "SELECT InventoryID FROM Hangtonkho WHERE InventoryID = ?";
            prepare = connect.prepareStatement(checkData);
            prepare.setInt(1, Integer.parseInt(inventory_id.getText()));
            result = prepare.executeQuery();

            if (result.next()) {
                alert = new Alert(AlertType.ERROR);
                alert.setTitle("Error Message");
                alert.setHeaderText(null);
                alert.setContentText("Inventory ID: " + inventory_id.getText() + " already exists!");
                alert.showAndWait();
            } else {
                prepare = connect.prepareStatement(sql);
                prepare.setInt(1, Integer.parseInt(inventory_id.getText()));
                prepare.setInt(2, (int) inventory_product.getSelectionModel().getSelectedItem());
                prepare.setString(3, inventory_quantity.getText());
                prepare.setDate(4, java.sql.Date.valueOf(inventory_dateadd.getValue()));
                prepare.setDate(5, java.sql.Date.valueOf(inventory_dateupdate.getValue()));
                prepare.setInt(6, (int) inventory_supplier.getSelectionModel().getSelectedItem());

                prepare.executeUpdate();

                alert = new Alert(AlertType.INFORMATION);
                alert.setTitle("Information Message");
                alert.setHeaderText(null);
                alert.setContentText("Successfully Added!");
                alert.showAndWait();

                // Show updated TableView
                InventoryShowListData();
                InventoryClear();
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
public void InventoryUpdate() {
    String sql = "UPDATE Hangtonkho SET InventoryID=?, ProductID=?, Quantity=?, DateAddes=?, LastUpdated=?, supplier=? WHERE InventoryID=?";
    
    try (Connection connect = ConnectDB.getConnectDB()) {
        // Validate input fields
        if (inventory_id.getText().isEmpty()
                || !inventory_id.getText().matches("\\d+")  // Check if inventory_id contains only digits
                || inventory_product.getSelectionModel().getSelectedItem() == null
                || inventory_quantity.getText().isEmpty()
                || inventory_dateadd.getValue() == null
                || inventory_dateupdate.getValue() == null
                || inventory_supplier.getSelectionModel().getSelectedItem() == null) {
            
            showAlert(Alert.AlertType.ERROR, "Error Message", "Please fill all blank fields or enter a valid Inventory ID (only numbers).");
            return;
        }

        // Confirmation dialog
        Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
        confirmation.setTitle("Confirmation Dialog");
        confirmation.setHeaderText(null);
        confirmation.setContentText("Are you sure you want to update this Inventory?");
        Optional<ButtonType> option = confirmation.showAndWait();

        if (option.isPresent() && option.get() == ButtonType.OK) {
            try (PreparedStatement prepare = connect.prepareStatement(sql)) {
                prepare.setInt(1, Integer.parseInt(inventory_id.getText()));
                prepare.setInt(2, (int) inventory_product.getSelectionModel().getSelectedItem());
                prepare.setString(3, inventory_quantity.getText());
                prepare.setDate(4, java.sql.Date.valueOf(inventory_dateadd.getValue()));
                prepare.setDate(5, java.sql.Date.valueOf(inventory_dateupdate.getValue()));
                prepare.setInt(6, (int) inventory_supplier.getSelectionModel().getSelectedItem());
                prepare.setInt(7, Integer.parseInt(inventory_id.getText()));

                // Execute update
                int affectedRows = prepare.executeUpdate();

                if (affectedRows > 0) {
                    showAlert(Alert.AlertType.INFORMATION, "Information Message", "Successfully Updated!");
                    InventoryShowListData(); // Refresh the table view to reflect updated data
                    InventoryClear();
                } else {
                    showAlert(Alert.AlertType.WARNING, "Warning Message", "No records were updated. Please check the Inventory ID.");
                }
            }
        }
    } catch (Exception e) {
       e.printStackTrace();
    } 
}

public void InventoryDeleted() {
    String deleteSql = "DELETE FROM Hangtonkho WHERE InventoryID = ?";

    try (Connection connect = ConnectDB.getConnectDB();
         PreparedStatement prepareDelete = connect.prepareStatement(deleteSql)) {

        // Check if Inventory ID is provided
        if (inventory_id.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Error Message", "Please enter the Inventory ID to delete.");
            return;
        }

        // Confirm the delete action
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation Message");
        alert.setHeaderText(null);
        alert.setContentText("Are you sure you want to DELETE Inventory ID: " + inventory_id.getText() + "?");
        Optional<ButtonType> option = alert.showAndWait();

        if (option.isPresent() && option.get() == ButtonType.OK) {
            // Prepare the SQL delete statement
            prepareDelete.setInt(1, Integer.parseInt(inventory_id.getText()));

            // Execute the delete statement
            int rowsAffected = prepareDelete.executeUpdate();

            if (rowsAffected > 0) {
                showAlert(Alert.AlertType.INFORMATION, "Information Message", "Successfully Deleted!");
                InventoryShowListData(); // Update the TableView to reflect the deletion
                InventoryClear(); // Clear the input fields
            } else {
                showAlert(Alert.AlertType.ERROR, "Error Message", "No record found with Inventory ID: " + inventory_id.getText());
            }
        }
    } catch (Exception e) {
      e.getMessage();
    } 

}

    
    public void InventorySelect() {
        Inventory flower = inventory_tableview.getSelectionModel().getSelectedItem();
        int num = inventory_tableview.getSelectionModel().getSelectedIndex();

        if ((num - 1) < -1) {
            return;
        }
        inventory_id.setText(String.valueOf(flower.getInventoryID() ));
         inventory_quantity.setText(flower. getQuantity() );
    }
  public void InventoryClear() {
        inventory_id.setText("");
       inventory_product.getSelectionModel().clearSelection();
        inventory_quantity.setText("");
        inventory_supplier.getSelectionModel().clearSelection();
    }  
    
//edit profile
   public void savechange() {
    connect = ConnectDB.getConnectDB();
    
    // Validate input fields
    if (edit_email.getText().isEmpty()
            || edit_phone.getText().isEmpty()
            || edit_address.getText().isEmpty()
            || edit_date.getValue() == null
            || edit_name.getText().isEmpty()) {
        showAlert(Alert.AlertType.ERROR, "Error Message", "Please fill all blank fields.");
        return;
    }

    // Confirmation dialog
    Alert confirmation = new Alert(Alert.AlertType.CONFIRMATION);
    confirmation.setTitle("Confirmation Dialog");
    confirmation.setHeaderText(null);
    confirmation.setContentText("Are you sure you want to update this user's information?");
    Optional<ButtonType> option = confirmation.showAndWait();

    if (option.isPresent() && option.get() == ButtonType.OK) {
        final String checkSql = "SELECT * FROM Employee WHERE EmployeeEmail = ?";
        
        try (PreparedStatement checkStmt = connect.prepareStatement(checkSql)) {
            checkStmt.setString(1, edit_email.getText());
            
            try (ResultSet rs = checkStmt.executeQuery()) {
                if (rs.next()) {
                    // Email is valid, proceed with updating other fields
                    final String updateSql = "UPDATE Employee SET EmployeePhone = ?, Address = ?, Dateofbirth = ?, EmployeeName = ? WHERE EmployeeEmail = ?";
                    
                    try (PreparedStatement updateStmt = connect.prepareStatement(updateSql)) {
                        updateStmt.setString(1, edit_phone.getText());
                        updateStmt.setString(2, edit_address.getText());
                        updateStmt.setDate(3, java.sql.Date.valueOf(edit_date.getValue()));
                        updateStmt.setString(4, edit_name.getText());
                        updateStmt.setString(5, edit_email.getText());
                        
                        int affectedRows = updateStmt.executeUpdate();
                        
                        if (affectedRows > 0) {
                            showAlert(Alert.AlertType.INFORMATION, "Information Message", "Information updated successfully!");
                        } else {
                            showAlert(Alert.AlertType.WARNING, "Warning Message", "Update unsuccessful.");
                        }
                    }
                } else {
                    showAlert(Alert.AlertType.ERROR, "Error Message", "Invalid email. Cannot update information.");
                }
          editClear();
            }
        } catch (Exception e) {
            showAlert(Alert.AlertType.ERROR, "Error Message", e.getMessage());
        }
    }
}

 public void editClear() {
        edit_email.setText("");
        edit_address.setText("");
        edit_phone.setText("");
         edit_name.setText("");
    }  
    
    
    public void displayUsername() {
        String user = getData.username;
       username.setText(user.substring(0,1).toUpperCase() + user.substring(1));
    }
//link form
      public void switchForm(ActionEvent event) {
 if (event.getSource() == home) {
        // Show home form and hide others
        home_form.setVisible(true);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(false);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(false);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);

                homeAF();
                homeTI();
                homeTC();
                homeChart();
    } else if (event.getSource() == availableflower) {
        // Show available flower form and hide others
         home_form.setVisible(false);
        availableFlower_form.setVisible(true);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(false);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(false);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);

            // TO SHOW THE UPDATED TABLEVIEW ONCE YOU CLICKED THE AVAILABLE FLOWERS BUTTON
            availableFlowersShowListData();
            availableFlowersStatus();
            availableFlowersSearch();
         
        

    } else if (event.getSource() == productdetail) {
        // Show purchase form and hide others
         home_form.setVisible(false);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(true);
        purchase_from.setVisible(false);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(false);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);
           ProductFlowerId();
           price();
           DetailShowListData();
           DetailSearch();
            SupplierFlowerId();
         
          
   }else if (event.getSource() == purchase) {
        // Show purchase form and hide others
        home_form.setVisible(false);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(true);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(false);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);
          InvoiceShowListData();
          purchaseFlowerId();
          purchaseFlowerName();
          sell_Payment();
          purchasecustomerid();
   
    }else if (event.getSource() == employee) {
        // Show purchase form and hide others
         home_form.setVisible(false);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(false);
        Employee_form.setVisible(true);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(false);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);
          EmployeeShowListData();
           statusemployee();
           EmployeeSearch();
           roleemploy();
   
    }else if (event.getSource() == Customer) {
        // Show purchase form and hide others
        home_form.setVisible(false);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(false);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(true);
       supplier_form.setVisible(false);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);
           CustomerShowListData();
           customerStatus();
           CustomerSearch();
   
    }else if (event.getSource() == supplier) {
        // Show purchase form and hide others
         home_form.setVisible(false);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(false);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(true);
         inventory_form.setVisible(false);
          edit_form.setVisible(false);
           SupplierShowListData();
            statussupplier();
            SupplierSearch();
            SupplierProductId();
    }else if (event.getSource() == inventory) {
        // Show purchase form and hide others
         home_form.setVisible(false);
        availableFlower_form.setVisible(false);
        productdetail_form.setVisible(false);
        purchase_from.setVisible(false);
        Employee_form.setVisible(false);
       Customer_Form.setVisible(false);
       supplier_form.setVisible(false);
         inventory_form.setVisible(true);
          edit_form.setVisible(false);
          InventoryShowListData();
          InventoryFlowerId();
          InventorySupplierId();
          InventorySearch();
    }else if (event.getSource() == editprofile) {
        // Show purchase form and hide others
       home_form.setVisible(false);
        availableFlower_form.setVisible(false);
       purchase_from.setVisible(false);
        Customer_Form.setVisible(false);
         Employee_form.setVisible(false);
          supplier_form.setVisible(false);
       productdetail_form.setVisible(false);
       inventory_form.setVisible(false);
       edit_form.setVisible(true);
    }
 
    }
    
     public void closes() {
        System.exit(0);
    }
   @FXML
    private void nutlink(ActionEvent event) throws IOException {
       Parent root = FXMLLoader.load(getClass().getResource("pdf.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Bill");
        stage.setScene(new Scene(root));
        stage.show();
        bill_form.getScene().getWindow().hide();
    }
    //log out
    private double x = 0;
    private double y = 0;

    public void logout() {

         try {
            Alert alert = new Alert(AlertType.CONFIRMATION);
            alert.setTitle("Confirmation Message");
            alert.setHeaderText(null);
            alert.setContentText("Are you sure you want to logout?");
            Optional<ButtonType> option = alert.showAndWait();

            if (option.get().equals(ButtonType.OK)) {
                // HIDE YOUR DASHBOARD FORM
                logoutBtn.getScene().getWindow().hide();

                // LINK YOUR LOGIN FORM
                Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
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
  
    /**
     * Initializes the controller class.
     */

    @Override
    public void initialize(URL url, ResourceBundle rb) {
             
          connect = ConnectDB.getConnectDB();
          displayUsername();
             homeAF();
                homeTI();
                homeTC();
                homeChart();
          availableFlowersShowListData();
          availableFlowersStatus();
          InvoiceShowListData();
          purchaseFlowerId();
          purchaseFlowerName();
          sell_Payment();
        purchaseDisplayTotal();
          CustomerShowListData();
           ProductFlowerId();
           customerStatus();
           price();
          DetailShowListData();
           SupplierShowListData();
            statussupplier();
            EmployeeShowListData();
          statusemployee();
          InventoryShowListData();
          InventoryFlowerId();
          InventorySupplierId();
           SupplierFlowerId();
           SupplierProductId();
           purchasecustomerid();
           roleemploy();
    }    

   
 
    
}
