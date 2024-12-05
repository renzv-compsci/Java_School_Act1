import java.util.Scanner;

public class Exe {
    public static void main (String[] args) {
        System.out.print("Enter a number: ");
        Scanner numberScan = new Scanner(System.in);

        double number = numberScan.nextDouble();

        System.out.print("Number: " + number);
    }
}