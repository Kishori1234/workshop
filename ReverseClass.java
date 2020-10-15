import java.util.Scanner;

public class ReverseClass {

    public static void main(String args[]) {


        String str1, str2;
        Scanner scan = new Scanner(System.in);
        str1 = scan.next();

        int len = str1.length() - 1;


        while (len >=0){
               System.out.print(str1.charAt(len));
               len --;
        }

        /*for (int i = len; i >= 0; i--) {
            System.out.print(str1.charAt(i));
        }*/

      /*
      Palindrome using for loop
       for (int i=0 ; i <=len;i--)
        {
            if(str1.charAt(i) == str1.charAt(len)){
                System.out.print(str1.charAt(i));
                System.out.println("Its palindrome ");

            }
            else{
                System.out.println("Not palindrome");

            }
        }*/


    }


}



