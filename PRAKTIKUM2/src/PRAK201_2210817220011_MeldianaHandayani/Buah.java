package PRAK201_2210817220011_MeldianaHandayani;
public class Buah {
    private String nama;
    private double berat;
    private double hargaPerKg;
    public Buah(String nama, double berat, double hargaPerKg) {
        this.nama = nama;
        this.berat = berat;
        this.hargaPerKg = hargaPerKg;
    }
    public double hitungHargaSebelumDiskon(double jumlahBeli) {
        return jumlahBeli /berat* hargaPerKg;
    }

    public double hitungDiskon(double jumlahBeli) {
        double totalBeratKg = jumlahBeli;
        int potonganPer4Kg = (int) (totalBeratKg / 4) * 2;
        return potonganPer4Kg * (hargaPerKg * 4) / 100;
    }
    public double hitungHargaSetelahDiskon(double jumlahBeli) {
        double hargaSebelumDiskon = hitungHargaSebelumDiskon(jumlahBeli);
        double diskon = hitungDiskon(jumlahBeli);
        return hargaSebelumDiskon - diskon;
    }

    public void tampilkanInfoBuah(double jumlahBeli) {
        System.out.println("Nama Buah: " + nama);
        System.out.println("Berat: " + berat);
        System.out.println("Harga: " + hargaPerKg);
        System.out.println("Jumlah Beli: " + jumlahBeli + " kg");

        double hargaSebelumDiskon = hitungHargaSebelumDiskon(jumlahBeli);
        double diskon = hitungDiskon(jumlahBeli);
        double hargaSetelahDiskon = hitungHargaSetelahDiskon(jumlahBeli);

        System.out.printf("Harga Sebelum Diskon: Rp%.2f%n", hargaSebelumDiskon);
        System.out.printf("Total Diskon: Rp%.2f%n", diskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f%n", hargaSetelahDiskon);

        System.out.println();
    }
}
