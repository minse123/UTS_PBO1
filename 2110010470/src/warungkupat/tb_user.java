/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
public class tb_user {
    private int id_user;
    private String nama;
    private String username;
    private String password;
    private String level;
    private String status;

    public tb_user(int id_user, String nama, String username, String password, String level, String status) {
        this.id_user = id_user;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.level = level;
        this.status = status;
    }

    // Getter dan setter untuk masing-masing properti
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
        public String toString() {
        return "ID User: " + id_user + "\n" +
                "Nama: " + nama + "\n" +
                "Username: " + username + "\n" +
                "Password: " + password + "\n" +
                "Level: " + level + "\n" +
                "Status: " + status;
    }
}

