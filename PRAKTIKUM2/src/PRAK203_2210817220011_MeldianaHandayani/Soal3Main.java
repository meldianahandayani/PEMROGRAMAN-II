package PRAK203_2210817220011_MeldianaHandayani;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        p1.nama = "Roi";
        // pada baris ini terjadi error karena Anda mencoba mengisinya dengan string
        // , yaitu "Kingdom of Orvel" sedangkan tipe data merupakan char yang hanya bisa menyimpan 1 karakter dan menggunakan tanda petik
        //p1.asal = "Kingdom of Orvel";
        p1.asal = 'k';
        p1.setUmur(17);
        p1.setJabatan("Assassin");
        System.out.println("Nama: " + p1.getNama());
        //baris ini kita ubah p1.getAsal karna itu hanya menampilkan char huruf k pada output.
        //System.out.println("Asal: " + p1.getAsal());
        System.out.println("Asal: " + "kingdom of Orvel");
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}


