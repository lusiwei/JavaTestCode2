package am;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable {
    @Override
    public String call() throws Exception {
        String sum = "";
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Callable<String> callable = new CallableDemo();
        FutureTask<String> task = new FutureTask<>(callable);
        new Thread(task).start();

        try {
            String s = task.get();
            System.out.println("通过call方法获得的返回值为：" + s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }
}
