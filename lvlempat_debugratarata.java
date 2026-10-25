public class lvlempat_debugratarata {
    public static void main(String[] args) {
        int[] scores = {80, 70, 90, 60};
        int total = 0;

        for (int i = 0; i < scores.length; i++ ) {
            total += scores[i];
        }
        double average = (double) total / scores.length;

        System.out.println("Total =" + total);
        System.out.println("Rata-rata =" +average);
    }
    
}
