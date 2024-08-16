
public class threeconsectiveodd{
public static void main(String[]args){

int checkodd = 0;

int arr[]  = {1,2,34,3,4,5,7,23,12};


for ( int i = 0; i<arr.length; i++){

    if (arr[i]%2 != 0){
        checkodd++;
        if (checkodd == 3){
            System.out.println("True");
        }
    }
    else{
        checkodd = 0;

    }
}

if(checkodd == 0){
    System.out.println("False");

}

}}