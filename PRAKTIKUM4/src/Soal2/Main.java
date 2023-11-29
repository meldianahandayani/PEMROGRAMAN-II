package Soal2;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Pilih jenis hewan yang ingin diinputkan:");
            System.out.println("1 = Kucing");
            System.out.println("2 = Anjing");
            System.out.print("Masukkan pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            if (pilihan == 1) {
                System.out.print("Nama hewan peliharaan: ");
                String namaHewan = input.nextLine();
                System.out.print("Ras: ");
                String rasHewan = input.nextLine();
                System.out.print("Warna Bulu: ");
                String warnaBulu = input.nextLine();
                Kucing kucing = new Kucing(rasHewan, namaHewan, warnaBulu);
                kucing.displayDetailKucing();
            } else if (pilihan == 2) {
                System.out.print("Nama hewan peliharaan: ");
                String namaHewan = input.nextLine();

                System.out.print("Ras: ");
                String rasHewan = input.nextLine();

                System.out.print("Warna Bulu: ");
                String warnaBulu = input.nextLine();

                System.out.print("Kemampuan: ");
                String kemampuan = input.nextLine();

                Anjing anjing = new Anjing(rasHewan, namaHewan, warnaBulu, kemampuan);
                anjing.displayDetailAnjing();
            } else {
                System.out.println("Pilihan tidak valid.");
            }
            input.close();
        }
    }

