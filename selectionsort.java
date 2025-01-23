import java.util.Arrays;

public class selectionsort{

    public static void main(String[] args) {
        int array[] = {3,4,6,1,2};
        int[] sol =  selection(array);
        System.out.println(Arrays.toString(sol));
    }
public static int[] selection(int[] arr){

    for (int i = 0; i < arr.length; i++) {
        //find max item in array swap with correct index
        int last = arr.length-i - 1;
        int max = getmaxindex(arr, 0 , last);

swap(arr, max, last);

    }

    return arr;
}

public static void  swap(int[] arr, int first, int second){
    int temp = arr[first];
    arr[first] = arr[second];
    arr[second] = temp;
}


private static int getmaxindex(int[] arr, int start, int end){
    int max = start;
    for (int i = start; i < end; i++) {
        if(arr[max] < arr[i]){
            max = i;
        }
    }
    return max;
}
}