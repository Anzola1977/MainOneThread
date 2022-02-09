import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sorted extends Thread {

    @Override
    public void run() {
        List<Integer> unsorted = new ArrayList<>();
        for (int i = 10000000; i >= 1; i--) {
            unsorted.add(i);
        }
        Collections.sort(unsorted);
        System.out.println("List is sorted now");
    }
}
