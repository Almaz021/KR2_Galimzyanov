public class CrowdedException extends Exception {
    public CrowdedException() {
        super("All available lifts are busy!");
    }
}
