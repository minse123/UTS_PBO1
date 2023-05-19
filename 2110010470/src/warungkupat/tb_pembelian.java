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

public class tb_pembelian {
    private int id_pembelian;
    private Date tanggal;
    private int id_user;
    private double total;

    public tb_pembelian(int id_pembelian, Date tanggal, int id_user, double total) {
        this.id_pembelian = id_pembelian;
        this.tanggal = tanggal;
        this.id_user = id_user;
        this.total = total;
    }
    

    // Getter dan setter untuk masing-masing properti
    public int getId_pembelian() {
        return id_pembelian;
    }

    public void setId_pembelian(int id_pembelian) {
        this.id_pembelian = id_pembelian;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    
    /**
     *
     * @return
     */
    @Override
        public String toString() {
        return "ID Pembelian: " + id_pembelian + "\n"
                + "Tanggal: " + tanggal + "\n"
                + "ID User: " + id_user + "\n"
                + "Total: " + total;
        }
}

