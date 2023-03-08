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
public class MedicalRecord {
    private int medicalRecordID ;
    private String nameofDisease;
    private String medicalCondition;
    private Date dateIn;
    private Date dateOut;
    private User us;

    public MedicalRecord() {
    }

    public MedicalRecord(String nameofDisease, String medicalCondition, Date dateIn, Date dateOut, User us) {
        this.nameofDisease = nameofDisease;
        this.medicalCondition = medicalCondition;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.us = us;
    }

    public MedicalRecord(int medicalRecordID, String nameofDisease, String medicalCondition, Date dateIn, Date dateOut, User us) {
        this.medicalRecordID = medicalRecordID;
        this.nameofDisease = nameofDisease;
        this.medicalCondition = medicalCondition;
        this.dateIn = dateIn;
        this.dateOut = dateOut;
        this.us = us;
    }
    
    
}
