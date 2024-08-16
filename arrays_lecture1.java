import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class arrays_lecture1 {

    public static void main(String[]args){



// String[][] twoarr={
//     {"1","2","3","4" },   
//     {"1","2" },   
//     {"1","2","3","4", }  


// };
Scanner input = new Scanner(System.in);

// String[][] twodarr = new String[3][3];

//  for(int i = 0;i<twodarr.length; i++){

// for(int j = 0; j<twodarr[i].length; j++)
// {
//     twodarr[i][j] = input.next();
// }

// }
// for(int i = 0;i<twodarr.length; i++){

//     for(int j = 0; j<twodarr[i].length; j++)
//     {
// System.out.print(twodarr[i][j] + " ");
//     }
//     System.out.println();
// }    

// for(int i = 0;i<twodarr.length; i++){

    
// System.out.println(Arrays.toString(twodarr[i]));
    
// }    

// for(String[] a : twodarr){
//     System.out.println(Arrays.toString(a));
// }

// int[][] arr ={
// {1,2,3,4},
// {5,6},
// {7,8,9,10,11}
// };
// for(int row =0; row<arr.length; row++){
//     for ( int col = 0; col<arr[row].length; col++){
//         System.out.print(arr[row][col] + " ");
//     }
//     System.out.println();
// }
// ArrayList<Integer> list = new ArrayList<>(10);
ArrayList<ArrayList<Integer>> twolist = new ArrayList<>();

for(int i =0; i<3; i++){
    twolist.add(new ArrayList<>());
}

for ( int j = 0; j < 3; j++) {
    for (int k = 0; k < 3; k++) {
        twolist.get(j).add(input.nextInt());
    }
}
System.out.println(twolist);

// list.add(67);
// list.add(67323);
// list.add(1627);
// list.add(567);
// list.add(7767);
// list.add(867);
// list.add(667);
// list.add(0067);


// System.out.println(list.contains(567));
// System.out.println(list.contains(07));
// System.out.println(list);

// list.set(0,1);
// list.remove(2);

// System.out.println(list);

// for(int i = 0; i<5; i++){
//     list.add(input.nextInt());
// }

// for(int i = 0; i<5; i++){
//     System.out.print(list.get(i));
// }
// System.out.println(list);

    }























// int[] nums ={ 1,2,3,4};
// System.out.println(Arrays.toString(nums));
// change(nums);



//     }


// static void change(int[]arr){
// arr[0]=99;
// }

// Syntax
//datatype[] variable_name = new datatype[size];
// int [] rollnos = new int[5];
//  OR
// int [] rollnos ={1,2,3,4,5}; 

// int[] ros; // Used for declaration
// ros = new int [5]; //-> Actuall memory is being created here.


// // System.out.println(ros[1]);

// String[] arr = new String[4];
// System.out.println(arr[0]);
// int[] arr = new int[5];
// arr[0] = 23;
// arr[1] = 45;
// arr[2] = 234;
// arr[3] = 323;
// arr[4] = 453;

// System.out.println(arr[3]);
//input using for loop

// for(int i = 0; i<arr.length; i++){
// arr[i] = input.nextInt();


// }


// for(int i = 0; i<arr.length; i++){
// System.out.print(arr[i]);    
    
//     }
    
// for(int num: arr){
//     System.out.print(num + "  "); //here num represent elements
// }



// String[] newarr = new String[4];
// for (int i = 0; i < newarr.length; i++) {
//     newarr[i] = input.next();
// }
// System.out.print(Arrays.toString(newarr));


// newarr[0] = "Talha";
// System.out.print(Arrays.toString(newarr));





    }
