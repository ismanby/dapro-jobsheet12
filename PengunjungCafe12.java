public class PengunjungCafe12 {
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");  
        daftarPengunjung("Andi");
        daftarPengunjung("Doni", "Eti", "Fahmi", "Galih");  
    }

    static void daftarPengunjung(String ...namaPengunjung){
        System.out.println("Daftar Nama Pengunjung: ");
        for (int i = 0; i < namaPengunjung.length; i++) {
            System.out.println("- " + namaPengunjung[i]);
        }
    }
}
