package No4;

public class Main {
    public static void main(String[] args) {
        // Membuat jenis perangkat elektronik
        JenisPerangkat smartphone = new JenisPerangkat("Smartphone", "Mobile Device");
        JenisPerangkat laptop = new JenisPerangkat("Laptop", "Personal Computer");

        // Membuat produk elektronik
        ProdukElektronik produk1 = new ProdukElektronik("Samsung", "Galaxy S20", smartphone, 2020);
        ProdukElektronik produk2 = new ProdukElektronik("Apple", "MacBook Pro", laptop, 2019);

        // Menampilkan informasi produk elektronik
        System.out.println("Produk 1:");
        System.out.println("Merek: " + produk1.getMerek());
        System.out.println("Model: " + produk1.getModel());
        System.out.println("Jenis Perangkat: " + produk1.getJenisPerangkat().getNama());
        System.out.println("Tipe: " + produk1.getJenisPerangkat().getTipe());
        System.out.println("Tahun Produksi: " + produk1.getTahunProduksi());

        System.out.println();

        System.out.println("Produk 2:");
        System.out.println("Merek: " + produk2.getMerek());
        System.out.println("Model: " + produk2.getModel());
        System.out.println("Jenis Perangkat: " + produk2.getJenisPerangkat().getNama());
        System.out.println("Tipe: " + produk2.getJenisPerangkat().getTipe());
        System.out.println("Tahun Produksi: " + produk2.getTahunProduksi());
    }
}
