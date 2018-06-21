public class Thread3 implements Runnable {
    Thread thread;

    Thread3(String name) {
        thread = new Thread(this, name);
        thread.start();
    }

    @Override
    public void run() {
        thread.setPriority(Thread.MAX_PRIORITY);
        for (int k = 0; k < 50; k++)
            System.out.println("k from Third Thread: " + k);
    }
}
