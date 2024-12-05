import java.util.Scanner;

public class Exe2 {
    public static void main (String[] args) {
        
        System.out.println("Enter your information");

        System.out.print("Enter your full name: ");
        Scanner inputName = new Scanner (System.in);
        String fullName = inputName.nextLine();

        System.out.print("Enter your mobile number: ");
        Scanner inputNumber = new Scanner (System.in);
        String mobNum = inputNumber.nextLine();

        System.out.println("Find the area of the rectangle");

        System.out.print ("Enter the length: ");
        Scanner inputLength = new Scanner (System.in);
        double length = inputLength.nextDouble();

        System.out.print ("Enter the width: ");
        Scanner inputWidth = new Scanner (System.in);
        double width = inputWidth.nextDouble();

        double totalArea;

        totalArea = length * width;

        System.out.println("Your name is " + fullName);
        System.out.println("Your mobile number is " + mobNum);
        System.out.println("The are of the rectangle is " + totalArea);

    }
}
