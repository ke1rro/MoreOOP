import org.reflections.Reflections;

import characters.Character;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

/**
 * Abstract factory for creating Character instances
 */
public abstract class CharacterFactory {

    /**
     * Factory method to create a character
     * @return Character instance
     */
    public abstract Character createCharacter();

    /**
     * Creates a random character instance using reflections to discover all Character implementations
     * @return Random Character instance
     */
    @SneakyThrows
    public static Character createRandomCharacter(){
        Reflections reflections = new Reflections("characters");
        Set<Class<? extends Character>> characterClasses = reflections.getSubTypesOf(Character.class);

        List<Class<? extends Character>> classList = new ArrayList<>(characterClasses);

        if (classList.isEmpty()) {
            throw new RuntimeException("No Character implementations found!");
        }

        Random random = new Random();
        Class<? extends Character> randomClass = classList.get(random.nextInt(classList.size()));

        return randomClass.getDeclaredConstructor().newInstance();

    }
}