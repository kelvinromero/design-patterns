package PackageTracker.States;

import PackageTracker.PackageTracker;
public class Finished implements PackageState {

    public Finished() {
    }

    @Override
    public void handOver(Boolean accepted, String recipient) {
        System.out.println("Package has been received and signed by the recipient");
    }

    @Override
    public void printState() {
        System.out.println("Package has been received and signed by the recipient");
    }
}
