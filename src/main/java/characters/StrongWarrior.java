package characters;

import java.util.Random;

import lombok.Getter;

/**
 * Abstract base class for warrior-type characters with random stats and similar
 * attack patterns
 */
public abstract class StrongWarrior implements Character {
    @Getter
    protected CharacterStats stats;
    protected Random statsGenerator = new Random();

    /**
     * Constructor that initializes random stats within specified ranges
     *
     * @param minHp         Minimum HP value
     * @param maxHpRange    Maximum additional HP (final HP = minHp + random(0,
     *                      maxHpRange))
     * @param minPower      Minimum Power value
     * @param maxPowerRange Maximum additional Power (final Power = minPower +
     *                      random(0, maxPowerRange))
     */
    protected StrongWarrior(int minHp, int maxHpRange, int minPower, int maxPowerRange) {
        int hp = minHp + statsGenerator.nextInt(maxHpRange + 1);
        int power = minPower + statsGenerator.nextInt(maxPowerRange + 1);
        this.stats = new CharacterStats(hp, power);
    }

    @Override
    public boolean isAlive() {
        return stats.isAlive();
    }

    @Override
    public void kick(Character other) {
        int damage = statsGenerator.nextInt(stats.getHp() + 1);
        other.getStats().takeDamage(damage);

        String characterName = this.getClass().getSimpleName();
        System.out
                .println(characterName + " hits " + damage + " HP. Enemy now has " + other.getStats().getHp() + " HP.");
    }
}