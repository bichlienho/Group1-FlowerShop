/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowershop;

import java.util.Date;

/**
 *
 * @author traht
 */
public class invoicedata {
    private Integer customer_id;
    private Integer flower_id;
    private String name;
    private Integer quantity;
    private String price;
    private Date date;
    private String payment;
    private Integer CustomerID;

    public invoicedata(Integer customer_id, Integer flower_id, String name, Integer quantity, String price, Date date, String payment, Integer CustomerID) {
        this.customer_id = customer_id;
        this.flower_id = flower_id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.date = date;
        this.payment = payment;
        this.CustomerID = CustomerID;
    }

    public Integer getCustomer_id() {
        return customer_id;
    }

    public Integer getFlower_id() {
        return flower_id;
    }

    public String getName() {
        return name;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public String getPrice() {
        return price;
    }

    public Date getDate() {
        return date;
    }

    public String getPayment() {
        return payment;
    }

    public Integer getCustomerID() {
        return CustomerID;
    }

   
   
 
    
    
}
