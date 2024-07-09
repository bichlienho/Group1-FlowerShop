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
public class Employee {
     private Integer EmployeeId;
    private String EmployeeName;
    private String Address;
    private String EmployeePhone;
    private String EmployeeEmail;
    private String EmployeePass;
    private Date Dateofbirth;
    private String status;
    private String role;

    public Employee(Integer EmployeeId, String EmployeeName, String Address, String EmployeePhone, String EmployeeEmail, String EmployeePass, Date Dateofbirth, String status, String role) {
        this.EmployeeId = EmployeeId;
        this.EmployeeName = EmployeeName;
        this.Address = Address;
        this.EmployeePhone = EmployeePhone;
        this.EmployeeEmail = EmployeeEmail;
        this.EmployeePass = EmployeePass;
        this.Dateofbirth = Dateofbirth;
        this.status = status;
        this.role = role;
    }

    public Integer getEmployeeId() {
        return EmployeeId;
    }

    public String getEmployeeName() {
        return EmployeeName;
    }

    public String getAddress() {
        return Address;
    }

    public String getEmployeePhone() {
        return EmployeePhone;
    }

    public String getEmployeeEmail() {
        return EmployeeEmail;
    }

    public String getEmployeePass() {
        return EmployeePass;
    }

    public Date getDateofbirth() {
        return Dateofbirth;
    }

    public String getStatus() {
        return status;
    }

    public String getRole() {
        return role;
    }
   
    
    
    
}
