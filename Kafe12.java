import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        Menu();

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc.nextInt();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();

        double totalHarga = hitungTotalHarga(pilihanMenu, banyakItem, "");

        System.out.println("Total harga untuk pesanan Anda: Rp " + totalHarga);

        sc.close();
    }
    
    public static void Menu() {
        System.out.println("===== MENU RESTO KAFE =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("============================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static double hitungTotalHarga(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

        double hargaTotal = hargaItems[pilihanMenu-1] * banyakItem;
        double diskon; 

        if (kodePromo == "DISKON30" ) {
            diskon = (double) hargaTotal * 0.3;
            System.out.println("Anda mendapatkan diskon sebesar Rp " + diskon);
            hargaTotal = hargaTotal - diskon;
        } else if (kodePromo == "DISKON50") {
            diskon = (double) hargaTotal * 0.3;
            System.out.println("Anda mendapatkan diskon sebesar Rp " + diskon);
            hargaTotal = hargaTotal - diskon;
        } else {
            System.out.println("Kode Invalid!");
        }

        return hargaTotal;
    }
}