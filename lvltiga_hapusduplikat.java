public class lvltiga_hapusduplikat {
    public static void main(String[] args) {
        int[] data ={101,102,101,103,102,104,105,103};

        int[] unik = new int[data.length];
        int jumlahUnik=0;

        for (int i = 0; i < data.length; i++) {
            boolean sudahAda = false;

            for (int j = 0; j < jumlahUnik; j++) {
                if (data[i] == data[j]) {
                    sudahAda = true;
                    break;
                }
            }
            if (!sudahAda) {
                unik[jumlahUnik] = data[i];
                jumlahUnik++;
            }
        }
        System.out.println("Data unik:");

        for (int i = 0; i < jumlahUnik; i++) {
            System.out.print(unik[i] + " ");
        }
        System.out.println();
        System.out.println("\nData yang di duplikat:");

        for (int i =0; i < data.length; i++) {
            int jumlahKemunculan = 0;

            for (int j = 0; j < data.length; j++) {
                if (data[i] == data[j]) {
                    jumlahKemunculan++;
                }
            }
            if (jumlahKemunculan > 1) {
                boolean sudahDitampilkan = false;
                for (int k = 0; k < i; k++) {
                    if(data[k] == data[i]) {
                        sudahDitampilkan = true;
                        break;
                    }
                }
                if (!sudahDitampilkan) {
                    System.out.println(data[i]);
                }
            }
        }

    }
    
}
