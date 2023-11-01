package Soal2;
import java.util.HashMap;
import java.util.Scanner;
public class Negara {
        private String nama;
        private String jenisKepemimpinan;
        private String namaPemimpin;
        private int tanggalKemerdekaan;
        private int bulanKemerdekaan;
        private int tahunKemerdekaan;
        public Negara(String nama, String jenisKepemimpinan, String namaPemimpin,
                      int tanggalKemerdekaan, int bulanKemerdekaan, int tahunKemerdekaan) {
            this.nama = nama;
            this.jenisKepemimpinan = jenisKepemimpinan;
            this.namaPemimpin = namaPemimpin;
            this.tanggalKemerdekaan = tanggalKemerdekaan;
            this.bulanKemerdekaan = bulanKemerdekaan;
            this.tahunKemerdekaan = tahunKemerdekaan;
        }
    @Override
    public String toString() {
        if (jenisKepemimpinan.equals("monarki")) {
            System.out.println();
            return String.format("Negara %s mempunyai raja bernama %s", nama, namaPemimpin);
        } else {
            System.out.println();
            String tanggalKemerdekaanStr = String.format("%d %s %d", tanggalKemerdekaan, namaBulan(bulanKemerdekaan), tahunKemerdekaan);
            return String.format("Negara %s mempunyai %s bernama %s \nDeklarasi Kemerdekaan pada Tanggal %s", nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaanStr);
        }
    }
    private String namaBulan(int bulan) {
            HashMap<Integer, String> namaBulan = new HashMap<>();
            namaBulan.put(1, "Januari");
            namaBulan.put(2, "Februari");
            namaBulan.put(3, "Maret");
            namaBulan.put(4, "April");
            namaBulan.put(5, "Mei");
            namaBulan.put(6, "Juni");
            namaBulan.put(7, "Juli");
            namaBulan.put(8, "Agustus");
            namaBulan.put(9, "September");
            namaBulan.put(10, "Oktober");
            namaBulan.put(11, "November");
            namaBulan.put(12, "Desember");
            return namaBulan.get(bulan);
        }
    }

