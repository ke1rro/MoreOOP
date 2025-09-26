package characters;

/**
 * Interface which represents unit in game.
 * Uses composition with CharacterStats for stat management.
 */
public interface Character {

    /**
     * Does an action 'kick' against another Character
     *
     * @param other Character the action 'kick' to be done against
     */
    void kick(Character other);

    /**
     * Check if unit is alive
     *
     * @return True if hp > 0 else False.
     */
    boolean isAlive();

    /**
     * Get the character's stats manager
     *
     * @return CharacterStats instance managing this character's stats
     */
    CharacterStats getStats();

}
