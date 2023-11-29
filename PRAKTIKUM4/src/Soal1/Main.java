package Soal1;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Nama Hewan Peliharaan: ");
            String namaHewan = input.nextLine();
            System.out.print("Ras: ");
            String rasHewan = input.nextLine();
            HewanPeliharaan hewanPeliharaan = new HewanPeliharaan(rasHewan, namaHewan);
            hewanPeliharaan.display();
            input.close();
        }
    }


