public class Thread3 implements Runnable {
    Thread thread;

    Thread3(String name) {
        thread = new Thread(this);
        thread.setName(name);
        thread.start();
    }

    @Override
    public void run() {
        thread.setPriority(Thread.MAX_PRIORITY);
        int k = 0;
        while(k < 100)
        System.out.println("k from Third Thread: " + k++);
    }
}
