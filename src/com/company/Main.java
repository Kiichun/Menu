package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int pilihan_main = 999;
        int pilihan_persegi = 999;
        int pilihan_lingkaran = 999;
        Menu menu = new Menu();
        Persegi persegi = new Persegi();
        Lingkaran lingkaran = new Lingkaran();
        Scanner inp = new Scanner(System.in);
        do {
            switch (pilihan_main) {
                case 1:
                    do {
                        switch (pilihan_persegi) {
                            case 1:
                                System.out.println("\n\n\n\n");
                                System.out.println("     Keliling     ");
                                System.out.println("==================");
                                System.out.print("Masukkan Sisi : ");
                                persegi.setSisi(inp.nextDouble());
                                System.out.println("Keliling Persegi : " + persegi.hitungKeliling());
                                System.out.println();
                                System.out.println("Ketik 0 Untuk Keluar");
                                inp.next();
                                break;
                            case 2:
                                System.out.println("\n\n\n\n");
                                System.out.println("     Luas     ");
                                System.out.println("==============");
                                System.out.print("Masukkan Sisi : ");
                                persegi.setSisi(inp.nextDouble());
                                System.out.println("Luas Persegi : " + persegi.hitungLuas());
                                System.out.println();
                                System.out.println("Ketik 0 Untuk Keluar");
                                inp.next();
                        }
                        menu.menu_persegi();
                        System.out.print(" Masukkan Pilihan Anda : ");
                        pilihan_persegi = inp.nextInt();
                    }while (pilihan_persegi != 0);
                    break;
                case 2:
                    do {
                        switch (pilihan_lingkaran) {
                            case 1:
                                System.out.println("\n\n\n\n");
                                System.out.println("     Keliling     ");
                                System.out.println("==================");
                                System.out.print("Masukkan r : ");
                                lingkaran.setR(inp.nextDouble());
                                System.out.println("Keliling Lingkaran : " + lingkaran.hitungKeliling());
                                System.out.println();
                                System.out.println("Ketik 0 (Nol) untuk keluar");
                                inp.next();
                                break;
                            case 2:
                                System.out.println("\n\n\n\n");
                                System.out.println("     Luas     ");
                                System.out.println("==============");
                                System.out.print("Masukkan r : ");
                                lingkaran.setR(inp.nextDouble());
                                System.out.println("Luas Lingkaran : " + lingkaran.hitungLuas());
                                System.out.println();
                                System.out.println("Ketik 0 (Nol) untuk keluar");
                                inp.next();
                                break;
                        }
                        menu.menu_lingkaran();
                        System.out.print(" Masukkan Pilihan Anda : ");
                        pilihan_lingkaran = inp.nextInt();
                    }while (pilihan_lingkaran != 0);
                    break;
            }
            menu.main_menu();
            System.out.print(" Masukan Pilihan Anda : ");
            pilihan_main = inp.nextInt();
        }while (pilihan_main != 0);
    }
}
