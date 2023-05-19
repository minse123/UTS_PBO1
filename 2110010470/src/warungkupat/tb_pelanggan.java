/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
public class tb_pelanggan {
    private int id_pelanggan;
    private String nama;
    private String no_telp;
    private String alamat;
    private double saldo;

    public tb_pelanggan(int id_pelanggan, String nama, String no_telp, String alamat, double saldo) {
        this.id_pelanggan = id_pelanggan;
        this.nama = nama;
        this.no_telp = no_telp;
        this.alamat = alamat;
        this.saldo = saldo;
    }

    // Getter dan setter untuk masing-masing properti
    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    /**
     *
     * @return
     */
    @Override
        public String toString() {
        return "ID Pelanggan: " + id_pelanggan + "\n"
                + "Nama: " + nama + "\n"
                + "No. Telepon: " + no_telp + "\n"
                + "Alamat: " + alamat + "\n"
                + "Saldo: " + saldo;
    }
}

