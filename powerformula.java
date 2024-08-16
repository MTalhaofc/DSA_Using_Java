import java.util.Scanner;
public class powerformula{
    public static void main(String[]args)
    {
Scanner x = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = x.nextInt();
        System.out.println("Enter Power");
        int result = 1;
        int power = x.nextInt();
        for ( int i = 0; i<power; i++){
result = result * number;
        }

System.out.println("Result");
System.out.println(result);
    }
}
