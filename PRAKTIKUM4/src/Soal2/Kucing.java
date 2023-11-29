package Soal2;
    public class Kucing extends HewanPeliharaan {
        private String warnaBulu;
        public Kucing(String r, String n, String w) {
            super(r, n);
            this.warnaBulu = w;
        }

        @Override
        public void display() {
            super.display();
            System.out.println("Memiliki warna bulu : " + warnaBulu);
        }
        public void displayDetailKucing() {
            display();
        }
    }

