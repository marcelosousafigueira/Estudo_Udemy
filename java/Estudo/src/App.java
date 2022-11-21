public class App {
    public static void main(String[] args) {

        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());

        Thread t2 = new Thread(new ThreadExecuta());
        t2.start();
    }

}
