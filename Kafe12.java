import java.util.Scanner;

public class Kafe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        String[] namaMenu = {"Kopi Hitam", "Cappuccino", "Latte", "Teh Tarik", "Roti Bakar", "Mie Goreng"};

        double totalKeseluruhan = 0;
        char lanjut = 0;

        do {
            Menu();

            System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu < 1 || pilihanMenu > 6) {
                System.out.println("Menu tidak tersedia!");
                continue;
            }

            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();

            double totalHarga = hargaItems[pilihanMenu - 1] * banyakItem;
            totalKeseluruhan += totalHarga;

            System.out.println("Pesanan: " + namaMenu[pilihanMenu - 1] + " x " + banyakItem);
            System.out.println("Subtotal: Rp " + totalHarga);

            System.out.print("\nApakah Anda ingin memesan menu lain? (y/n) : ");
            lanjut = sc.next().charAt(0);

        } while (lanjut == 'y' || lanjut == 'Y');

        System.out.println("\n====================================");
        System.out.println("TOTAL KESELURUHAN PESANAN: Rp " + totalKeseluruhan);
        System.out.println("====================================");

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
    }
}
