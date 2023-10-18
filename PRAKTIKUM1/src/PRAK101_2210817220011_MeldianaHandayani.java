import java.util.Scanner;
public class PRAK101_2210817220011_MeldianaHandayani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Nama Lengkap: ");
        String namaLengkap = scanner.nextLine();

        System.out.print("Masukkan Tempat Lahir: ");
        String tempatLahir = scanner.nextLine();

        System.out.print("Masukkan Tanggal Lahir: ");
        int tanggalLahir = scanner.nextInt();

        System.out.print("Masukkan Bulan Lahir: ");
        int bulanLahir = scanner.nextInt();

        System.out.print("Masukkan Tahun Lahir: ");
        int tahunLahir = scanner.nextInt();

        System.out.print("Masukkan Tinggi Badan: ");
        double tinggiBadan = scanner.nextDouble();

        System.out.print("Masukkan Berat Badan: ");
        double beratBadan = scanner.nextDouble();

        String[] namaBulan = {
                "Januari", "Februari", "Maret", "April", "Mei", "Juni",
                "Juli", "Agustus", "September", "Oktober", "November", "Desember"
        };

        System.out.printf("Nama Lengkap %s, Lahir di %s pada Tanggal %d %s %d%nTinggi Badan %.0f cm dan Berat Badan %.2f kg%n",
                namaLengkap, tempatLahir, tanggalLahir, namaBulan[bulanLahir - 1], tahunLahir, tinggiBadan, beratBadan);
        scanner.close();
    }
}

