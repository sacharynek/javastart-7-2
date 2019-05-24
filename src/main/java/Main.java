public class Main {

    public static void main(String[] args) {
        whileCounter();
        doWhileCounter();
    }

    private static void whileCounter() {
        System.out.println("while Counter");
        double counter = 0;
        while (counter < 3.1) {
            System.out.format("%.1f \n", counter);
            counter += 0.1;
        }
    }

    private static void doWhileCounter() {
        System.out.println("do while counter");
        double counter = 0;
        do {
            System.out.format("%.1f \n", counter);
            counter += 0.1;
        } while (counter < 3.1);
    }
}
