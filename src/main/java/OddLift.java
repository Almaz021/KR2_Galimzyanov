public class OddLift extends Elevator {
    public OddLift() {
        super(Status.FREE, 1);
    }

    public void goTo(int n) {
        System.out.println("Odd Lift went to " + n + " floor");

    }
}
