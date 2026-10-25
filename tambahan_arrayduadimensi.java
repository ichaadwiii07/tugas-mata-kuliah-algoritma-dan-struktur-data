public class tambahan_arrayduadimensi {
    public static void main(String[] args) {
        int[][] nilai = {
            {80, 75, 90},
            {65, 70, 85},
            {90, 95, 88},
            {72, 68, 78}
        };

        int jumlahMahasiswa = nilai.length;
        int jumlahMatkul = nilai[0].length;

        System.out.println("1. TABEL NILAI");
        System.out.println("Mhs\tMK1\tMK2\tMK3");

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print((i+1) + "\t");
            for (int j = 0; j < jumlahMatkul; j++) {
                System.out.print(nilai[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2. RATA-RATA TIAP MAHASISWA");

        double[] rataMahasiswa = new double[jumlahMahasiswa];

        for (int i =  0; i < jumlahMahasiswa; i++) {
            int total = 0;
            for (int j = 0; j < jumlahMatkul; j++) {
                total = total + nilai[i][j];
            }
            rataMahasiswa[i] = (double) total / jumlahMatkul;
            rataMahasiswa[i] = Math.round(rataMahasiswa[i]*100) /100.0;
            System.out.println("Mahasiswa" + (i+1)+":" + rataMahasiswa[i]);
        }
        System.out.println();
        System.out.println("3. RATA-RATA TIAP MATA KULIAH");

        double[] rataMatkul =new double[jumlahMatkul];

        for (int j = 0; j < jumlahMatkul; j++) {
            int total = 0;
            for (int i = 0; i < jumlahMahasiswa; i++) {
                total = total + nilai[i][j];
            }
            rataMatkul[j] = (double) total / jumlahMahasiswa;
            rataMatkul[j] = Math.round(rataMatkul[j]*100)  / 100.0;
            System.out.println("Mata Kuliah" + (j+1)+":" + rataMatkul[j]);
        }
        int indeksTertinggi = 0;
        for (int i = 1; i < jumlahMahasiswa; i++) {
            if (rataMahasiswa[i] > rataMahasiswa[indeksTertinggi]) {
                indeksTertinggi = i;
            }
        }
        System.out.println();
        System.out.println("4. RATA-RATA TERTINGGI");
        System.out.println("Mahasiswa" + (indeksTertinggi + 1) + "dengan rata-rata"+ rataMahasiswa[indeksTertinggi]);

        int indeksTerrendah =0;
        for (int j = 1; j< jumlahMatkul; j++) {
            if (rataMatkul[j] < rataMatkul[indeksTerrendah]){
                indeksTerrendah=j;
            }
        }

        System.out.println();
        System.out.println("5. RATA-RATA TERRENDAH");
        System.out.println("Mata kuliah" + (indeksTerrendah +1) + "dengan rata-rata " +rataMatkul[indeksTerrendah]);
}  
}
        