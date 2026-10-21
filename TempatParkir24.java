import java.util.Scanner;

public class TempatParkir24 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int durasi, total = 0;
        int tarifMobil = 3000, tarifMotor = 2000;
        int jenisKendaraan = 1;

        while (jenisKendaraan !=0) {
            System.out.println("Masukkan jenis kendaraan: (1 mobil, 2 motor, 0 keluar): ");
            jenisKendaraan = sc.nextInt();

            if (jenisKendaraan == 0) {
                System.out.println("Jenis kendaraan tidak valid.");
            break;
            }

            if ((jenisKendaraan == 1) || (jenisKendaraan == 2)) {
                System.out.println("Masukkan lama parkir (jam): ");
                durasi = sc.nextInt();

            if (jenisKendaraan == 1) {
                total += durasi * tarifMobil;
            } else {
                total += durasi * tarifMotor;
            } 
            }
        }
            System.out.println("Total bayar: " + total);
    }
}



