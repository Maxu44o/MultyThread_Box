public class Main {
    public static void main(String[] args) throws InterruptedException {

        Switcher switcher = new Switcher();

        Thread box = new Box(switcher);
        box.start();

        Thread player = new Thread(() -> new User(switcher).play(), "Player 1");
        player.start();
        player.join();
        box.interrupt();
    }
}
