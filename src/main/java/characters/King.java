package characters;

/**
 * King character with HP and Power ranging from 5 to 15 (5 + 0-10)
 */
public class King extends StrongWarrior {

    /**
     * Construct the King with default HP and Power from 5 to 15.
     */
    public King() {
        super(5, 10, 5, 10);
    }
}
