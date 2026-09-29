import java.util.Scanner;
public class main1 {
    
    public static void  main (String[]args){
        Scanner in = new Scanner(System.in);

        // day 3. input output

        System.out.print("masukan umur: " );
        int umur = in.nextInt();

        // String

        System.out.print("masukan nama: ");
        String NamaLengkap = in.nextLine();
        System.out.println("nama lengkap kamu:" + NamaLengkap);


        System.out.print("masukan nama: ");
        String nama = in.next();
        System.out.println("nama kamu: " + nama);

    }
}
