package PRAK202_2210817220011_MeldianaHandayani;
public class Kopi {
        String namaKopi;
        String ukuran;
        double harga;
        String pembeli;
        public Kopi() {
        }
        public void info() {
            System.out.println("Nama Kopi: " + namaKopi);
            System.out.println("Ukuran: " + ukuran);
            System.out.println("Harga: Rp. " + harga);
        }
        public void setPembeli(String nama) {
            pembeli = nama;
        }
        public double getPajak() {
            return harga * 0.11 ;
        }
        public String getPembeli() {
            return pembeli;
        }
    }

