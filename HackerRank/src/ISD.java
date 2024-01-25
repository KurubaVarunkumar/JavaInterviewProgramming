import java.util.*;

public class ISD {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 4;
        double d = 4.0;
        String s = "Kodnest ";

        
        int inputI = scan.nextInt();

        
        double inputD = scan.nextDouble();

        // Consume the newline character left by nextDouble() to avoid issues with nextLine()
        scan.nextLine();

       
        String inputString = scan.nextLine();

        System.out.println(i + inputI);
        System.out.println(d + inputD);
        System.out.println(s + inputString);

        // Close the scanner to free resources
        scan.close();
    }
}
