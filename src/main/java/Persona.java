public enum Persona {
    WORKER(1), USUAL(0);

    private final int value;


    Persona(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
