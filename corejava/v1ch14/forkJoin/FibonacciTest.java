package v1ch14.forkJoin;
import java.util.concurrent.*;

public class FibonacciTest
{
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Fibonacci test = new Fibonacci(12);
        ForkJoinPool pool = new ForkJoinPool();
        pool.invoke(test);
        System.out.println(test.join());
    }
}

class Fibonacci extends RecursiveTask<Integer> {
    final int n;
    Fibonacci(int n) { this.n = n; }

    protected Integer compute() {
        if (n <= 1)
            return n;
        Fibonacci f1 = new Fibonacci(n - 1);
        Fibonacci f2 = new Fibonacci(n - 2);

        return f2.compute() + f1.compute();
    }
}