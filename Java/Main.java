package LATIHAN1DPBO2023.Java;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // deklarasi objek
        Mahasiswa detail = new Mahasiswa();

        // deklarasi variabel
        String name, studi, fakultas;
        int nim;
        ArrayList<Mahasiswa> list = new ArrayList<>();

        // inisialisasi variabel
        int cekMenu = 0;
        int n = 0;
        int delete = 0;
        int update = 0;
        String menu = null;

        // scanner
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n===== Menu Data =====");
            System.out.println("1)Add -- 2)Delete -- 3)Update");
            System.out.print("Masukkan pilihan menu : ");

            // input dan cek integer
            try {
                cekMenu = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Input bukan integer!");
            }

            /* menu */
            if (cekMenu == 1) {
                /* add data */

                // input dan cek integer
                System.out.print("Masukkan banyaknya data : ");
                try {
                    n = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Input bukan integer!");
                }

                /* loop input */
                for (int j = 0; j < n; j++) {

                    // input
                    name = sc.next();
                    nim = sc.nextInt();
                    studi = sc.next();
                    fakultas = sc.next();

                    // set input
                    detail = new Mahasiswa();
                    detail.setName(name);
                    detail.setNim(nim);
                    detail.setStudi(studi);
                    detail.setFakultas(fakultas);

                    // masukkan data ke dalam list
                    list.add(detail);
                }
            } else if (cekMenu == 2) {
                /* delete data */

                // input index
                System.out.print("Masukkan no data yang ingin di hapus : ");
                try {
                    delete = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Input bukan integer!");
                }

                // cek index
                if (delete > list.size()) {
                    System.out.println("\nIndex tidak ditemukan!!");
                } else {
                    // delete list
                    list.remove((delete - 1));
                }

            } else if (cekMenu == 3) {
                /* update data */

                // input index
                System.out.print("Masukkan no data yang ingin di ganti : ");
                try {
                    update = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Input bukan integer!");
                }

                // cek index
                if (update > list.size()) {
                    System.out.println("\nIndex tidak ditemukan!!");
                } else {
                    // input data
                    System.out.println("Masukan data yang ingin diganti : ");
                    name = sc.next();
                    nim = sc.nextInt();
                    studi = sc.next();
                    fakultas = sc.next();

                    // set update data
                    detail = new Mahasiswa();
                    detail.setName(name);
                    detail.setNim(nim);
                    detail.setStudi(studi);
                    detail.setFakultas(fakultas);

                    // masukkan data ke dalam list
                    list.set((update - 1), detail);
                }
            } else {
                System.out.println("Menu tidak ada!");
            }

            /* output */
            if (list.size() == 0) {
                System.out.println("\nList kosong!!");
            } else {
                System.out.println("\n======= Data Mahasiswa =======");
                for (int j = 0; j < list.size(); j++) {
                    System.out.println(Integer.toString(j + 1) + ") " + list.get(j).getName() + " -- " +
                            list.get(j).getNim() + " -- " + list.get(j).getStudi() + " -- "
                            + list.get(j).getFakultas());
                }
            }

            /* loop menu */
            System.out.print("\nKetik 't' lanjut atau ketik apa saja untuk keluar dari menu : ");
            menu = sc.next();
        } while (menu.equals("t"));

        sc.close();
    }
}

/*
 * 3
 * Adit
 * 2000360
 * Ilmu_Komputer
 * FPMIPA
 * Fahreza
 * 2000455
 * Teknik_Elektro
 * FPTK
 * Hawwa
 * 2000563
 * DKV
 * FPSD
 * 
 * Fikri
 * 2000223
 * Sastra_Jepang
 * FPBS
 */