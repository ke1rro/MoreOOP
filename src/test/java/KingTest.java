import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import characters.Character;
import characters.King;

public class KingTest {
    private Character character;

    @BeforeEach
    public void init() { character = new King(); }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getStats().getHp() >= 5 && character.getStats().getHp() <= 15);
    }

    @Test
    public void testPower() {
        assertTrue(character.getStats().getPower() >= 5 && character.getStats().getPower() <= 15);
    }
}