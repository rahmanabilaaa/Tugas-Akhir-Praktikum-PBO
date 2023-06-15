import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Warung Makan Bakso
        WarungMakan warung = new WarungMakan();

        // Menambahkan menu bakso
        Bakso bakso1 = new Bakso("Bakso Biasa", 10000);
        bakso1.addToping(new TopingBakso("Bakso isi Telor", 5000));
        bakso1.addToping(new TopingBakso("2 Pentol",2000));
        bakso1.addToping(new TopingBakso("Pangsit Rebus", 1000));
        bakso1.addToping(new TopingBakso("Tahu Cokelat", 1000));
        bakso1.addToping(new TopingBakso("Mie", 1000));
        warung.addMenu(bakso1);

        Bakso bakso2 = new Bakso("Bakso Spesial", 15000);
        bakso2.addToping(new TopingBakso("Bakso isi Telor", 5000));
        bakso2.addToping(new TopingBakso("3 Pentol", 3000));
        bakso2.addToping(new TopingBakso("Pangsit Rebus", 1000));
        bakso2.addToping(new TopingBakso("Pangsit Goreng", 1000));
        bakso2.addToping(new TopingBakso("Gorengan Panjang", 1000));
        bakso2.addToping(new TopingBakso("Gorengan Bola", 1000));
        bakso2.addToping(new TopingBakso("Tahu Cokelat", 1000));
        bakso2.addToping(new TopingBakso("Tahu Putih", 1000));
        bakso2.addToping(new TopingBakso("Mie", 1000));
        
        warung.addMenu(bakso2);

        // Membuat objek Pembeli Bakso
        System.out.println("=====================================================");
        System.out.print("Masukkan Nama Pembeli: ");
        String namaPembeli = scanner.nextLine();
        Pembeli pembeli = new Pembeli(namaPembeli);
        System.out.println("=====================================================");

        // Menampilkan menu bakso
        warung.tampilkanMenu();

        // Memilih bakso
        System.out.println("=====================================================");
        System.out.print("Pilih menu (masukkan nomor menu): ");
        int nomorMenu = scanner.nextInt();
        scanner.nextLine(); // Mengonsumsi karakter baru setelah membaca integer

        Menu menuYangdiPilih = warung.getMenu(nomorMenu - 1);
        if (menuYangdiPilih != null) {
            System.out.println("Kamu memilih: " + menuYangdiPilih.getTipe());
            System.out.println("=====================================================");

            // Menambahkan pesanan ke pembeli
            pembeli.tempatPesanan(menuYangdiPilih);

            // Menampilkan pesanan
            System.out.println("Pemilihan pesanan berhasil!");
            System.out.println("=====================================================");

            pembeli.tampilkanPesanan();
        } else {
            System.out.println("Nomor menu invalid. Pesanan dibatalkan.");
            System.out.println("=====================================================");
        }
    }
}