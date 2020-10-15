import java.util.Scanner;

public class SecondClass {


    public static void main(String args[]) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter number");
        int num = scan.nextInt() ;
        if(num % 2 !=0){
            System.out.println("Weird");
        }
        else if(num % 2 == 0 ){
            if( num < 5 && num > 2){
                System.out.println("Its even, Its Not Weird");
            }
            if(num > 6 && num < 20 )
            {
                System.out.println("Its even and Weird");
            }
            if(num > 20){
                System.out.println("Not Weird ");
            }
        }

        else {
            System.out.println("Not Weird ");
        }
    }

}
