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
public class User {
    private int id;
    private String name;
    private String username;
    private boolean gender;
    private Date dob;
    private DoctorProfessional dp ;
    private String email;
    private String PhoneNumber;

    public User() {
    }

    public User(String name, String username, boolean gender, Date dob, DoctorProfessional dp, String email, String PhoneNumber) {
        this.name = name;
        this.username = username;
        this.gender = gender;
        this.dob = dob;
        this.dp = dp;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }

    public User(int id, String name, String username, boolean gender, Date dob, DoctorProfessional dp, String email, String PhoneNumber) {
        this.id = id;
        this.name = name;
        this.username = username;
        this.gender = gender;
        this.dob = dob;
        this.dp = dp;
        this.email = email;
        this.PhoneNumber = PhoneNumber;
    }
    
}
