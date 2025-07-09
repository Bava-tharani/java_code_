class MyThread extends Thread {
    String message;

    MyThread(String message) {
        this.message = message;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(message);
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1 is running");
        MyThread t2 = new MyThread("Thread 2 is running");

        t1.start();
        t2.start();
    }
}
