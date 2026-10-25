public class lvlsatu_persediaanbarang {
    public static void main(String[] args) {
        System.out.println("\n===== SOAL 02: Persediaan Barang =====");
        int[] stock = {12, 8, 6};

        System.out.println("Stok produk pertama : " + stock[0]);
        System.out.println("Stok produk terakhir : " + stock[stock.length - 1]);

        stock[1] = 10;

        System.out.println("Stok setelah perubahan:");
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Produk " + (i +1) + ": " + stock[i]);
        }

        try{
            System.out.println(stock[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: indeks 4 tidak tersedia.");
            System.out.println("Alasan: array hanya memiliki indeks 0 sampai 3.");
        }
    }
    
}
