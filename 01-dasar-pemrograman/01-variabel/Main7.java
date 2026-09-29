import java.util.Scanner;
public class Main7 {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);

        System.out.print("masukan nama: ");
        String nama = in.nextLine();
        System.out.print("masukan nilai: ");
        int nilai = in.nextInt();
        System.out.print("masukan kehadiran:");
        int kehadiran = in.nextInt();
        System.out.print("tugas selesai: ");
        boolean tugasSelesai = in.nextBoolean();

        if (nilai >= 80 && kehadiran >= 80 || tugasSelesai) {
            System.out.println("lulus");
        } else {
            System.out.println("gk lulus");
        }

        System.out.println("nama: " + nama);
        System.out.println("nilai: " + nilai);
        System.out.println("kehadiran: " + kehadiran);
    }
}
