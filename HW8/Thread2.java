public class Thread2 extends Thread implements Runnable {
    @Override
    public void run() {
        System.out.println("Second Thread");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 50; i++)
            System.out.println("i from Second Thread: " + i);
    }
}
