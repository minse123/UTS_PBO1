/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package warungkupat;

/**
 *
 * @author Asus
 */
public class tb_detpembelian {
    private int id_pembelian;
    private int id_barang;
    private double harga;
    private int jumlah;

    public tb_detpembelian(int id_pembelian, int id_barang, double harga, int jumlah) {
        this.id_pembelian = id_pembelian;
        this.id_barang = id_barang;
        this.harga = harga;
        this.jumlah = jumlah;
    }
    

    // Getter dan setter untuk masing-masing properti
    public int getId_pembelian() {
        return id_pembelian;
    }

    public void setId_pembelian(int id_pembelian) {
        this.id_pembelian = id_pembelian;
    }

    public int getId_barang() {
        return id_barang;
    }

    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
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
        return "ID Pembelian: " + id_pembelian + "\n"
                + "ID Barang: " + id_barang + "\n"
                + "Harga: " + harga + "\n"
                + "Jumlah: " + jumlah;
    }
}
