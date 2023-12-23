public class EvenLift extends Elevator {

    public EvenLift() {
        super(Status.FREE, 0);
    }

    public void goTo(int n) {
        System.out.println("Even Lift went to " + n + " floor");
    }
}
