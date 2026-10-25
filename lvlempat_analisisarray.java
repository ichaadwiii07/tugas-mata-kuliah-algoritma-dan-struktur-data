public class lvlempat_analisisarray {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};
        System.out.println("Data awal:");

        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println();
        int[] dataAwal = data.clone();

        for(int i = 0; i < data.length; i++){
            data[i] = dataAwal[i] + dataAwal[data.length - 1 - i];
        }
        System.out.println("\nData setelah di proses:");

        for (int i=0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    
}
