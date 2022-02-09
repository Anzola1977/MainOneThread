import java.util.ArrayList;
import java.util.List;

public class Cleared extends Thread {

    @Override
    public void run() {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000000; i++) {
            list.add(i);
        }
        while (list.size() != 0) {
            list.remove(list.size() - 1);
        }
        System.out.println("List cleared");
    }
}
