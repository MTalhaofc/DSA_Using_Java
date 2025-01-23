public class sixthsem_cgpa{
    public static void main(String[] args) {
        double[] values = {
            2.73, 2.93, 2.68, 2.73, 2.99, 3.33, 3.57, 3.44, 2.26, 2.31, 3.96, 2.52, 
            3.75, 2.1, 2.8, 3.66, 2.59, 2.73, 3.1, 2.25, 2.8, 3.13, 3.26, 3.63, 2.94, 
            3.36, 2.54, 3.63, 1.82, 2.84, 2.94, 2.83, 3.04, 2.41, 3.73, 2.77, 3.82, 
            3.28, 3.53, 3.87, 3.05, 2.9, 2.85, 2.89, 2.57, 3.17, 3.09, 2.82, 2.33, 
            3.43, 2.81, 3.58, 3.51, 2.85, 3.29, 2.87, 3.08, 3.18, 2.68, 3.42, 2.76, 
            3.71, 3.8, 2.34, 3.11, 2.42, 3.48, 2.97, 2.99, 2.77, 2.94, 3.59, 2.17, 
            3.62, 3.59, 2.01, 2.23, 3.24, 2.94, 2.33, 3.8, 3.95, 3.55, 1.94, 3.92, 
            1.97, 2.95, 2.06, 2.45, 2.57, 3.0, 2.73, 2.15, 2.61, 3.28, 2.49, 2.46, 
            3.03, 3.14, 2.8, 1.97, 2.76, 3.92, 2.29, 2.36, 3.13, 2.66, 2.67, 2.87, 
            3.71, 2.52, 2.66, 2.38, 3.1, 2.58, 2.6, 3.31, 2.91, 2.82, 3.3, 3.07, 
            2.88, 3.5, 3.85, 2.19, 3.38, 3.24, 3.52, 1.78};

            double arr_length = values.length;
            int abovethreeandhalf = 0; // >3.5
        

        
        int abovethreeandbelowhalf = 0; // >3   <3.5
        int above2andbelow3 = 0;   // >2.5 and <3
        int above2belowhalf = 0; // >2 and < 2.5
        int below2 = 0;  // <2
        double dummyval1  = 0;
        




        for (int i = 0; i < arr_length; i++) {
           
            if(values[i] >= 3.50 && values[i] < 4.00){
                abovethreeandhalf++;
            }
          
          if(values[i] >= 3.00 && values[i] < 3.50){
                abovethreeandbelowhalf++;
            }
            if(values[i] >= 2.50 && values[i] < 3.00){
                above2andbelow3++;
            }
           
            if(values[i] >= 2.00 && values[i] < 2.50){
                above2belowhalf++;
            }
           if(values[i] < 2.00){
                below2++;
            }
           

        }

int totalvalues = abovethreeandhalf + abovethreeandbelowhalf + above2andbelow3 + above2belowhalf + below2;


System.out.println("Total Value is :");
System.out.println(arr_length); 

System.out.println("Students above 3.5 :");
System.out.println(abovethreeandhalf); 

System.out.println("Students above 3 but below 3.5 :");
System.out.println(abovethreeandbelowhalf); 

System.out.println("Students above 2.5 but below 3 :");
System.out.println(above2andbelow3); 

System.out.println("Students above 2 but below 2.5 :");
System.out.println(above2belowhalf); 

System.out.println("Students below 2 :");
System.out.println(below2); 


System.out.println("Error Value :");
System.out.println(dummyval1); 


System.out.println("Sum of all Values :");
System.out.println(totalvalues); 

    }

}