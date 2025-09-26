import characters.Character;
import characters.Hobbit;

/**
 * Factory for creating Hobbit instances
 */
public class HobbitFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Hobbit();
    }
}