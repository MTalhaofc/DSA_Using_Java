public class floydtriangle{
    public static void main(String[] args) {
        

        triangle(9);
// box(4);

    }

    static int triangle(int n){
        
int counter = 1;

for(int i = 1 ; i<=n;i++){

    for (int j = 1; j<=i; j++) {
        
        System.out.print(+counter + " ");
        counter++;
    }
     
    System.out.println();
}
return 0;    
}

static int box(int n){
for (int i = 0; i <=n; i++) {
    for (int j = 0; j<=n; j++) {
        if (j==0 || j==n){System.out.print("*");
    }
    }
    System.out.println();
}

    return 0;
     
}

}