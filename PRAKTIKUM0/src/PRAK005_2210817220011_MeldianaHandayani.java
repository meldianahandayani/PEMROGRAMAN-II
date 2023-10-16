import java.util.Scanner;
public class PRAK005_2210817220011_MeldianaHandayani {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan makanan favorit: ");
        String makananFavorit = scanner.nextLine();

        System.out.print("Masukkan hobi: ");
        String hobi = scanner.nextLine();

        System.out.println("Aku Suka Makan " + makananFavorit+", dan Hobiku "+hobi);

        scanner.close();
    }}
