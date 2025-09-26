package characters;

public class Hobbit implements Character {
    private CharacterStats stats;

    public Hobbit() {
        this.stats = new CharacterStats(3, 0);
    }

    @Override
    public CharacterStats getStats() {
        return stats;
    }

    private void toCry() {
        System.out.println("Hobbit can not hit someone he is just crying...");
    }

    @Override
    public void kick(Character other) {
        toCry();
    }

    @Override
    public boolean isAlive() {
        return stats.isAlive();
    }

}
