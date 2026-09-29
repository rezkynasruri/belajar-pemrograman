import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan unur: ");
        int umur = input.nextInt();
        input.nextLine();

        System.out.print("Masukkan nama: ");
        String namaLengkap = input.nextLine();

        System.out.println("umur kamu: " + umur);
        System.out.println("nama lengkap kamu: " +namaLengkap);
    }
}