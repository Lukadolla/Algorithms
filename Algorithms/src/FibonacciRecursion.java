public class FibonacciRecursion {

    public static int Fibonacci(int n) {

        if(n <= 2)
        {
            return 1;
        }

        else
        {
            return Fibonacci(n-1) + Fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        System.out.println(Fibonacci(9));
    }

}
