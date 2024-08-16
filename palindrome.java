import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        
        int rev = 0;
        Scanner a = new Scanner(System.in);
        int  x = a.nextInt();
        int temp =x;
        while(x>0){
            int digit = x%10;
            System.out.println(digit);
            rev = (rev*10)+ digit;
            System.out.println(rev);
            x=x/10;
            System.out.println(x);
        }
        if(rev == x){
            System.out.println("True");
        }
        else{
            System.out.println("False");

        }

    }
}