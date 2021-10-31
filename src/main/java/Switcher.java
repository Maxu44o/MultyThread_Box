public class Switcher {

    public volatile boolean isclosed = true;

    public void open() {
        isclosed = false;
    }

    public void close() {
        isclosed = true;
    }

}
