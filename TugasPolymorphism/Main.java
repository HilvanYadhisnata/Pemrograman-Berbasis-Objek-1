import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== SISTEM PERHITUNGAN ONGKIR TOKO ONLINE =====");
        
        System.out.print("Masukkan berat paket (kg): ");
        double berat = scanner.nextDouble();
        
        System.out.print("Masukkan jarak pengiriman (km): ");
        double jarak = scanner.nextDouble();
        
        System.out.println("\nPilih layanan pengiriman:");
        System.out.println("1. Reguler");
        System.out.println("2. Express");
        System.out.println("3. Same Day");
        System.out.print("Pilihan Anda (1-3): ");
        int pilihan = scanner.nextInt();
        
        Pengiriman pengiriman = null;
        
        switch (pilihan) {
            case 1:
                pengiriman = new PengirimanReguler(berat, jarak);
                break;
            case 2:
                pengiriman = new PengirimanExpress(berat, jarak);
                break;
            case 3:
                pengiriman = new PengirimanSameDay(berat, jarak);
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                scanner.close();
                return;
        }
        
        pengiriman.tampilkanRincian();
        
        scanner.close();
    }
}
