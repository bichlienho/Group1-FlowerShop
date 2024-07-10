/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flowershop;
import java.sql.Date;
/**
 *
 * @author traht
 */
public class flower_Data {
    
    private Integer flower_id;
    private String name;
    private String status;
    private String price;
    private String image;
    private Date date;

    public flower_Data(Integer flower_id, String name, String status, String price, String image, Date date) {
        this.flower_id = flower_id;
        this.name = name;
        this.status = status;
        this.price = price;
        this.image = image;
        this.date = date;
    }

    public Integer getFlower_id() {
        return flower_id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public String getPrice() {
        return price;
    }

    public String getImage() {
        return image;
    }

    public Date getDate() {
        return date;
    }

  
   
 
    
}