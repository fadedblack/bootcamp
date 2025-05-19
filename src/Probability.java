import java.util.Objects;

public class Probability {
    private final double chance;

    public Probability(double chance) {
        this.chance = chance;
    }

    public static Probability init(double chance) throws Exception {
        if (chance >= 0 && chance <= 1) {
            return new Probability(chance);
        }

        throw new Exception("Invalid Probability");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Probability that = (Probability) o;
        return Double.compare(chance, that.chance) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(chance);
    }

    public Probability complement() {
         return new Probability(1 - chance);
    }

    public Probability and(Probability probability) {
        double andChance = chance * probability.chance;

        return new Probability(andChance);
    }
}
