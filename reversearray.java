import java.util.Arrays;
import java.util.Scanner;

public class reversearray {
    public static void main(String[] args) {
        int [] array ={2,3,45,78,837,23032,9323};
        
        //By Using For loop Print 
        for (int i = array.length-1; i >= 0; i--) {

System.out.print(  +array[i]+ " " );
        }


//By Using While Loop
int start = 0;
int end = array.length-1;

while (start < end) {
    Swap(array, start, end);
    start ++;
    end --;
}
System.out.print( "By WHile Loop " + Arrays.toString(array));
}

static void Swap(int[] array,int index1, int index2){
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2]= temp;
        }

    }

