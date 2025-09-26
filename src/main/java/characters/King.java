package characters;

import java.util.Random;

public class King implements Character {
    private CharacterStats stats;
    private Random StatsGenerator = new Random();

    /**
     * Construct the King with default HP and Power from 5 to 15.
     */
    public King() {
        int hp = 5 + StatsGenerator.nextInt(11);
        int power = 5 + StatsGenerator.nextInt(11);
        this.stats = new CharacterStats(hp, power);
    }

    @Override
    public CharacterStats getStats() {
        return stats;
    }

    @Override
    public boolean isAlive() {
        return stats.isAlive();
    }

    @Override
    public void kick(Character other) {
        int damage = StatsGenerator.nextInt(stats.getHp() + 1);

        other.getStats().takeDamage(damage);

        System.out.println("King hits " + damage + " HP. Enemy now has " + other.getStats().getHp() + " HP.");
    }
}
