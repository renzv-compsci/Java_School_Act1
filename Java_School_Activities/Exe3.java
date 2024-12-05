import java.util.Scanner;

public class Exe3 {
    public static void main (String[] args) {

        System.out.println("13th Month Calculator");

        System.out.print("Enter your employee ID: ");
        Scanner inputId = new Scanner (System.in);
        String id = inputId.nextLine();

        System.out.print("Enter your position: ");
        Scanner inputPos = new Scanner (System.in);
        String pos = inputPos.nextLine();

        System.out.print("Enter your Basic Pay: ");
        Scanner inputPay = new Scanner (System.in);
        double pay = inputPay.nextDouble();

        System.out.print("Enter your month of service: ");
        Scanner inputMonth = new Scanner (System.in);
        double month = inputMonth.nextDouble();

        double totalPay;

        totalPay = pay * (month * 0.05);

        System.out.print("Your 13th month is: " + totalPay);


    }
}
