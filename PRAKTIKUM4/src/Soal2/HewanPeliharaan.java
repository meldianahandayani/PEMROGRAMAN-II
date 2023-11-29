package Soal2;
import java.util.Scanner;
public class HewanPeliharaan {
        protected String nama;
        protected String ras;
        public HewanPeliharaan(String r, String n) {
            this.nama = n;
            this.ras = r;
        }
        public void display() {
            System.out.println("Detail Hewan Peliharaan:");
            System.out.println("Nama hewan peliharaanku adalah : " + nama);
            System.out.println("Dengan ras : " + ras);
        }
    }