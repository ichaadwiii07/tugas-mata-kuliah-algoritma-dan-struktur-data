import java.util.ArrayList;
import java.util.Scanner; 

public class SaldoArrayList {
    public static void main(String[] args) throws Exception {
        Scanner inputx = new Scanner(System.in);
        int balance = 2000000;
        ArrayList <Integer> transactions = new ArrayList <> ();
        int nav;
        int history = 0;
        System.out.println("\nPilih menu \n1. Penerikan \n2. Menyimpan \n3. Lihat saldo \n4. Total uang masuk \n5. Total uang keluar \n0. Exit");
        do {
            System.out.print("Pilih menu: ");
            nav = inputx.nextInt();
            if ((nav == 1 || nav == 2) && history == 5) {
                System.out.println("Data transaksi sudah penuh");
                continue;
            }
            if (nav == 0) break;
            if (nav == 1) {
                if (balance == 0) {
                    System.out.print("Saldo anda 0");
                    continue;
                }
                System.out.print("Jumlah yang di tarik: ");
                int amount = inputx.nextInt();
                if (amount > balance) {
                    System.out.println("Saldo anda kurang, hanya" + balance);
                    continue;
                }
                transactions.add(history++, -amount);
                balance -= amount;
            }else if (nav == 2){
                System.out.print("Jumlah yang di simpan: ");
                int amounts =inputx.nextInt();
                transactions.add(history++, amounts);
                balance += amounts;
            }else if (nav == 3){
                System.out.println("Saldo anda: "+ balance);
            }else if (nav == 4){
                int total =0;
                for (int x = 0; x<transactions.size();  x++){
                    if (transactions.get(x) < 0){
                        total += transactions.get(x);
                    }
                }
                System.out.println("Total uang masuk: "+ total);
            }else if (nav == 5){
                int total = 0;
                for (int x=0; x<transactions.size(); x++){
                    if (transactions.get(x) < 0){
                        total += transactions.get(x);
                    }
                }
                System.out.println("Total uang keluar: "+(total*-1));
            }
        }while(true);
        inputx.close();
        
    }
    
}
