import java.util.Scanner;

public class tugaslevel1pertama {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan N: ");
        int n = input.nextInt();
 
        int total = 0;
        for (int i = 1; i <= n; i++) {
            total += i;
        }
        System.out.println("Sum = " + total);
 
        input.close();
    }
    
    
}
