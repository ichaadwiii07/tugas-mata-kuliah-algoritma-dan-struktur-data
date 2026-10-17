import java.util.Scanner;

public class tugaslevel4kedua {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int[] arr = {2, 4, 3, 5, 7, 8, 9};
        System.out.print("Masukkan target: ");
        int target = input.nextInt();

        System.out.println("Pasangan nilai:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j< arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                }
            }
        }
        input.close();
    }

    
}
