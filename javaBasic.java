import java.util.Scanner;

public class javaBasic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int nilai;
        String ket;
        System.out.print("Masukkan nilai : ");

        nilai = input.nextInt();
        // seleksi
        if (nilai >= 80) {
            ket = "A";
        } else if (nilai >= 61) {
            ket = "B";
        } else if (nilai >= 41) {
            ket = "C";
        } else if (nilai >= 21) {
            ket = "D";
        } else {
            ket = "E";
        }
        System.out.println("===============");
        System.out.println("Total nilai = " + nilai);
        System.out.println("Keterangan nilai = " + ket);
    }
}
