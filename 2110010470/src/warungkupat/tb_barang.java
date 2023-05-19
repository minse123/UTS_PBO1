/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
public class tb_barang {
    private int id_barang;
    private String nama_barang;
    private String satuan;
    private double harga;

    public tb_barang(int id_barang, String nama_barang, String satuan, double harga) {
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.satuan = satuan;
        this.harga = harga;
    }

    // Getter dan setter untuk masing-masing properti
    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    @Override
    public String toString() {
        return "ID Barang: " + id_barang + "\n"
                + "Nama Barang: " + nama_barang + "\n"
                + "Satuan: " + satuan + "\n"
                + "Harga: " + harga;
    }
}
