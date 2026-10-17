import java.util.Scanner;

public class tugaslevel3pertama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukksan tinggi: ");
        int n  = input.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++); {
                System.out.print("*");
            }
            System.out.println();
        }
        
        input.close();
    }
        

    
}
