import characters.Character;
import characters.Knight;

/**
 * Factory for creating Knight instances
 */
public class KnightFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Knight();
    }
}