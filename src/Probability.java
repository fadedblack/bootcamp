public class Probability {
    private final int totalNoEvents;

    public Probability(int totalNoEvents) {
        this.totalNoEvents = totalNoEvents;
    }

    public double calculate(double possibility) {
        return possibility / totalNoEvents;
    }

    public double notChance(double probability) {
        return 1 - probability;
    }
}
