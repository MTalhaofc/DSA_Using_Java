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

// class Solution {
//     public double myPow(double x, int n) {
        
//         if(n < 0){
//             n = -n;
//             x = 1 / x;
//         }
        
//         double pow = 1;
        
//         while(n != 0){
//             if((n & 1) != 0){
//                 pow *= x;
//             } 
                
//             x *= x;
//             n >>>= 1;
            
//         }
        
//         return pow;
//     }
// }
