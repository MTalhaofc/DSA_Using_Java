public class linearsearch1 {
    public static void main(String[] args) {
        


        int[] arr = {0,1,2,3,4,5,-6,12};
        int target = 12;

 int ans = linear(arr, target);
        System.out.println(ans);
    }


//
    static int linear(int[] array, int target){
if (array.length == 0){
    return -1;
}
for (int i = 0; i < array.length; i++) {
    int element = array[i];
if(element == target){
    return i;
}
}
 return 0;   }
}
