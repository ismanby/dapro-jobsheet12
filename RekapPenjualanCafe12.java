import java.util.Scanner;

public class RekapPenjualanCafe12 {
    static Scanner sc = new Scanner(System.in);

    static String[] menu;

    static int[][] penjualan;

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah menu: ");
        int jumlahMenu = sc.nextInt();

        System.out.print("Masukkan jumlah hari: ");
        int jumlahHari = sc.nextInt();
        sc.nextLine();

        menu = new String[jumlahMenu];
        penjualan = new int[jumlahMenu][jumlahHari];

        System.out.println("\n=== INPUT NAMA MENU ===");
        for (int i = 0; i < jumlahMenu; i++) {
            System.out.print("Nama menu ke-" + (i + 1) + ": ");
            menu[i] = sc.nextLine();
        }

        inputData();
        tampilData();
        menuTertinggi();
        rataMenu();
    }

    static void inputData() {
        System.out.println("=== INPUT DATA PENJUALAN ===");
        for (int i = 0; i < penjualan.length; i++) {
            System.out.println("Masukkan data untuk menu " + menu[i]);
            for (int j = 0; j < penjualan[i].length; j++) {
                System.out.print("Hari ke-" + (j + 1) + " : ");
                penjualan[i][j] = sc.nextInt();
            }
            System.out.println();
        }
    }

    static void tampilData() {
        System.out.println("\n=== DATA PENJUALAN ===");
        System.out.printf("%-18s", "Menu");

        for (int j = 0; j < penjualan[0].length; j++) {
            System.out.printf("%-12s", "Hari " + (j + 1));
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------------------------------");

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