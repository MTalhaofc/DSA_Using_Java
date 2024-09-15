import java.lang.reflect.Array;
import java.util.Arrays;

public class twosumII {
 public static void main(String[] args) {
    
    int[] numbers = {2,7,11,15};
    int[] ans = twoSum(numbers, 9);
 System.out.println(Arrays.toString(ans));
}   
static int[] twoSum(int[] numbers, int target) {
    int start=0,end=numbers.length-1;
    while(start <=end)
    {
        if(numbers[start]+numbers[end] == target)
        {
            return new int[]{++start,++end};
        }
        if(numbers[start]+numbers[end] > target)
        {
            end-=1;
        }else{
            start+=1;
        }
    }

    return new int[]{};
    
}
}
