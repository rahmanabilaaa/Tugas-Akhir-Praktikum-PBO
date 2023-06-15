import java.util.ArrayList;

public class Bakso extends MenuBakso {
    private ArrayList<TopingBakso> topings;

    public Bakso(String tipe, int harga) {
        super(tipe, harga);
        this.topings = new ArrayList<>();
    }

    public void addToping(TopingBakso toping) {
        topings.add(toping);
    }

    @Override
    public void tampilkanInfoMenu() {
        System.out.println("Tipe Bakso: " + getTipe());
        System.out.println("Harga: Rp. " + getHarga());
        System.out.println("=====================================================");
        System.out.println("Isi Toping: ");
        for (TopingBakso toping : topings) {
            System.out.println("- " + toping.getNama() + " (Rp. " + toping.getHarga() + ")");
        }
    }
}