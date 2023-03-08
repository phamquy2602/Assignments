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
public class PatientUseService {
    private int patientUseServiceID;
    private MedicalRecord mr;
    private Service s ;
    private Date useDate;  

    public PatientUseService() {
    }

    public PatientUseService(MedicalRecord mr, Service s, Date useDate) {
        this.mr = mr;
        this.s = s;
        this.useDate = useDate;
    }

    public PatientUseService(int patientUseServiceID, MedicalRecord mr, Service s, Date useDate) {
        this.patientUseServiceID = patientUseServiceID;
        this.mr = mr;
        this.s = s;
        this.useDate = useDate;
    }
    
}
