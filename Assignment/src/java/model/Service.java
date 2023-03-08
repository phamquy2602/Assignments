/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quyde
 */
public class Service {
    private int serviceID;
    private String name;
    private boolean status;
    private double price;

    public Service() {
    }

    public Service(String name, boolean status, double price) {
        this.name = name;
        this.status = status;
        this.price = price;
    }

    public Service(int serviceID, String name, boolean status, double price) {
        this.serviceID = serviceID;
        this.name = name;
        this.status = status;
        this.price = price;
    }
    
}
