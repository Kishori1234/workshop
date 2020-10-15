import java.security.PublicKey;
import java.util.Scanner;

public class PalindromeClass {

    public static void main(String args[]){


        int i=0;
        String str1, str2;
        Scanner scan = new Scanner(System.in);
        str1 = scan.next();

        int len = str1.length() - 1;

        while (i<=len){
            if(str1.charAt(i)==str1.charAt(len)){
                System.out.println("Its Palindrome");
                i++;
                len--;

            }
            else{
                System.out.println("Not palindrome" + str1);
            }
            break;
        }

    }
}
