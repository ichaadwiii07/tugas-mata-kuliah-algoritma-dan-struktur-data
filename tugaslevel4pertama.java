import java.util.Scanner;

public class tugaslevel4pertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan N: ");
        int n = input.nextInt();

        int iterasiA = 0;
        for (int angka = 2; angka <= n; angka++) {
            for (int i =2; i <= angka - 1; i++) {
                iterasiA++;
                if (angka % i == 0) {
                    break;

                }
            }
        }

        int iterasiB = 0;
        for (int angka = 2; angka <= n; angka++) {
            boolean prima = true;
            for (int i =2; i * i <= angka; i++) {
                iterasiB++;
                if (angka % i == 0) {
                    prima = false;
                    break;
                }
                if (prima) {
                    System.out.print(angka + " ");
                }
            }
            System.out.println();
            System.out.println("Iterasi pendekatan n-1 : " + iterasiA);
            System.out.println("Iterasi pendekatan sqrt : " + iterasiB);

            input.close();
        }
    }

    
}
