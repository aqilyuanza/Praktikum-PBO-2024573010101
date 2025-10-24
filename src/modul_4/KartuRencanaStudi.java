package modul_4;

import java.util.ArrayList;

public class KartuRencanaStudi {
    private Mahasiswa mahasiswa;
    private ArrayList<MataKuliah> daftarMK;
    private int maxMK;
    private final int BATAS_SKS = 24;

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMK) {
        this.mahasiswa = mahasiswa;
        this.maxMK = maxMK;
        this.daftarMK = new ArrayList<>();
    }

    // Menghitung total SKS yang sudah diambil
    private int totalSKS() {
        int total = 0;
        for (MataKuliah mk : daftarMK) {
            total += mk.getSks();
        }
        return total;
    }

    // Tambah mata kuliah dengan validasi batas SKS
    public void tambahMatakuliah(MataKuliah mk) {
        if (daftarMK.size() >= maxMK) {
            System.out.println("Kapasitas mata kuliah sudah penuh!");
            return;
        }

        int totalBaru = totalSKS() + mk.getSks();
        if (totalBaru > BATAS_SKS) {
            System.out.println("Gagal menambahkan! Total SKS melebihi batas (" + BATAS_SKS + " SKS).");
            return;
        }

        daftarMK.add(mk);
        System.out.println("Mata kuliah berhasil ditambahkan!");
        System.out.println("Total SKS saat ini: " + totalBaru);
    }

    // Input nilai berdasarkan kode MK
    public void inputNilai(String kode, double nilai) {
        for (MataKuliah mk : daftarMK) {
            if (mk.getKode().equalsIgnoreCase(kode)) {
                mk.setNilai(nilai);
                System.out.println("Nilai berhasil dimasukkan untuk " + mk.getNama());
                return;
            }
        }
        System.out.println("Kode mata kuliah tidak ditemukan!");
    }

    // Hapus mata kuliah
    public void hapusMatakuliah(String kode) {
        for (MataKuliah mk : daftarMK) {
            if (mk.getKode().equalsIgnoreCase(kode)) {
                daftarMK.remove(mk);
                System.out.println("Mata kuliah " + mk.getNama() + " berhasil dihapus.");
                return;
            }
        }
        System.out.println("Kode mata kuliah tidak ditemukan!");
    }

    // Tampilkan KRS
    public void tampilkanKRS() {
        System.out.println("\n================= KARTU RENCANA STUDI =================");
        mahasiswa.tampilkanData();
        System.out.println("-------------------------------------------------------");
        System.out.printf("%-10s %-25s %-5s %-10s%n", "Kode", "Nama Mata Kuliah", "SKS", "Nilai");
        System.out.println("-------------------------------------------------------");

        for (MataKuliah mk : daftarMK) {
            mk.tampilkanData();
        }

        System.out.println("-------------------------------------------------------");
        System.out.println("Total SKS: " + totalSKS());
        System.out.println("-------------------------------------------------------");
    }

    // Menampilkan mata kuliah dengan nilai terbaik dan terburuk
    public void tampilkanNilaiTerbaikDanTerburuk() {
        if (daftarMK.isEmpty()) {
            System.out.println("Belum ada mata kuliah dalam KRS!");
            return;
        }

        MataKuliah terbaik = daftarMK.get(0);
        MataKuliah terburuk = daftarMK.get(0);

        for (MataKuliah mk : daftarMK) {
            if (mk.getNilai() > terbaik.getNilai()) terbaik = mk;
            if (mk.getNilai() < terburuk.getNilai()) terburuk = mk;
        }

        System.out.println("\n=== NILAI TERBAIK & TERBURUK ===");
        System.out.println("Mata Kuliah Nilai Terbaik:");
        terbaik.tampilkanData();

        System.out.println("\nMata Kuliah Nilai Terburuk:");
        terburuk.tampilkanData();
        System.out.println("----------------------------------");
    }
}
