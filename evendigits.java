public class evendigits {
    public static void main(String[] args) {
         int[] nums = {12,345,2,6,7896,6,34,22314,452,134235,-2,12354354,778564,234534422,76,223,55,6};

System.out.println(findNumbers(nums));

    }

    static int findNumbers(int[] nums) {
int count =0;
        for (int i = 0; i < nums.length; i++) {
        if(even(nums[i])){
            count++;
        }
        
        }
    return count;
}


static boolean even(int num){
int numofdigits = digits(num);
if (numofdigits % 2 == 0){
return true;

}

    return false;
}
static int digits(int num){
if(num<0){
    num = num *-1;
}
    return (int)(Math.log10(num)+1);
}

static int digits2(int num){
    if(num < 0){
        num = num * -1 ;
    }
    int count=0;
while (num >0) {
    count++;
    num = num/10;
    
}

    return count;
}
}
