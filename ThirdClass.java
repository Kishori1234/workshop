import java.util.Scanner;

public class ThirdClass {


    /*Problem Statement : Example 2: Making Calculator using the switch statement
     */

    public static void main (String args[]){


        Scanner scan= new Scanner(System.in);

        System.out.println("Enter Operator for which you want to perform activity : +, -, *, or /");
        char operator = scan.next().charAt(0);
        double number1 , number2, number3;

        System.out.println("Enter number1");
        number1=scan.nextInt();
        System.out.println("Enter number2");
        number2=scan.nextInt();

        switch (operator){

            case '+': number3= number1+number2;
                System.out.println("Addition of 2 number" + number3);
                break;

            case '-':number3=number1-number2;
                System.out.println("Subtration of 2 numbers" + number3);
                break;

            case '*':number3=number1*number2;
                System.out.println("Multiplication of 2 numbers" + number3);
                break;

            case '/':number3=number1/number2;
                System.out.println("divison of 2 numbers" + number3);
                break;

            default:
                System.out.println("Invalid Operator");
                break;

        }





    }
}
