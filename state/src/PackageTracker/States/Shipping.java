package PackageTracker.States;

import PackageTracker.PackageTracker;

public class Shipping implements PackageState{
        private PackageTracker tracker;

        public Shipping(PackageTracker tracker) {
            this.tracker = tracker;
        }

        @Override
        public void handOver(Boolean accepted, String recipient) {
            tracker.addHistory("Delivered to " + recipient);
            tracker.setState(new Delivered(tracker));
        }

        @Override
        public void printState() {
            System.out.println("Package will be delivered soon");
        }
}
