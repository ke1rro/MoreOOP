package characters;

import lombok.Getter;
import lombok.Setter;

/**
 * Class responsible for managing character statistics (HP and Power).
 * This class encapsulates all the common stat management logic.
 */
@Getter
public class CharacterStats {
    private int hp;
    @Setter
    private int power;

    /**
     * Constructor with initial values
     *
     * @param hp    Initial hit points
     * @param power Initial power
     */
    public CharacterStats(int hp, int power) {
        this.hp = hp;
        this.power = power;
    }

    /**
     * Default constructor
     */
    public CharacterStats() {
        this.hp = 0;
        this.power = 0;
    }

    /**
     * Setter for hit points with validation
     * Ensures HP cannot be negative
     *
     * @param hp The hp to set
     */
    public void setHp(int hp) {
        this.hp = (hp < 0) ? 0 : hp;
    }

    /**
     * Check if character is alive based on HP
     *
     * @return True if hp > 0, false otherwise
     */
    public boolean isAlive() {
        return hp > 0;
    }

    /**
     * Reduce HP by damage amount
     *
     * @param damage Amount of damage to take
     */
    public void takeDamage(int damage) {
        setHp(hp - damage);
    }

    /**
     * Reduce power by amount
     *
     * @param amount Amount to reduce power by
     */
    public void reducePower(int amount) {
        setPower(power - amount);
    }
}