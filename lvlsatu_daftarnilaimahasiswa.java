public class lvlsatu_daftarnilaimahasiswa {
    public static void main(String[] args) {
        System.out.println("===== SOAL 01: Daftar Nilai Mahasiswa =====");
        int[] nilai = {80, 75, 90, 65, 85};
        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Indeks " + i + " (mahasiswa ke-" + (i + 1) + ") = " + nilai[i]);
        }

        System.out.println("Nilai pada indeks ke-2 = " + nilai[2]);

        System.out.println("Penjelasan: indeks dimulai dari 0, urutan mahasiswa dari 1,");
        System.out.println(" sehingga indeks ke-2 adalah mahasiswa urutan ke-3.");

    
    }
    
}
