package PackageTracker.States;

import PackageTracker.PackageTracker;

public class Delivered implements PackageState{
        private PackageTracker tracker;

        public Delivered(PackageTracker tracker) {
            this.tracker = tracker;
        }

        @Override
        public void handOver(Boolean accepted, String recipient) {
            if (accepted) {
                tracker.addHistory("Accepted by " + recipient);
                tracker.setState(new Finished());
            } else {
                tracker.addHistory("Rejected by " + recipient);
                tracker.addHistory("Package has been returned to sender");
                tracker.setState(new Processing(tracker));
            }
        }

        @Override
        public void printState() {
            System.out.println("Package has been received");
        }
}
