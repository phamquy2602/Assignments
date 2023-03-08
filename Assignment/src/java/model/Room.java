/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quyde
 */
public class Room {
   private int roomID;
   private int numberOfBed;
   private MedicalRecord mr ;

    public Room() {
    }

    public Room(int numberOfBed, MedicalRecord mr) {
        this.numberOfBed = numberOfBed;
        this.mr = mr;
    }

    public Room(int roomID, int numberOfBed, MedicalRecord mr) {
        this.roomID = roomID;
        this.numberOfBed = numberOfBed;
        this.mr = mr;
    }
   
}
