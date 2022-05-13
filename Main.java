import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Principal: ");
        Float princ = sc.nextFloat();
        
        System.out.print("Annual Interest Rate: ");
        float annual_rate = sc.nextFloat();
        
        System.out.print("Period (Years): ");
        int period = sc.nextInt();

        float monthly_rate = (annual_rate / 100) / 12;
        int months = period * 12;

        double mort = princ * ((monthly_rate * Math.pow((1 + monthly_rate), months)) / (Math.pow(1 + monthly_rate, months) - 1));
        
        System.out.printf("Mortgage: $%.2f", mort);
        System.out.println();

    }
}