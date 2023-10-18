import java.util.Scanner;
public class PRAK102_2210817220011_MeldianaHandayani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka awal deret: ");
        int angkaAwal = scanner.nextInt();
        int jumlahBaris = 0;
        int bilangan = angkaAwal;
        String output = "";
        while (jumlahBaris <= 10) {
            if (bilangan % 5 == 0) {
                output += ((bilangan /5)- 1) + ", ";
            } else {
                output += bilangan + ", ";
            }
            bilangan++;
            jumlahBaris++;
        }
        output = output.substring(0, output.length() - 2);
        System.out.println(output);
        scanner.close();
    }
}

