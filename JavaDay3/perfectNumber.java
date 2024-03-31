public class perfectNumber {


    
    public static boolean  isperfect(int n ){
        int sum = 0;
        
        for(int i=1; i< n; i++){

         
            if(n%i==0){
                sum = sum + i;
            }
        }
       return sum == n ;
    }

        
    


    public static void main(String[] args) {
for (int i = 1; i < 500; i++) {

       if(isperfect(i)==true){

        System.out.println(i);

       }
        
    }
    
}}
