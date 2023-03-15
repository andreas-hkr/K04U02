import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Beräkna en cirkels omkrets (om inläst radie <= 0 --> felmeddelande)
        //   Omkrets = 2 * π * radie
        //   Area = π * radie * radie

        Scanner input = new Scanner(System.in);
        System.out.print("Ange radie: ");
        double radie = input.nextDouble();

        if (radie > 0) {
            double omkr = 2 * Math.PI * radie;
            double area = Math.PI * radie * radie;

            System.out.println("Cirkelns omkrets: " + omkr);
            System.out.println("Cirkelns area: " + area);
        } else {
            System.out.println("Oj, radien måste vara större än 0");
        }
    }
}