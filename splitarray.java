public class splitarray{
public static void main(String[] args) {
    int[] nums = {7,2,5,10,8};

}
static int findvalue(int nums[], int m){

   int start = 0;
   int end = 0;
   for (int i = 0; i < nums.length; i++) {
    start = Math.max(start,nums[i]);
    end += nums[i];
}
//binary search
while (start < end) {
    //try for mid as the potienta; answer
    int mid = start + (end - start)/2;
    //pieces in which we can divide it
    int sum = 0;
    int pieces = 1;
    for( int num: nums){
        if(sum + num > mid){
            sum = num;
            pieces++;
        }
        else{
            sum += num;
        }
    }
    
    if(pieces > m ){
    start = mid +1;}
    else{
        end = mid;
    }

}




    return end;
}
}