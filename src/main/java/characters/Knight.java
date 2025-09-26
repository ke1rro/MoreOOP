package characters;

import java.util.Random;

public class Knight implements Character {
    private CharacterStats stats;
    private Random StatsGenerator = new Random();

    /**
     * Construct the Knight with default HP and Power from 2 to 12.
     */
    public Knight() {
        int hp = 2 + StatsGenerator.nextInt(10);
        int power = 2 + StatsGenerator.nextInt(10);
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
        System.out.println("Knight hits -" + damage + " HP. Enemy now has " + other.getStats().getHp() + " HP.");
    }

}
