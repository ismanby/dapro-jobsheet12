import java.util.Scanner;

public class RekapPenjualanCafe12 {
    static Scanner sc = new Scanner(System.in);

    static String[] menu = { "Kopi", "Teh", "Es Kelapa Muda", "Roti Bakar", "Gorengan" };

    static int[][] penjualan = new int[5][7];

    public static void main(String[] args) {
        inputData();
        tampilData();
        menuTertinggi();
        rataMenu();
    }

    static void inputData() {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan data untuk menu: " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilData() {
        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.printf("%-15s %-10s %-10s %-11s %-12s %-13s %-11s %-8s\n", "Menu", "Hari 1", "Hari 2", "Hari 3", "Hari 4", "Hari 5", "Hari 6", "Hari 7");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------");

        for (int i = 0; i < penjualan.length; i++) {
            System.out.printf("%-18s", menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.printf("%-12d", penjualan[i][j]);
            }
            System.out.println();
        }
    }

    static void menuTertinggi() {
        int maxTotal = -1;
        int indexMax = 0;

        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            if (total > maxTotal) {
                maxTotal = total;
                indexMax = i;
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi:");
        System.out.println(menu[indexMax] + " (Total: " + maxTotal + ")");
    }

    static void rataMenu() {
        System.out.println("\n=== RATA-RATA PER MENU ===");
        for (int i = 0; i < penjualan.length; i++) {
            int total = 0;
            for (int j = 0; j < penjualan[i].length; j++) {
                total += penjualan[i][j];
            }
            double rata = (double) total / penjualan[i].length;
            System.out.printf("%s : %.2f\n", menu[i], rata);
        }
    }

}