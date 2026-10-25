public class lvldua_suhutertinggidanterrendah {
    public static void main(String[] args) {
        System.out.println("===== SOAL 07: SUHU TERTINGGI DAN TERRENDAH =====");
        int[] suhu = {29, 32, 27, 35, 31, 26, 34};

        int tertinggi = suhu[0];
        int terrendah = suhu[0];

        int indeksTertinggi = 0;
        int indeksTerrendah = 0;

        for (int i = 1; i < suhu.length; i++) {
            if (suhu[i] > tertinggi){
                tertinggi= suhu[i];
                indeksTertinggi = i;
            }
            
            if (suhu[i] < terrendah) {
                terrendah = suhu[i];
                indeksTerrendah = i;
            }
        }

        int selisih = tertinggi - terrendah;
        System.out.println("Suhu tertinggi = " + tertinggi + "°C");
        System.out.println("Indeks suhu tertinggi = " + indeksTertinggi);

        System.out.println("Suhu terrendah = " + terrendah + "°C");
        System.out.println("Indeks suhu terrendah = " + indeksTerrendah);

        System.out.println("Selisih suhu = " + selisih + "°C");
    }
    
}
