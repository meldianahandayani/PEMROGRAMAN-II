package Soal1;
import java.util.LinkedList;
import java.util.Random;
import java.util.Scanner;
public class DaduMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah dadu: ");
        int jumlahDadu = scanner.nextInt();
        LinkedList<Dadu> daduList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < jumlahDadu; i++) {
            Dadu dadu = new Dadu();
            daduList.add(dadu);
        }
        for (int i = 0; i < daduList.size(); i++) {
            Dadu dadu = daduList.get(i);
            System.out.println("Dadu ke-" + (i + 1) + " bernilai " + dadu.getNilai());
        }
        int totalNilai = daduList.stream().mapToInt(Dadu::getNilai).sum();
        System.out.println("Total nilai dadu keseluruhan " + totalNilai);
        scanner.close();
    }
}
