import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void testTailsChance() {
        assertThrows(Exception.class, () -> Probability.init(1.2));
        assertThrows(Exception.class, () -> Probability.init(-1.2));
    }

    @Test
    void testNoTailsChance() {
        try {
            Probability tail = Probability.init(0.5);
            assertEquals(tail, tail.complement());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    void testAndChance() {
        try {
            Probability coin1Tail = Probability.init(0.5);
            Probability coin2Tail = Probability.init(0.5);

            assertEquals(Probability.init(0.25), coin1Tail.and(coin2Tail));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}