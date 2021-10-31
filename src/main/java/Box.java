public class Box extends Thread {

    private long CLOSINGTIME;   //ПОЧЕМУ НЕ МОЖЕТ БЫТЬ final ????

    private Switcher switcher;

    public Box(Switcher switcher) {
        this.switcher = switcher;
    }


    @Override
    public void run() {
        System.out.println("Коробка закрыта");
        while (!isInterrupted()) {
            if (!switcher.isclosed) {
                System.out.println("Коробка закрывается");
                switcher.close();
                try {
                    Thread.sleep(CLOSINGTIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Коробка закрыта");

            }
        }
    }
}
