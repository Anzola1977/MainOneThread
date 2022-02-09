import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Numbers extends Thread {

    @Override
    public void run() {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            numbers.add(i);
        }
        int max = Collections.max(numbers);
        System.out.println("Max found: " + max);
    }
}
