import java.util.ArrayList;

public class Strings{
public static void main(String[] args) {
    
// String a = "Talha ";
// String b = "Talha";
// int c = 10;
// int d = 10       ;
// System.out.println(a);
// System.out.println(a == b);
// System.err.println(c == d);
// String check1 = new String("Talha");
// String check2 = new String("hi");

// System.out.println(check1 == check2);

// System.out.println(check1.equals(b));
// System.out.println(check1);



// float ab = 453.1294f;
// // System.out.printf("Formatted number is %.2f", ab);

// System.out.println(Math.PI);
// System.out.println();
// System.out.printf("Pie: %.4f" , Math.PI);


// System.out.println("a" + "b");
// System.out.println((char)('a' + 4));
// System.out.println("a" + 1);
// System.out.println(1 + "a"); 
// System.out.println("Talha" + new ArrayList<>());

String series = "";
for (int i = 0; i < 26; i++) {
    char ch = (char)('a' + i);
    System.out.println(ch);
    series = series + ch;

}
System.out.print(series);

}
}