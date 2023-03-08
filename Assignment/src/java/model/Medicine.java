/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author quyde
 */
public class Medicine {
    private int medicineID;
    private String medicineName;
    private double price;
    private boolean status;
    private double quantity;
    private Date expiryDate;

    public Medicine() {
    }

    public Medicine(String medicineName, double price, boolean status, Date expiryDate) {
        this.medicineName = medicineName;
        this.price = price;
        this.status = status;
        this.expiryDate = expiryDate;
    }

    public Medicine(int medicineID, String medicineName, double price, boolean status, double quantity, Date expiryDate) {
        this.medicineID = medicineID;
        this.medicineName = medicineName;
        this.price = price;
        this.status = status;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }
  
}
