package hw5.task1;

public class MyTimer {
    IAction action;

    public MyTimer(IAction action) {
        this.action = action;
    }

    public void start() {
        action.execute();
    }
}
