/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quyde
 */
public class Patient {
    private int patient_ID;
    private String name;
    private boolean gender;
    private String phone_number;
    private String address;
    private UserAccount ua ;

    public Patient() {
    }

    public Patient(String name, boolean gender, String phone_number, String address, UserAccount ua) {
        this.name = name;
        this.gender = gender;
        this.phone_number = phone_number;
        this.address = address;
        this.ua = ua;
    }

    public Patient(int patient_ID, String name, boolean gender, String phone_number, String address, UserAccount ua) {
        this.patient_ID = patient_ID;
        this.name = name;
        this.gender = gender;
        this.phone_number = phone_number;
        this.address = address;
        this.ua = ua;
    }
    
    
}
