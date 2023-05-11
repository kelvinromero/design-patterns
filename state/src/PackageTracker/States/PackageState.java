package PackageTracker.States;

public interface PackageState {
    public void handOver(Boolean accepted, String recipient);

    public void printState();
}
