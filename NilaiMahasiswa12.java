import java.util.Scanner;

public class NilaiMahasiswa12 {

    static int mahasiswa;
    static int nilai[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== PROGRAM NILAI MAHASISWA ===");
        System.out.print("Masukkan jumlah mahasiswa: ");
        mahasiswa = sc.nextInt();
        
        nilai = new int[mahasiswa];

        isianArray();
        tampilArray(nilai);
        int totalNilai = hitTot(nilai);

        System.out.println("==========================================");
        System.out.println("Total nilai seluruh mahasiswa adalah " + totalNilai);
        sc.close();
    }

    static void isianArray() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        System.out.println();
        sc.close();
    }

    static void tampilArray(int[] nilai) {
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai mahasiswa ke-" + (0 + 1) + ": " + nilai[i]);
        }
    }

    static int hitTot(int[] nilai) {
        int total = 0;
        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        return total;
    }
    
}
