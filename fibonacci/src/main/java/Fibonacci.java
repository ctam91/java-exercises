public class Fibonacci {

    /**
     * returns the value of the number in a fibonacci sequence at a given position
     * @param n the position of the number
     * @return value of the number
     */
    public static int findNthFibonacciNumber(int n){
        int sum = 0;
        int first = 0;
        int second = 1;

        for(int i = 2; i < n; i++ ){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }
}
