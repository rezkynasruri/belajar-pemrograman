import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // latihan day 1

        System.out.println("Halo, saya sedang belajar Java!");

        // Sting nama
        String nama = "Rezky";
        System.out.println(nama);

        // int umur
        int umur = 17;
        System.out.println(umur);

        // String kelas
        String kelas = "11 PPLG";
        System.out.println(kelas);

        // double  nilai
        double nilai = 31.4;
        System.out.println(nilai);

        // bolean aktif     
        boolean aktif = true;
        System.out.println(aktif);

        // float nilai kkm
        float nilaiKKM = 31.1f;
        System.out.println(nilaiKKM);

        // latihan day 2
        System.out.println();

        String NamaSekolah ="Igasar Pindad Bandung";
        System.out.println(NamaSekolah);

        int JumblahSoudara = 3;
        System.out.println(JumblahSoudara);

        double RataRataNilai = 86.3;
        System.out.println(RataRataNilai);

        boolean NonAktif = false;
        System.out.println(NonAktif);

        String jurusan = "PPLG";
        System.out.println(jurusan);

        // tambah kurang kali bagi

        System.out.println();

        int HasilTambah = 25+10;
        System.out.println(HasilTambah);

        double HasilSisa = 17 % 5;
        System.out.println(HasilSisa);

        double camelCase = 17 % 5;
        System.out.println(camelCase);

        // opprator perbandingan

        System.out.println();

        boolean CekUmur = 17 >= 17;
        System.out.println(CekUmur);

        boolean CekNilai = 75 >= 75;
        System.out.println(CekNilai);

        // if else

            System.out.println();
        
        int Nilai = 75;
        if (Nilai >= 75) { 
            System.out.println("lulus");
        } else {
            System.out.println("gk lulus");
        }

        System.out.println();

        int niilai = 60;
        if (niilai >= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("GK lulus");
        }

        // if else 3 cabang

        System.out.println();

        System.out.println();

        int nillai = 80;
        if (nillai >= 85) {
            System.out.println("sangat baik");
        } else if (nillai >=80) {
            System.out.println("lulus");
        } else {
            System.out.println("gk lulus");
        }

        // if else umur

        System.out.println();

        int Umur = 17;
        if (Umur >= 18) {
            System.out.println("dewasa");
        } else if (Umur >= 13) {
            System.out.println("remaja");
        } else if (Umur >= 6) {
            System.out.println("anak-anak");
        } else {
            System.out.println("balita");
        }

        // if else &&?

        System.out.println();

        int nilaii = 80;
        int kehadiran = 90;

        if (nilaii >= 75 && kehadiran >= 80) {
            System.out.println("lulus");
        } else {
            System.out.println("tidak lulus");
        }

        
    }
}