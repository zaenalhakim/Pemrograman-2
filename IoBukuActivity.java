/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.bukuactivity;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Zaenal Hakim
 */
public class IoBukuActivity {

    public static void TambahBuku() {
        try (FileOutputStream file = new FileOutputStream("addressbook.dat", true)) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukan Nama : ");
            String nama = input.nextLine() + "\t";

            System.out.print("Masukan Alamat: ");
            String alamat = input.nextLine() + "\t";

            System.out.print("Masukan Telepon: ");
            String hp = input.nextLine() + "\t";

            System.out.print("Masukan Email: ");
            String email = input.nextLine() + "\n";

            file.write(nama.getBytes());
            file.write(alamat.getBytes());
            file.write(hp.getBytes());
            file.write(email.getBytes());

            file.close();
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        do {
           
            System.out.println("");
            System.out.println("1 Masukan Data Buku Baru");
            System.out.println("2 Menampilkan Data Buku ");
            System.out.println("3 Close Data Buku");
            System.out.println("");
            System.out.print("Masukan Pilihan Baru : ");
            int opsi = s.nextInt();
            switch (opsi) {
                case 1:
                    TambahBuku();
                    break;
                case 2:
                    openFile();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Silahkan Ulangi Masukan!");
                    break;
            }
            System.out.println();
            System.out.println();
        } while (true);
    }

    public static void openFile() throws IOException {
        try (FileInputStream i = new FileInputStream("addressbook.dat")) {

            int data;

            while ((data = i.read()) != -1) {
                System.out.print((char) data);
            }

            i.close();
        } catch (FileNotFoundException e) {
            System.out.println("Buku Alamat Belum Ada");
        }
    }

}
