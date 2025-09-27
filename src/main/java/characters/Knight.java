package characters;

/**
 * Knight character with HP and Power ranging from 2 to 12 (2 + 0-10)
 */
public class Knight extends StrongWarrior {

    /**
     * Construct the Knight with default HP and Power from 2 to 12.
     */
    public Knight() {
        super(2, 10, 2, 10);
    }
}
