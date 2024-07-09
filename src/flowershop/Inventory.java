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
public class Inventory {
        private Integer InventoryID;
    private Integer ProductID;
    private String Quantity;
    private Date DateAddes;
    private Date LastUpdated;
    private Integer supplier;

    public Inventory(Integer InventoryID, Integer ProductID, String Quantity, Date DateAddes, Date LastUpdated, Integer supplier) {
        this.InventoryID = InventoryID;
        this.ProductID = ProductID;
        this.Quantity = Quantity;
        this.DateAddes = DateAddes;
        this.LastUpdated = LastUpdated;
        this.supplier = supplier;
    }

    public Integer getInventoryID() {
        return InventoryID;
    }

    public Integer getProductID() {
        return ProductID;
    }

    public String getQuantity() {
        return Quantity;
    }

    public Date getDateAddes() {
        return DateAddes;
    }

    public Date getLastUpdated() {
        return LastUpdated;
    }

    public Integer getSupplier() {
        return supplier;
    }

  

}
