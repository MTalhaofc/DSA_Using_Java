import java.util.Arrays;

public class search2d {
    public static void main(String[] args) {
        int [][] arr = {{1,4,7},{2,5,8},{3,6,9}};
    int target = 8;
    int min = arr[0][0];
    int max = 0;
int[] ans = search(arr, target) ;
System.out.println(Arrays.toString(ans));
System.out.println(min(arr, max));
System.out.println(max(arr, min));



    // System.out.println(search(arr, target));
    }
static int[] search(int [][]arr,int target){

    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(target == arr[i][j]){
                return new int[]{i,j};
            }
        }
    }
    return new int[]{0};
}
static int min(int [][] arr, int min){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(min > arr[i][j]){
                min = arr[i][j];
            }
            
        }
}

return min;
}
static int max(int [][] arr, int max){
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[i].length; j++) {
            if(max < arr[i][j]){
                max = arr[i][j];
            }
            
        }
}

return max;
}

}
