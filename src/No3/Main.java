package No3;

public class Main {
    public static void main(String[] args) {
        // Membuat jenis pesawat
        JenisPesawat pesawatKomersial = new JenisPesawat("Komersial", "Penumpang");
        JenisPesawat pesawatKargo = new JenisPesawat("Kargo", "Kargo");

        // Membuat pesawat-pesawat
        Pesawat pesawat1 = new Pesawat("Maskapai A", pesawatKomersial, 200, 2010);
        Pesawat pesawat2 = new Pesawat("Maskapai B", pesawatKargo, 50, 2015);

        // Menampilkan informasi pesawat
        System.out.println("Pesawat 1:");
        System.out.println("Maskapai: " + pesawat1.getMaskapai());
        System.out.println("Jenis Pesawat: " + pesawat1.getJenisPesawat().getNama());
        System.out.println("Tipe Layanan: " + pesawat1.getJenisPesawat().getTipeLayanan());
        System.out.println("Jumlah Kursi: " + pesawat1.getJumlahKursi());
        System.out.println("Tahun Pembuatan: " + pesawat1.getTahunPembuatan());

        System.out.println();

        System.out.println("Pesawat 2:");
        System.out.println("Maskapai: " + pesawat2.getMaskapai());
        System.out.println("Jenis Pesawat: " + pesawat2.getJenisPesawat().getNama());
        System.out.println("Tipe Layanan: " + pesawat2.getJenisPesawat().getTipeLayanan());
        System.out.println("Jumlah Kursi: " + pesawat2.getJumlahKursi());
        System.out.println("Tahun Pembuatan: " + pesawat2.getTahunPembuatan());
    }
}
