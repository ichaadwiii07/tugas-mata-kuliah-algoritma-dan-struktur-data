public class lvldua_analisisnilaiujian {
    public static void main(String[] args) {
        System.out.println("===== SOAL 05: ANALISIS  NILAI UJIAN =====");

        int[] nilai = {75, 80, 65, 90, 55, 85, 70, 95};
        int total = 0;

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];
        }

        double rataRata =  (double) total / nilai.length;

        System.out.println("Total nilai = " + total);
        System.out.println("Rata-rata = " + rataRata);

        System.out.println("\nNilai yang lebih besar dari rata-rata:");

        for (int i = 0; i < nilai.length; i++) {
            if (nilai[i] > rataRata){
                System.out.println(nilai[i]);
            }
        }
        int jumlahLulus = 0;

        for (int i = 0; i < nilai.length; i++){
            if (nilai[i] >= 70){
                jumlahLulus++;
            }
        }
        double persentase =
                (double) jumlahLulus / nilai.length * 100;
        System.out.println("\nJumlah mahasiswa lulus = " + jumlahLulus);
        System.out.println("Persentase lulus = " + persentase + "%");
    }
    
}
