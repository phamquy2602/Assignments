/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author quyde
 */
public class UserAccount {
    private int id ;
    private String username;
    private String password;

    public UserAccount() {
    }

    public UserAccount(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public UserAccount(int id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }
    
}
