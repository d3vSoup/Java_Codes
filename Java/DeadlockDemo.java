package Java;

class DeadlockDemo {

    static Object A = new Object();
    static Object B = new Object();

    static class Thread1 extends Thread {
        public void run() {
            synchronized (A) {
                System.out.println("Thread1 locked A");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (B) {
                    System.out.println("Thread1 locked B");
                }
            }
        }
    }

    static class Thread2 extends Thread {
        public void run() {
            synchronized (B) {
                System.out.println("Thread2 locked B");

                try { Thread.sleep(100); } catch (Exception e) {}

                synchronized (A) {
                    System.out.println("Thread2 locked A");
                }
            }
        }
    }

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }
}

