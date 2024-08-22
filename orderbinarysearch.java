public class orderbinarysearch {
    public static void main(String[] args) {
        int arr[] = { -18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int arr3[] = {15,12,9,6,3};
        int arr2[] ={3,6,9,12,15};
int target =11;
int ans = binarysearch(arr2, target);
System.out.println(ans);
    }

    static int binarysearch(int[] arr, int target){

        int start = 0;
        int end = arr.length-1;
        
boolean isAsc = arr[start] < arr[end];


        while (start<=end){
            // int mid = (start + end)/2; // might be possible exceeds range of int
        int mid = start + (end-start) / 2;
        
if(arr[mid] == target){
    return mid;
}
if(isAsc){
    if(target < arr[mid]){
        end=mid-1;
        
        }
        else {
            start = mid+1;
        
        
        }   
}
else{
    if(target > arr[mid]){
        end=mid-1;
        
        }
        else {
            start = mid+1;
        
        
        } 
}
        
        
        }
        
        return arr[start];
            }
}
