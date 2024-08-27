public class rotatedsorted {

    public static void main(String[] args) {
        int[] nums = {4,5,6,7,8,9,0,1,2};
        int target = 2;
    

// int ans = orderognosticsearch(nums, target, target, target, pivot);


int ans = search(nums, target);
System.out.println(ans);


    }

    static int search(int[] nums, int target){
        int pivot = findpivot(nums);


if(pivot == -1){
    return binarysearch(nums, target, 0, nums.length-1);
}
    
else if(nums[pivot] == target){

    return pivot;
}
else if( target >= nums[0]){
    return binarysearch(nums, target, 0, pivot -1);

}

    return binarysearch(nums, target, pivot +1, nums.length-1);



        
    }

    static int findpivot(int[] nums){
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
        
     }




        return start;
    }
    static int binarysearch(int[] nums,int target, int start, int end){


        while (start<=end){
            // int mid = (start + end)/2; // might be possible exceeds range of int
        int mid = start + (end-start) / 2;
        
        if(target < nums[mid]){
        end=mid-1;
        
        }
        else if(target > nums[mid]){
            start = mid+1;
        
        
        }   
        else{
        
            return mid;
        
        }
        }
        



        return -1;
    }
}