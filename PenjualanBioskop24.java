import java.util.Scanner;

public class PenjualanBioskop24 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket;
        int totalTiket = 0;
        int hargaTiket = 50000;
        int subtotal, diskon, totalBayar;
        int totalPenjualan = 0;

        do {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();

            if (jumlahTiket < 0) {
                System.out.println("Input tidak valid, silakan ulangi.");
                continue;
            }

            if (jumlahTiket > 0) {
                subtotal = jumlahTiket * hargaTiket;
                diskon = 0;

                if (jumlahTiket > 10) {
                    diskon = subtotal * 15 / 100;
                } else if (jumlahTiket > 4) {
                    diskon = subtotal * 10 / 100;
                }

                totalBayar = subtotal - diskon;

                totalTiket += jumlahTiket;
                totalPenjualan += totalBayar;

                System.out.println("Total bayar: Rp. " + totalBayar);
            }

        } while (jumlahTiket !=0);

        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp. " + totalPenjualan);

    }
}
