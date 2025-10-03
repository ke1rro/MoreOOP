import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import characters.Character;
import characters.Knight;

public class KnightTest {
    private Character character;

    @BeforeEach
    public void init() {
        character = new Knight();
    }

    @Test
    public void testIsClass() {
        assertTrue(character instanceof Character);
    }

    @Test
    public void testHp() {
        assertTrue(character.getStats().getHp() >= 2 && character.getStats().getHp() <= 12);
    }

    @Test
    public void testPower() {
        assertTrue(character.getStats().getPower() >= 2 && character.getStats().getPower() <= 12);
    }
}