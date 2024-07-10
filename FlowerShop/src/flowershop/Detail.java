/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowershop;

/**
 *
 * @author traht
 */
public class Detail {
     private Integer ProductDetailID;
         private String mass;
    private String price;
    private String color;
          private Integer NhacungcapID;
     private String des;

    public Detail(Integer ProductDetailID, String mass, String price, String color, Integer NhacungcapID, String des) {
        this.ProductDetailID = ProductDetailID;
        this.mass = mass;
        this.price = price;
        this.color = color;
        this.NhacungcapID = NhacungcapID;
        this.des = des;
    }

    public Integer getProductDetailID() {
        return ProductDetailID;
    }

    public String getMass() {
        return mass;
    }

    public String getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public Integer getNhacungcapID() {
        return NhacungcapID;
    }

    public String getDes() {
        return des;
    }

}
