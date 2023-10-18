package PRAK201_2210817220011_MeldianaHandayani;
public class Soal1Main {
        public static void main(String[] args) {
            Buah apel = new Buah("Apel", 0.4, 7000.0);
            Buah mangga = new Buah("Mangga", 0.2, 3500.0);
            Buah alpukat = new Buah("Alpukat", 0.25, 10000.0);

            // Atur jumlah beli (kg) untuk masing-masing buah
            apel.tampilkanInfoBuah(40.0);
            mangga.tampilkanInfoBuah(15.0);
            alpukat.tampilkanInfoBuah(12.0);
        }
    }
