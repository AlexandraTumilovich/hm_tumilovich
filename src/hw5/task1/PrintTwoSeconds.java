package hw5.task1;

public class PrintTwoSeconds implements IAction {
    @Override
    public void execute() {
        while (true) {
            try {
                Thread.sleep(2 * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("2 seconds have passed!");
        }
    }
}
