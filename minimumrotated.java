public class minimumrotated {

    public static void main(String[] args) {
        int[] nums = {8,9,10,3,4,5,6,7};
//     int pivot = findpivot(nums);
//     // System.out.println(pivot);

// int start = 0;
// if(nums.length == 1){
//     System.out.print(nums[pivot]); }

//     else if(nums.length-1 == pivot){
//         System.out.println(nums[start]);
//     }
//     else{
//     if(nums[pivot]<nums[pivot+1]){
//         System.out.println(nums[start]);
//     }
//     else{
//         System.out.println(nums[pivot+1]);
//     }
//     }

int ans = findMin(nums);
System.out.println(ans);

    }



static int findpivot(int[] nums){


    int start = 0;
    int end = nums.length-1;
    while (start <=end) {

        int mid = start + (end - start)/2;
        if(mid < end &&  nums[mid] > nums[mid +1]){
            return mid;
        }
        else if ( mid > start && nums[mid] < nums[mid-1]){
            return mid-1;
        }
        else if(nums[start]>= nums[mid]){
            end = mid -1;
        }
        else {
            start = mid +1;
        }
    }

    return start;
}



// Easy Approach

    static int findMin(int[] nums) {
        int left = 0, right = nums.length - 1;
        while(left < right) {
            int mid = left + (right - left) / 2;

            if(nums[mid] < nums[right]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return nums[left];
    }
}