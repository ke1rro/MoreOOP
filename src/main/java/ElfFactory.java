import characters.Character;
import characters.Elf;

/**
 * Factory for creating Elf instances
 */
public class ElfFactory extends CharacterFactory {

    @Override
    public Character createCharacter() {
        return new Elf();
    }
}