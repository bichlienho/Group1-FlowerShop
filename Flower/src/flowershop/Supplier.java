/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowershop;

/**
 *
 * @author traht
 */
public class Supplier {
     private Integer NhacungcapID;
    private String fullname;
    private String email;
    private String phone;
    private String address;
    private String priceinput;
    private String quantity;
    private String status;
     private Integer ProductID;

    public Supplier(Integer NhacungcapID, String fullname, String email, String phone, String address, String priceinput, String quantity, String status, Integer ProductID) {
        this.NhacungcapID = NhacungcapID;
        this.fullname = fullname;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.priceinput = priceinput;
        this.quantity = quantity;
        this.status = status;
        this.ProductID = ProductID;
    }

    public Integer getNhacungcapID() {
        return NhacungcapID;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPriceinput() {
        return priceinput;
    }

    public String getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }

    public Integer getProductID() {
        return ProductID;
    }
    
    
}
