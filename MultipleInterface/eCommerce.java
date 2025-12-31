package MultipleInterface;

public class eCommerce implements Pembayaran, Pengiriman, Notifikasi {
    
    public boolean bayar (double jumlah) {
        System.out.println("Memproses pembayaran sebesar: Rp. " + jumlah);
        return true;
    }

    public void kirim (String alamat) {
        System.out.println("Mengirim barang ke alamat: " + alamat);
    }

    public void notif (String pesan) {
        System.out.println("Notifikasi: " + pesan);
    }
}
