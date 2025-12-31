package MultipleInterface;

public class Main {
    public static void main(String[] args) {
        eCommerce order = new eCommerce();

        order.bayar(250000);
        order.kirim("Jl. Merdeka No. 10, Jakarta");
        order.notif("Pesanan Anda telah dikirim!");
    }
}
