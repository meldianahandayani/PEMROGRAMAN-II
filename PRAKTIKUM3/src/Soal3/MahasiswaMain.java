package Soal3;
import java.util.ArrayList;
import java.util.Scanner;
public class MahasiswaMain {
        public static void main(String[] args) {
            ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);
            boolean isRunning = true;
            while (isRunning) {
                System.out.println("Menu:");
                System.out.println("1. Tambah Mahasiswa");
                System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
                System.out.println("3. Cari Mahasiswa berdasarkan NIM");
                System.out.println("4. Tampilkan Daftar Mahasiswa");
                System.out.println("0. Keluar");
                System.out.print("Pilihan: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine();  // Membuang karakter newline
                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan Nama Mahasiswa: ");
                        String nama = scanner.nextLine();
                        System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                        String nim = scanner.nextLine();
                        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);
                        daftarMahasiswa.add(mahasiswa);
                        System.out.println("Mahasiswa " +nama +" berhasil ditambahkan.");
                        break;
                    case 2:
                        System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                        String nimHapus = scanner.nextLine();
                        boolean removed = false;

                        for (Mahasiswa mhs : daftarMahasiswa) {
                            if (mhs.getNim().equals(nimHapus)) {
                                daftarMahasiswa.remove(mhs);
                                removed = true;
                                System.out.println("Mahasiswa dengan NIM " + nimHapus + " dihapus.");
                                break;
                            }
                        }
                        if (!removed) {
                            System.out.println("Mahasiswa dengan NIM " + nimHapus + " tidak ditemukan.");
                        }
                        break;
                    case 3:
                        System.out.print("Masukkan NIM Mahasiswa yang akan dicari: ");
                        String nimCari = scanner.nextLine();
                        boolean found = false;
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            if (mhs.getNim().equals(nimCari)) {
                                System.out.println("Data Mahasiswa:");
                                System.out.println("Nama: " + mhs.getNama());
                                System.out.println("NIM: " + mhs.getNim());
                                found = true;
                                break;
                            }
                        }
                        if (!found) {
                            System.out.println("Mahasiswa dengan NIM " + nimCari + " tidak ditemukan.");
                        }
                        break;
                    case 4:
                        System.out.println("Daftar Mahasiswa:");
                        for (Mahasiswa mhs : daftarMahasiswa) {
                            System.out.println("NIM: " + mhs.getNim() + ", Nama: " + mhs.getNama());
                        }
                        break;
                    case 0:
                        isRunning = false;
                        System.out.println("Terima kasih!");
                        daftarMahasiswa.clear();
                        break;
                }
            }
            scanner.close();
        }
    }
