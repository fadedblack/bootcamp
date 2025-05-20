import com.models.probability.Probability;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void testTailsChance() throws Exception {
        assertThrows(Exception.class, () -> Probability.init(1.2));
        assertThrows(Exception.class, () -> Probability.init(-1.2));

        assertInstanceOf(Probability.class, Probability.init(0.3));
    }

    @Test
    void testNoTailsChance() throws Exception {
        Probability tail = Probability.init(0.5);

        assertEquals(tail, tail.complement());
    }

    @Test
    void testAndChance() throws Exception {
        Probability coin1Tail = Probability.init(0.5);
        Probability coin2Tail = Probability.init(0.5);

        assertEquals(Probability.init(0.25), coin1Tail.and(coin2Tail));
    }

    @Test
    void testOrChance() throws Exception {
        Probability coin1Tail = Probability.init(0.5);
        Probability coin2Tail = Probability.init(0.5);

        assertEquals(Probability.init(0.75), coin1Tail.or(coin2Tail));
    }
}