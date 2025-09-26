import characters.Character;

/**
 * GameManager class for managing fights between characters
 */
public class GameManager {

    /**
     * Manages a fight between two characters until one dies
     *
     * @param c1 First character
     * @param c2 Second character
     */
    public void fight(Character c1, Character c2) {
        System.out.println("FIGHT BEGINS!");
        System.out.println(getCharacterInfo(c1, "Fighter 1"));
        System.out.println(getCharacterInfo(c2, "Fighter 2"));
        System.out.println("==================================================");

        int round = 1;

        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("\n--- Round " + round + " ---");

            if (c1.isAlive() && c2.isAlive()) {
                System.out.println(getCharacterName(c1) + " attacks " + getCharacterName(c2) + ":");
                c1.kick(c2);

                if (!c2.isAlive()) {
                    System.out.println(getCharacterName(c2) + " has been defeated!");
                    break;
                }
            }

            if (c1.isAlive() && c2.isAlive()) {
                System.out.println(getCharacterName(c2) + " attacks " + getCharacterName(c1) + ":");
                c2.kick(c1);

                if (!c1.isAlive()) {
                    System.out.println(getCharacterName(c1) + " has been defeated!");
                    break;
                }
            }

            if (c1.isAlive() && c2.isAlive()) {
                System.out.println("\nCurrent status:");
                System.out.println(getCharacterInfo(c1, getCharacterName(c1)));
                System.out.println(getCharacterInfo(c2, getCharacterName(c2)));
            }

            round++;
            if (round > 100) {
                System.out.println("🤝 Fight ended in a draw after 100 rounds!");
                return;
            }
        }

        if (c1.isAlive()) {
            System.out.println("\n" + getCharacterName(c1) + " WINS!");
        } else if (c2.isAlive()) {
            System.out.println("\n" + getCharacterName(c2) + " WINS!");
        }

        System.out.println("==================================================");
        System.out.println("Fight completed after " + (round - 1) + " rounds!");
    }

    /**
     * Gets character name from class name
     *
     * @param character Character instance
     * @return Character class name
     */
    private String getCharacterName(Character character) {
        return character.getClass().getSimpleName();
    }

    /**
     * Gets formatted character information
     *
     * @param character Character instance
     * @param label     Label for the character
     * @return Formatted string with character info
     */
    private String getCharacterInfo(Character character, String label) {
        return String.format("%s (%s): HP = %d, Power = %d",
                label,
                getCharacterName(character),
                character.getStats().getHp(),
                character.getStats().getPower());
    }
}