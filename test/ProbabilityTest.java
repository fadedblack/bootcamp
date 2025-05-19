import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
    @Test
    void testTailsChance(){
        Probability probability = new Probability(2);
        assertEquals(0.5, probability.calculate(1.0));
    }

    @Test
    void testNoTailsChance(){
        Probability probability = new Probability(2);
        assertEquals(0.5,probability.notChance(0.5));
    }
}