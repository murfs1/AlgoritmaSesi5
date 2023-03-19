import java.util.ArrayList;
import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        System.out.println("Nomor 2");
        Scanner input = new Scanner(System.in);

        String[][] buah = {
                { "apel", "35000" },
                { "jeruk", "50000" },
                { "mangga", "25000" },
                { "duku", "15000" },
                { "semangka", "20000" }
        };

        ArrayList<Integer> jumlahBeli = new ArrayList<>();
        ArrayList<Integer> subtotal = new ArrayList<>();
        int totalHarga = 0;

        char lagi = 'y';
        while (lagi == 'y') {
            System.out.println("Pilih Buah (0-4): ");
            int pilihan = input.nextInt();

            System.out.println("Masukkan jumlah: ");
            int jumlah = input.nextInt();

            jumlahBeli.add(jumlah);
            int harga = Integer.parseInt(buah[pilihan][1]);
            int total = jumlah * harga;
            subtotal.add(total);
            totalHarga += total;

            System.out.println("Input lagi? (y/n): ");
            lagi = input.next().charAt(0);
        }

        System.out.println("Daftar Belanja:");
        System.out.println("========================================");
        System.out.println("No. Nama Buah Jumlah Harga Subtotal");
        for (int i = 0; i < jumlahBeli.size(); i++) {
            System.out.println(
                    (i + 1) + " " + buah[i][0] + " " + jumlahBeli.get(i) + " " + buah[i][1] + " " + subtotal.get(i));
        }
        System.out.println("========================================");
        System.out.println("Total: " + totalHarga);

        if (totalHarga > 100000) {
            double diskon = 0.15 * totalHarga;
            double totalBayar = totalHarga - diskon;
            System.out.println("Discount(15%): " + diskon);
            System.out.println("Total bayar: " + totalBayar);
        } else {
            System.out.println("Total bayar: " + totalHarga);
        }

        System.out.println("Terima kasih telah berbelanja!");
    }
}