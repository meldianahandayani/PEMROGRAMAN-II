package Soal2;
   public  class Anjing extends HewanPeliharaan {
        private String warnaBulu;
        private String kemampuan;
        public Anjing(String r, String n, String w, String k) {
            super(r, n);
            this.warnaBulu = w;
            this.kemampuan = k;
        }
        @Override
        public void display() {
            super.display();
            System.out.println("Memiliki warna bulu : " + warnaBulu);
            System.out.println("Memiliki kemampuan : " + kemampuan);
        }
       public void displayDetailAnjing() {
           display();
       }
    }

