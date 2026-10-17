import java.util.Scanner;

public class tugaslevel2kedua {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Masukkan bilangan: ");
        int n = input.nextInt();
 
        boolean prima = n >= 2; 
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                prima = false;
                break;
            }
        }
 
        if (prima) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
 
        input.close();
    
}
}
