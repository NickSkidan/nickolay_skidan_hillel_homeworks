public class MainThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("First Thread");
                for (int j = 0; j < 50; j++)
                    System.out.println("j from First Thread: " + j);
            }
        });
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread1.start();
        Thread2 thread2 = new Thread2();
        thread2.start();
        Thread3 thread3 = new Thread3("Third thread");
        System.out.println(thread3.thread.getName());
    }
}
