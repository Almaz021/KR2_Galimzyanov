public enum Status {
    FREE(0), BUSY(1);

    private final int value;


    Status(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
