package Transport;

public enum Capacity {
    N1(0,10),
    N2(10, 25),
    N3(25,50),
    N4(50,80),
    N5(80,120);

    private final int from;
    private final int to;

    Capacity(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public int getFrom() {

        return from;
    }

    public int getTo() {

        return to;
    }
}