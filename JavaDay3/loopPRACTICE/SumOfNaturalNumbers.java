package loopPRACTICE;

// Write a program in C++ to find the sum of the first 10 natural numbers.
// Sample Output:
// Find the first 10 natural numbers:
// ---------------------------------------
// The natural numbers are:
// 1 2 3 4 5 6 7 8 9 10
// The sum of first 10 natural numbers: 55

public class SumOfNaturalNumbers {


    public static void main(String[] args) {
        int sum =0;
        for (int i = 1; i <= 10; i++) {
            sum = sum + i;
        }
        System.out.print("The Sum Of Natural Numbers  : "+sum+" ");
}
}
