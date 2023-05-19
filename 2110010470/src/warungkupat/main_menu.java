/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package warungkupat;

import static java.time.Clock.system;
import static java.time.InstantSource.system;

/**
 *
 * @author Asus
 */
public class main_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   tb_barang barang1 = new tb_barang( B001, "Tahu", "Pack", 2500);
        System.out.println(barang1);

        // Membuat objek Menu menggunakan konstruktor dengan parameter lengkap
        menu menu1 = new menu(M001, "Soto Ayam", 25000);
        System.out.println(menu1);

        // Membuat objek DetPembelian menggunakan konstruktor dengan parameter lengkap
        tb_detpembelian detPembelian1 = new tb_detpembelian("PB001", "B001", 2500, 5);
        System.out.println(detPembelian1);

        // Membuat objek DetTransaksi menggunakan konstruktor dengan parameter lengkap
        tb_dettransaksi detTransaksi1 = new tb_dettransaksi("T001", "M001", 25000, 2);
        System.out.println(detTransaksi1);

        // Membuat objek Pelanggan menggunakan konstruktor dengan parameter lengkap
        tb_pelanggan pelanggan1 = new tb_pelanggan("PL001", "John Doe", "081234567890", "Jl. Raya No. 123", 50000);
        System.out.println(pelanggan1);

        // Membuat objek Pembelian menggunakan konstruktor dengan parameter lengkap
        tb_pembelian pembelian1 = new tb_pembelian("PB001", new Date(), "USR001", 100000);
        System.out.println(pembelian1);

        // Membuat objek Transaksi menggunakan konstruktor dengan parameter lengkap
        tb_transaksi transaksi1 = new tb_transaksi("T001", "USR001", "PL001", new Date(), 200000);
        System.out.println(transaksi1);
        
          // Membuat objek User menggunakan konstruktor dengan parameter lengkap
        tb_user user1 = new tb_user("USR001", "John Doe", "johndoe", "password", "Admin", "Active");
        System.out.println(user1);
    }
}
