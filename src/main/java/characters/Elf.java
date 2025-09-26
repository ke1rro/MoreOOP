package characters;

public class Elf implements Character {
    private CharacterStats stats;

    public Elf() {
        this.stats = new CharacterStats(10, 10);
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
        if (stats.getPower() > other.getStats().getPower()) {
            other.getStats().setHp(0);
            System.out.println("Elf kills the enemy!");
        } else {
            other.getStats().reducePower(stats.getPower());
            System.out.println("Elf hit -" + stats.getPower() + " and decreased the enemy power to "
                    + other.getStats().getPower());
        }
    }
}
