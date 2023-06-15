import java.util.ArrayList;

public class Pembeli {
    private String nama;
    private ArrayList<Menu> pesanan;

    public Pembeli(String nama) {
        this.nama = nama;
        this.pesanan = new ArrayList<>();
    }

    public void tempatPesanan(Menu menu) {
        pesanan.add(menu);
    }

    public void tampilkanPesanan() {
        System.out.println("Pesanan untuk " + nama + ":");
        for (Menu menu : pesanan) {
            menu.tampilkanInfoMenu();
            System.out.println("=====================================================");
        }
    }
}