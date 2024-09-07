public class rotationcount{
    public static void main(String[] args) {
        int[] nums ={3,4,5,6,7,0,1,2};

int pivot = findmax(nums);
int total = pivot + 1;
System.out.println( total);
       

    }
    
    static int findmax(int[] nums){
        int start = 0;
        int end = nums.length-1;

     while (start < end) {
        int mid = start + (end - start)/2;
        if( mid< end &&     nums[mid]> nums[mid +1]){
            return mid;
        }
        if( mid > start &&     nums[mid]< nums[mid -1]){
            return mid -1;
        }
        else if (nums[start] >= nums[mid]) {
            end = mid -1;
        }
        else{
            start = mid + 1;
        }
        //if elements at middle,start,end are equal skip the duplicate
        if(nums[mid] == nums[start] && nums[mid]==nums[end]){

if(nums[start]>nums[start+1] ){
    return start;
}

            start++;

            if(nums[end - 1 ]>nums [end ] ){
                return end -1;
            } 
            end--;
        }
else if(nums[start]<nums[mid] || (nums[start]== nums[mid] && nums[mid] > nums[end] ))
{
    start = mid +1;
}
else {
    end = mid -1;
}

     }




        return -1;
    }

}