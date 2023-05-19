/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
public class tb_dettransaksi {
    private int id_transaksi;
    private int id_menu;
    private double harga;
    private int jumlah;

    public tb_dettransaksi(int id_transaksi, int id_menu, double harga, int jumlah) {
        this.id_transaksi = id_transaksi;
        this.id_menu = id_menu;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Getter dan setter untuk masing-masing properti
    public int getId_Transaksi() {
        return id_transaksi;
    }

    public void setId_transaksi(int id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    public int getId_menu() {
        return id_menu;
    }

    public void setId_menu(int id_menu) {
        this.id_menu = id_menu;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    
        @Override
    public String toString() {
        return "ID Transaksi: " + id_transaksi + "\n"
                + "ID Menu: " + id_menu + "\n"
                + "Harga: " + harga + "\n"
                + "Jumlah: " + jumlah;
    }
}
