import java.util.Scanner;

public class twosum{
   
    public static void main(String[]args){


int[] numarray = {3,3};
Scanner a=new Scanner(System.in);
int target = a.nextInt();
System.out.println(target);

for( int i = 0; i<numarray.length; i++){
    
    for ( int j = i+1; j<numarray.length;j++){
      if(numarray[i]+numarray[j] == target){
        System.out.print(numarray[i]);
        System.out.print("+");
        System.out.print(numarray[j]);
        System.out.print("=");
        System.out.print(target);


System.out.println("Yes");


      }

else{
    System.out.print(numarray[i]);
    System.out.print("+");
    System.out.print(numarray[j]);
    System.out.print("!=");
    System.out.print(target);

    System.out.println("no");
}
    }
}

    }
}
