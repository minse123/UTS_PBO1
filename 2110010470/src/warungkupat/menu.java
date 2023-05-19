/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
public class menu {
    private int id_menu;
    private String nama;
    private double harga;

    public menu(int id_menu, String nama, double harga) {
        this.id_menu = id_menu;
        this.nama = nama;
        this.harga = harga;
    }

    
    // Getter dan setter untuk masing-masing properti
    public int getid_menu() {
        return id_menu;
    }

    public void setid_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getHarga() {
        return harga;
    }

    /**
     *
     * @param harga
     */
    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    // Overload method toString untuk representasi string dari objek Menu
    @Override
    public String toString() {
        return "ID Menu: " + id_menu + "\n"
                + "Nama Menu: " + nama + "\n"
                + "Harga: " + harga;
    }
    
       
}


