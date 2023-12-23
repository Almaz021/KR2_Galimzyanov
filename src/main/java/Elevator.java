public abstract class Elevator {
    Status status;
    int classification;
    int time;

    public Elevator(Status status, int classification) {
        this.status = status;
        this.classification = classification;
    }


    public void goTo(int wish) {}

}
