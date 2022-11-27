public class App {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        Thread t2 = new Thread(new ThreadExecuta());
        t2.start();
        t2.join();

        Thread t3 = new Thread(new ThreadExecuta());
        t3.start();
        t3.join();

        Thread t4 = new Thread(() -> System.out.println("canal"));
        t4.start();
    }

}
