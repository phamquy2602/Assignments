/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quyde
 */
class DoctorProfessional {
    private int professionalID;
    private String profession;
    private User us;

    public DoctorProfessional() {
    }

    public DoctorProfessional(String profession, User us) {
        this.profession = profession;
        this.us = us;
    }

    public DoctorProfessional(int professionalID, String profession, User us) {
        this.professionalID = professionalID;
        this.profession = profession;
        this.us = us;
    }
    
    
}
