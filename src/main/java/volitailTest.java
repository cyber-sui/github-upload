public class volitailTest implements testAcc {
    static boolean a = false;
    static int b = 3;
    static int c = 3;
    static int d = 3;
    static int e = 3;
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            while (!a) {
                b = 4;
                c = 4;
                d = 4;
                e = 4;
            }
        }).start();

        Thread.sleep(1000);
        System.out.println("1");
        a = true;
        b = 4;
        c = 4;
        d = 4;
        e = 4;
    }

    @Override
    public int hasHaha() {
        return 0;
    }
}
