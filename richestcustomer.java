public class richestcustomer {

    public static void main(String[] args) {


       int[][] accounts = {{1,5},{7,3},{3,5}};
System.out.println(maximumWealth(accounts));


    }




    static int maximumWealth(int[][] accounts) {
       
int total = 0;
for (int i = 0; i < accounts.length; i++) {
int sum = 0;

    for (int j = 0; j < accounts[i].length; j++) {

        sum = sum + accounts[i][j];
    }
if(sum > total){
    total = sum;
}
}

        return total;

    }
}