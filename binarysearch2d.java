import java.sql.Array;
import java.util.Arrays;

public class binarysearch2d{
    public static void main(String[]args){
int[][]matirx1={{7,9,1},{22,55,22},{13,46,74}};
int[][] matirx2 ={
{10,20,30,40},
{15,25,35,45},
{28,29,37,49},
{33,34,38,38,50}


}; 
int[][] matirx3 = {{1,3}};

// int[] ans = linearsearch(matirx1,99);
//    System.out.println(Arrays.toString(ans));

   int[] ans = binarysearch(matirx3,3);
   System.out.println(Arrays.toString(ans));
}


public static int[] binarysearch(int[][] matirx, int target ){


int row = 0;
int col = matirx.length-1;
while (row < matirx.length && col >=0) {
    if(matirx[row][col]==target){
        return new int[]{row,col};

    }
   else if(matirx[row][col]<target){
row++;
    } 
    else if(matirx[row][col]>target){
col--;
    }
}

return new int[]{-1,-1};

}






public static int[] linearsearch(int[][] matirx, int target ){

for (int i = 0; i < matirx.length; i++) {
    for (int j = 0; j < matirx[i].length; j++) {
        if(target==matirx[i][j]){
            return new int[]{i,j};
        }

    }
}



return new int[]{0,0};
}


}