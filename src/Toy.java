public class Toy extends Thread {
    private volatile boolean isOpen;

    @Override
    public void run() {
        System.out.format("%s has started \n", Thread.currentThread().getName());
        while (!isInterrupted()) {
            if (isOpen) {
                isOpen = false;
                System.out.println("Toy has been closed the box");
            }
        }
    }

    public void setOpen() {
        isOpen = true;
    }
}
