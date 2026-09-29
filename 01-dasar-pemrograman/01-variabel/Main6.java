import java.util.Scanner;
public class Main6 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukan akun: ");
        boolean aktif = in.nextBoolean();

        if (!aktif) {
            System.out.println("akun tidak aktif");
        } else {
            System.out.println("akun aktif");
        }
        System.out.println("akun anda: " + aktif);
        
    }
}
