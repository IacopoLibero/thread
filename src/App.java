public class App {
    public static void main(String[] args) throws Exception {
        Corridore c1 = new Corridore("pippo");
        Corridore c2 = new Corridore("franco");
        Corridore c3 = new Corridore("berta");
        Corridore c4 = new Corridore("francantonio");
        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);
        Thread t4 = new Thread(c4);
        t1.start();
        Thread.sleep(200);
        t2.start();
        Thread.sleep(200);
        t3.start();
        Thread.sleep(200);
        t4.start();
        Thread.sleep(200);
    }
}
