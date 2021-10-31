public class User {
    private final int ATTEMPTNUMBER = 5;
    private final long ATTEMPTTIME = 1000;
    private Switcher switcher;

    public User(Switcher switcher) {
        this.switcher = switcher;
    }

    public void play() {

        for (int i = 0; i < ATTEMPTNUMBER; i++) {
            System.out.println(Thread.currentThread().getName() + " открыл коробку");
            switcher.open();
            try {
                Thread.sleep(ATTEMPTTIME);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
