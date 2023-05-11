package PackageTracker.States;

import PackageTracker.PackageTracker;
public class Ready implements PackageState{
    private PackageTracker tracker;

    public Ready(PackageTracker tracker) {
        this.tracker = tracker;
    }

    @Override
    public void handOver(Boolean accepted, String recipient) {
        tracker.addHistory("Collected by " + recipient + ", on its way");
        tracker.setState(new Shipping(tracker));
    }

    @Override
    public void printState() {
        System.out.println("Package is ready to be shipped");
    }
}
