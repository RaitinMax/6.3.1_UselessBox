public class User extends Thread {
    private final int TIME_TO_PUT_BUTTON = 5;
    private final int TIME_TO_WAIT = 1000;
    private final Toy toy;

    public User(Toy toy) {
        this.toy = toy;
    }

    @Override
    public void run() {
        System.out.format("%s has started \n", Thread.currentThread().getName());


        try {
            for (int i = 0; i < TIME_TO_PUT_BUTTON; i++) {
                System.out.println("\nUser has been opened the box");
                toy.setOpen();
                Thread.sleep(TIME_TO_WAIT);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            toy.interrupt();
        }
    }
}

