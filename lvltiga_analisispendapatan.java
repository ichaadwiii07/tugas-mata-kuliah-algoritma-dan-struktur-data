public class lvltiga_analisispendapatan {
    public static void main(String[] args) {
        System.out.println("===== SOAL 12: ANALISIS PENDAPATAN TOKO =====");

        int[] pendapatan = {
            250, 300, 180, 420, 350, 300, 500, 150, 420, 380 
        };
        int total = 0;

        for (int i = 0; i < pendapatan.length; i++) {
            total += pendapatan[i];
        }
        double rataRata =
            (double) total / pendapatan.length;

        System.out.println("Total pendapatan = Rp" + total + ".000");
        System.out.println("Rata-rata = Rp" + rataRata + ".000");
        System.out.println("\nPendapatan di atas rata-rata:");

        for (int i = 0; i < pendapatan.length; i++){
            if (pendapatan[i] < rataRata) {
                System.out.println(
                    "Hari ke-" + (i+1) + "= Rp" + pendapatan[i] +".000"
                );
            }
        }
        int nilaiTerbanyak = pendapatan[0];
        int frekuensiTerbanyak = 0;

        for (int i = 0; i < pendapatan.length; i++) {
            int frekuensi = 0;

            for (int j = 0; j < pendapatan.length; j++) {
                if (pendapatan[i] == pendapatan[j]) {
                frekuensi++;
            }
        }
        if (frekuensi > frekuensiTerbanyak) {
            frekuensiTerbanyak = frekuensi;
            nilaiTerbanyak = pendapatan[i];
        }
        }
        System.out.println("\nPendapatan paling sering muncul = Rp" + nilaiTerbanyak + ".000");
        System.out.println("\nPendapatanpaling sering muncul = Rp" + nilaiTerbanyak+ ".000");
        System.out.println("Muncul sebanyak " + frekuensiTerbanyak + "kali");

        int tertinggi = Integer.MIN_VALUE;
        int keduaTertinggi = Integer.MIN_VALUE;

        for (int i = 0; i < pendapatan.length; i++) {
            if (pendapatan[i] >tertinggi) {
                keduaTertinggi = tertinggi;
                tertinggi = pendapatan[i];
            } else if (
                pendapatan[i] > keduaTertinggi && pendapatan[i] != tertinggi
            ) {
                keduaTertinggi = pendapatan[i];
            }
        }
        System.out.println("\nPendapatan tertinggi = Rp" + keduaTertinggi + ".000");
        System.out.println("Pendapatan kedua tertinggi = Rp" + keduaTertinggi + ".000");

        int jumlahTurun = 0;

        for (int i = 1; i < pendapatan.length; i++) {
            if (pendapatan[i] < pendapatan[i - 1]) {
                jumlahTurun++;
            }
        }
        System.out.println("\nJumlah hari pendapatan turun = " + jumlahTurun);
    }
    
}
