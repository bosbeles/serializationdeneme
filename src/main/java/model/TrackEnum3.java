package model;

public enum TrackEnum3 {
    A(0), B(1), C(2), D(3), E(4), F(5);

    private int value;

    TrackEnum3(int arg) {
        this.value = arg;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
