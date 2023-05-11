import PackageTracker.PackageTracker;

public class Main {
    public static void main(String[] args) {
        PackageTracker tracker = new PackageTracker();
        tracker.printState();
        tracker.handOver(true, "John Doe");
        tracker.printState();
        tracker.handOver(true, "ABC Logistics Inc.");
        tracker.printState();
        tracker.handOver(true, "Kim Lee");
        tracker.printState();
        tracker.handOver(false, "Kim Lee");
        // De volta para o Processing
        tracker.printState();
        tracker.handOver(true, "John Doe");
        tracker.printState();
        tracker.handOver(true, "ABC Logistics Inc.");
        tracker.printState();
        tracker.handOver(true, "Kim Lee");
        tracker.printState();
        tracker.handOver(true, "Kim Lee");
        tracker.printState();

        tracker.printHistory();
    }
}