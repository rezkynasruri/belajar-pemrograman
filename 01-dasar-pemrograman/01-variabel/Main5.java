import java.util.Scanner;
public class Main5 {
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);

        System.out.print("masukan nilai: ");
        int nilai = in.nextInt();

        System.out.print("masukan kehadiran: ");
        int kehadiran = in.nextInt();

        if (nilai >= 80 || kehadiran >= 80) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
        }

        System.out.println("nilai: " +nilai);
        System.out.println("kehadiran: " +kehadiran);

    }
}
