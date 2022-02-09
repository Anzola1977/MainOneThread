public class MainOneThread extends Thread {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Numbers numbers = new Numbers();
        numbers.start();
        try {
            numbers.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Sorted sorted = new Sorted();
        sorted.start();
        try {
            sorted.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Cleared cleared = new Cleared();
        cleared.start();
        try {
            cleared.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Total time: " + (end - start) + " ms");
    }

}
