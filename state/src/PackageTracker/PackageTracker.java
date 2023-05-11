package PackageTracker;

import PackageTracker.States.Processing;
import PackageTracker.States.PackageState;

import java.util.ArrayList;

public class PackageTracker {
    private PackageState state;
    private ArrayList<String> history = new ArrayList<>();

    public PackageTracker() {
        this.state = new Processing(this);
    }

    public void setState(PackageState state) {
        this.state = state;
    }

    public void addHistory(String event) {
        history.add(event);
    }

    public void handOver(Boolean accepted, String recipient) {
        state.handOver(accepted, recipient);
    }

    public void printState() {
        state.printState();
        sleep();
    }

    public void printHistory() {
        System.out.println("\nPackage history:");
        for (String event : history) {
            System.out.println(event);
        }
    }

    private void sleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
