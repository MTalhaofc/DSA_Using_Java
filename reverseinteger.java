import java.util.Scanner;

public class reverseinteger {
    public static void main(String[] args) {
        
        Scanner a = new Scanner(System.in);
int x = a.nextInt();

int temp = x;
int rev = 0;



while (x> 0 || x < 0) {

    int digit = x %10;
    if ( rev > Integer.MAX_VALUE/10 ||  rev < Integer.MIN_VALUE/10){

//return 0;

    rev = (rev * 10) + digit ;
    x = x/10;
}



System.out.println(rev);


    }
}
}