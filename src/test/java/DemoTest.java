import org.junit.jupiter.api.Test;
import characters.CharacterStats;
import characters.Elf;
import characters.Hobbit;
import characters.King;
import characters.Knight;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {

    @Test
    void characterStatsTest() {
        CharacterStats stats = new CharacterStats(10, 5);
        assertEquals(10, stats.getHp());
        assertEquals(5, stats.getPower());
        assertTrue(stats.isAlive());
    }

    @Test
    void characterStatsSetHpTest() {
        CharacterStats stats = new CharacterStats(10, 5);
        stats.setHp(-5);
        assertEquals(0, stats.getHp());
        assertFalse(stats.isAlive());
    }

    @Test
    void elfCreationTest() {
        Elf elf = new Elf();
        assertNotNull(elf.getStats());
        assertEquals(10, elf.getStats().getHp());
        assertEquals(10, elf.getStats().getPower());
        assertTrue(elf.isAlive());
    }

    @Test
    void hobbitCreationTest() {
        Hobbit hobbit = new Hobbit();
        assertNotNull(hobbit.getStats());
        assertEquals(3, hobbit.getStats().getHp());
        assertEquals(0, hobbit.getStats().getPower());
        assertTrue(hobbit.isAlive());
    }

    @Test
    void knightCreationTest() {
        Knight knight = new Knight();
        assertNotNull(knight.getStats());
        assertTrue(knight.getStats().getHp() >= 2);
        assertTrue(knight.getStats().getHp() <= 11);
        assertTrue(knight.isAlive());
    }

    @Test
    void kingCreationTest() {
        King king = new King();
        assertNotNull(king.getStats());
        assertTrue(king.getStats().getHp() >= 5);
        assertTrue(king.getStats().getHp() <= 15);
        assertTrue(king.isAlive());
    }

    @Test
    void factoryCreatesCharactersTest() {
        KnightFactory knightFactory = new KnightFactory();
        ElfFactory elfFactory = new ElfFactory();

        characters.Character knight = knightFactory.createCharacter();
        characters.Character elf = elfFactory.createCharacter();

        assertNotNull(knight);
        assertNotNull(elf);
        assertTrue(knight instanceof Knight);
        assertTrue(elf instanceof Elf);
    }

    @Test
    void randomCharacterFactoryTest() {
        characters.Character char1 = CharacterFactory.createRandomCharacter();
        characters.Character char2 = CharacterFactory.createRandomCharacter();

        assertNotNull(char1);
        assertNotNull(char2);
        assertTrue(char1.isAlive());
        assertTrue(char2.isAlive());
    }

    @Test
    void characterKickTest() {
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        elf.kick(hobbit);
        assertFalse(hobbit.isAlive());
        assertEquals(0, hobbit.getStats().getHp());
    }
}