package characters;
// Character interface

/**
 * Interface which represents unit in game
 */
public interface Character{

    /**
     * Getter for hit points of unit.
     *
     * @return The hit points of unit.
     */
    int getHp();

    /**
     * Setter for hit points of unit.
     *
     * @param hp The hp to set to the unit.
     */
    void setHp(int hp);

    /**
     * Getter for the power of unit.
     *
     * @return The power of unit.
     */
    int getPower();

    /**
     * Setter fot the power of unit.
     *
     * @param power The power to be set to the unit.
     */
    void setPower(int power);

    /**
     * Does an action 'kick' against another Character
     *
     * @param other Charatcter the action 'kick' to be done
     */
    void kick(Character other);

    /**
     * Check if unit is alive
     *
     * @return True if hp > 0 else False.
     */
    boolean isAlive();

}
