import java.util.Scanner;
public class PRAK103_2210817220011_MeldianaHandayani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan jumlah baris (N): ");
        int N = scanner.nextInt();
        System.out.print("Masukkan bilangan awal: ");
        int bilanganAwal = scanner.nextInt();
        int bilangan = bilanganAwal;
        String output = "";
        while (N > 0) {
            if (bilangan % 2 != 0) {
                output += bilangan + " ";
                N--;
            }
            bilangan++;
        }
        output = output.trim();
        System.out.println(output);
        scanner.close();
    }
}



