package PackageTracker.States;

import PackageTracker.PackageTracker;

public class Processing implements PackageState {
    private final PackageTracker tracker;

    public Processing(PackageTracker tracker) {
        this.tracker = tracker;
    }


    public void handOver(Boolean accepted, String recipient) {
        tracker.addHistory("Approved by " + recipient + ", ready to be shipped");
        tracker.setState(new Ready(tracker));
    }

    @Override
    public void printState() {
        System.out.println("Package is being processed.");
    }
}
