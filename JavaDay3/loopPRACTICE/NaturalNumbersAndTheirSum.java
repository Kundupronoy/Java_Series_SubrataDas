package loopPRACTICE;

import java.util.Scanner;

public class NaturalNumbersAndTheirSum {



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print(" Enter The N Term : ");
        int n = sc.nextInt();

int sum = 0;

        for (int i = 1; i<= 1 ; i++) {



            for(int j = 1  ; j<=n ; j++){

                sum = sum + j;

                System.out.print(" "+j);

            }
            System.out.println();

            System.out.println("The Sum Of The Natural Numbers Are:"+" "+sum);

            
        }



        
    }
   

}
