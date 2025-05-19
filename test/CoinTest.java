import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoinTest {
    @Test
    void testTailsChance(){
        assertEquals(0.5,Coin.getTails());
    }
}