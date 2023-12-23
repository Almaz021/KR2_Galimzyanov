public class PersonalLift extends Elevator {
    public PersonalLift() {
        super(Status.FREE, 2);
    }

    public void goTo(int n) {
        System.out.println("Personal Lift went to " + n + " floor");
    }
}
