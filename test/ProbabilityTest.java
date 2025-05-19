import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void testTailsChance() {
        assertThrows(Exception.class, () -> Probability.init(1.2));
    }

    @Test
    void testNoTailsChance() {
        Probability probability = new Probability(0.5);

        assertEquals(probability, probability.complement());
    }

    @Test
    void testAndChance() {
        Probability probability1 = new Probability(0.5);
        Probability probability2 = new Probability(0.5);

        assertEquals(new Probability(0.25), probability1.and(probability2));
    }
}