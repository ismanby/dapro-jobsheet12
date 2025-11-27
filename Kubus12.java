import java.util.Scanner;

public class Kubus12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, L, V;

        System.out.print("Masukkan sisi: ");
        a = sc.nextInt();

        L = luasPermukaanKubus(a);
        System.out.println("Luas Permukaan Kubus adalah: " + L);

        V = volumeKubus(a);
        System.out.println("Volume Kubus adalah: " + V);
        
        sc.close();
    }

    static int volumeKubus(int sisi) {
        int volume = sisi * sisi * sisi;
        return volume;
    }

    static int luasPermukaanKubus(int s) {
        int luasPermukaan = 6 * s * s;
        return luasPermukaan;
    }
}
