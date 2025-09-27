import org.reflections.Reflections;

import characters.Character;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.Collections;
import java.util.stream.Collectors;

/**
 * Hybrid Factory
 * - Abstract factory for creating chaaracters using thier creators
 * - Dynamic factory for creating random characters using reflection
 */
public abstract class CharacterFactory {
    private static final Random CharacterSelector = new Random();
    private static final List<Class<? extends Character>> CHARACTER_CLASSES;

    static {
        Reflections reflections = new Reflections("characters");
        Set<Class<? extends Character>> characterClasses = reflections.getSubTypesOf(Character.class);
        CHARACTER_CLASSES = new ArrayList<>(characterClasses);

        CHARACTER_CLASSES.removeIf(clazz -> java.lang.reflect.Modifier.isAbstract(clazz.getModifiers()));

        if (CHARACTER_CLASSES.isEmpty()) {
            throw new RuntimeException("No concrete Character implementations found");
        }

        System.out.println("CharacterFactory initialized with " + CHARACTER_CLASSES.size() + " character types:");
        CHARACTER_CLASSES.forEach(clazz -> System.out.println("- " + clazz.getSimpleName()));
    }

    /**
     * Factory method to create a character
     *
     * @return Character instance
     */
    public abstract Character createCharacter();

    /**
     * Creates a random character instance using pre-cached character classes
     * This method is now much faster as it doesn't use reflection on each call
     *
     * @return Random Character instance
     */
    @SneakyThrows
    public static Character createRandomCharacter() {
        Collections.shuffle(CHARACTER_CLASSES);
        Class<? extends Character> randomClass = CHARACTER_CLASSES.get(
                CharacterSelector.nextInt(CHARACTER_CLASSES.size()));
        return randomClass.getDeclaredConstructor().newInstance();
    }

    /**
     * Get list of all available character class names
     *
     * @return List of character class simple names
     */
    public static List<String> getAvailableCharacterTypes() {
        return CHARACTER_CLASSES.stream()
                .map(Class::getSimpleName)
                .collect(Collectors.toList());
    }
}