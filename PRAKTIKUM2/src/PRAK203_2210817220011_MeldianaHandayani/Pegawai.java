package PRAK203_2210817220011_MeldianaHandayani;
public class Pegawai {
    public String nama;
    public char asal;
    public String jabatan;
    public int umur;
    public String getNama() {
        return nama;
    }
    public String getAsal() {
        //pada baris ini terjadi error karena Pada baris public String getAsal()
        //, metode getAsal() mengembalikan sebuah char sementara deklarasi metode harus mengembalikan String.
        //return asal;
        return String.valueOf(asal);
    }
    //Pada baris ini terjadi error karena mencoba untuk mengatur jabatan tetapi
    //parameter j tidak didefinisikan
    //public void setJabatan() {
    public void setJabatan(String j) {
        this.jabatan = j;
    }
    public void setUmur(int u) {
        umur = u;
    }
}