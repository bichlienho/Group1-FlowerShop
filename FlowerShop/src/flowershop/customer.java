/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowershop;


/**
 *
 * @author traht
 */
public class customer {
   private Integer CustomerID;
    private String CustomerName;
    private String Address;
    private String Phone;
    private String Email;
    private String Password;
    private Integer gender;
    private String status;

    public customer(Integer CustomerID, String CustomerName, String Address, String Phone, String Email, String Password, Integer gender, String status) {
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.Password = Password;
        this.gender = gender;
        this.status = status;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public String getAddress() {
        return Address;
    }

    public String getPhone() {
        return Phone;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return Password;
    }

    public Integer getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

 
    
}
