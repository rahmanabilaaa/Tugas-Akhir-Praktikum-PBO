abstract class MenuBakso implements Menu {
    private String tipe;
    private int harga;

    public MenuBakso(String tipe, int harga) {
        this.tipe = tipe;
        this.harga = harga;
    }

    public String getTipe() {
        return tipe;
    }

    public double getHarga() {
        return harga;
    }
}