public class minimumnum {
    public static void main(String[] args) {
        
int[] arr = {546,2175,633,424,7546,593};
int minimumnum = arr[0];

System.out.println(minimumnum(arr,minimumnum));

    }

static int minimumnum(int[] arr , int min){
if (arr.length == 0) {
System.out.println("array is empty");
}
for (int i = 0; i < arr.length; i++) {
    if(min > arr[i]){
        min = arr[i];
        
    }
}
return min;
}

}
