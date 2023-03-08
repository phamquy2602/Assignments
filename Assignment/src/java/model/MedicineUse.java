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
public class MedicineUse {
    private int medicineUseId;
    private Medicine m;
    private MedicalRecord mr;
    private Date dateUse;
    private int amountUse;

    public MedicineUse() {
    }

    public MedicineUse(Medicine m, MedicalRecord mr, Date dateUse, int amountUse) {
        this.m = m;
        this.mr = mr;
        this.dateUse = dateUse;
        this.amountUse = amountUse;
    }

    public MedicineUse(int medicineUseId, Medicine m, MedicalRecord mr, Date dateUse, int amountUse) {
        this.medicineUseId = medicineUseId;
        this.m = m;
        this.mr = mr;
        this.dateUse = dateUse;
        this.amountUse = amountUse;
    }
    
}
