/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
import java.util.Date;

public class tb_transaksi {
    private int id_Transaksi;
    private int id_User;
    private int id_Pelanggan;
    private Date tanggal;
    private double total;

    public tb_transaksi (int id_Transaksi, int id_User, int id_Pelanggan, Date tanggal, double total) {
        this.id_Transaksi = id_Transaksi;
        this.id_User = id_User;
        this.id_Pelanggan = id_Pelanggan;
        this.tanggal = tanggal;
        this.total = total;
    }

    // Getter dan setter untuk masing-masing properti
    public int getId_Transaksi() {
        return id_Transaksi;
    }

    public void setId_Transaksi(int id_Transaksi) {
        this.id_Transaksi = id_Transaksi;
    }

    public int getId_User() {
        return id_User;
    }

    public void setId_User(int id_User) {
        this.id_User = id_User;
    }

    public int getId_Pelanggan() {
        return id_Pelanggan;
    }

    public void setId_Pelanggan(int id_Pelanggan) {
        this.id_Pelanggan = id_Pelanggan;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    @Override
        public String toString() {
        return "ID Transaksi: " + id_Transaksi + "\n"
                + "ID User: " + id_User + "\n"
                + "ID Pelanggan: " + id_Pelanggan + "\n"
                + "Tanggal: " + tanggal + "\n"
                + "Total: " + total;
    }
}

