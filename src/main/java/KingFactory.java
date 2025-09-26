import characters.Character;
import characters.King;

/**
 * Factory for creating King instances
 */
public class KingFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new King();
    }
}