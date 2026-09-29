import java.util.Scanner;
public class Main4 {
    public static void main (String[]args) {
        Scanner in = new Scanner(System.in);

        System.out.print("masukan nama: ");
        String nama = in.nextLine();

        System.out.print("masukan nilai: ");
        double nilai = in.nextDouble();

        
        System.out.println("nama kamu:" + nama);

        if (nilai >= 80 ) {
            System.out.println("lulus");
        } else {
            System.out.println("gk lulus");
        }

        System.out.println("nama kamu:" + nama);
        System.out.println("nilai kamu: " + nilai);
    }
}
