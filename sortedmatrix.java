import java.util.Arrays;

public class sortedmatrix {
    public static void main(String[] args) {
        int[][] matirx2 ={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12},
            {13,14,15,16}
            
            
            }; 
            System.out.println(Arrays.toString(search(matirx2, 9)));
    }

static int[] binarysearch(int[][] matrix ,int row, int cstart, int cend, int target){
while (cstart <=cend) {
int mid = cstart + (cend - cstart)/2;
if(matrix[row][mid]== target){
    return new int[]{row,mid};
}
 
if(matrix[row][mid]< target){
cstart = mid +1;

}
else{
    cend = mid -11;

}
}

    return new int[] {-1,-1};
}

    static int[] search(int[][] matrix, int target ){
        int row=matrix.length;
        int col = matrix[0].length -1;
        int rstart = 0;
        int rend = row -1;
        int cmid = col/2;

if(row == 1){
return binarysearch(matrix, 0, 0, col-1, target);
}
//run the loop till 2 rows are remaining
while(rstart < (rend -1))
{
int mid = rstart +(rend - rstart)/2;
if(matrix[mid][cmid]== target){
    return new int[] {mid,cmid};
}
else if(matrix[mid][cmid]< target){
    rstart = mid;
}
else {
    rend = mid;
}
}
//now we will have 2 rows
///check wether the target is in middle col of 2 rows
if(matrix[rstart ][cmid]== target){
    return new int[]{rstart,cmid};
}
if(matrix[rstart +1][cmid]== target){
    return new int[]{rstart + 1,cmid};
}

//search in 1 half
if(target <= matrix[rstart][cmid -1] ){
return binarysearch(matrix, rstart, 0, cmid -1, target);
}
//search in 2 half
if(target >= matrix[rstart][cmid +1]  && target <= matrix[rstart][col -1]){
    return binarysearch(matrix, rstart, cmid +1, col -1, target);

}
//search in 3 half
if(target <= matrix[rstart + 1][cmid -1] ){
    return binarysearch(matrix, rstart +1, 0, cmid -1, target);

}
else {
    return binarysearch(matrix, rstart +1, cmid+1, cmid -1, target);

}



    }
}
