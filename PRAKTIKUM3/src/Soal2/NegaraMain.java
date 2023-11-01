package Soal2;
import java.util.LinkedList;
import java.util.Scanner;

public class NegaraMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah negara: ");
        int jumlahNegara = scanner.nextInt();
        scanner.nextLine();
        LinkedList<Negara> negaraList = new LinkedList<>();
        for (int i = 0; i < jumlahNegara; i++) {
            System.out.print("Nama negara: ");
            String nama = scanner.nextLine();
            System.out.print("Jenis Kepemimpinan: ");
            String jenisKepemimpinan = scanner.nextLine();
            System.out.print("Nama Pemimpin: ");
            String namaPemimpin = scanner.nextLine();
            int tanggalKemerdekaan = 0;
            int bulanKemerdekaan = 0;
            int tahunKemerdekaan = 0;
            if (!jenisKepemimpinan.equals("monarki")) {
                System.out.print("Tanggal Kemerdekaan: ");
                tanggalKemerdekaan = scanner.nextInt();
                System.out.print("Bulan Kemerdekaan (1-12): ");
                bulanKemerdekaan = scanner.nextInt();
                System.out.print("Tahun Kemerdekaan: ");
                tahunKemerdekaan = scanner.nextInt();
                scanner.nextLine();
            }

            Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin, tanggalKemerdekaan, bulanKemerdekaan, tahunKemerdekaan);
            negaraList.add(negara);
        }

        for (Negara negara : negaraList) {
            System.out.println(negara);
        }
        scanner.close();
    }
}
