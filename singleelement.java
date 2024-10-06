import java.util.Arrays;

public class singleelement {
    public static void main(String[] args) {
        int[] nums = {3,3,7,7,10,11,11};
System.out.println(search(nums));
    }
    static int search(int[] nums){

int start = 0;
int end = nums.length-1;

if(nums[start] != nums[start+1]){
    return nums[start];
}

else if(nums[end] != nums[end-1]){
    return nums[end];
}
else{
while(start <=end){
    int mid = start + (end - start)/2;
if(nums[mid]!= nums[mid-1]&&nums[mid]!= nums[mid+1]){
    return nums[mid];
}
else if(((mid%2)==0 && nums[mid] == nums[mid+1]) ||
((mid%2)==1 && nums[mid] == nums[mid-1]))
{
start = mid + 1;
}
else {
    end = mid -1;
}
}

        return -1;
    }}
 }
