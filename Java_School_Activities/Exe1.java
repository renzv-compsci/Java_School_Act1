import java.util.Scanner;

public class Exe1 {
    public static void main (String[] args) {
        System.out.print("Enter the first number: ");
        Scanner inputNum1 = new Scanner(System.in);
        double num1 =  inputNum1.nextDouble();

        System.out.print("Enter the second numnber: " );
        Scanner inputNum2 = new Scanner(System.in);
        double num2 = inputNum2.nextDouble();

        System.out.print("Enter the third number: ");
        Scanner inputNum3 = new Scanner(System.in);
        double num3 = inputNum3.nextDouble();

        System.out.print("Enter the fourth number: ");
        Scanner inputNum4 = new Scanner(System.in);
        double num4 = inputNum4.nextDouble();

        System.out.print("Enter the fourth numner: ");
        Scanner inputNum5 = new Scanner (System.in);
        double num5 = inputNum5.nextDouble();

        double totalMulti;
        double totalSub;


        totalMulti = num1 * num2 * num3 * num4 * num5;
        totalSub = num1 - num2 - num3 - num4 - num5;

        System.out.println("Then answer to multiplication is " + totalMulti);
        System.out.println("The answer to subtraction is" + totalSub);

        
    }
}
    