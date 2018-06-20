public class Thread2 extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("Second Thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int i = 0;
        while (i < 100)
            System.out.println("i from Second Thread: " + i++);
    }
}
