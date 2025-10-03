package characters;

import lombok.Getter;
import lombok.ToString;

public class Hobbit implements Character {
    @Getter
    private CharacterStats stats;

    public Hobbit() {
        this.stats = new CharacterStats(3, 0);
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

    public String toString() {
        return "Hobbit{" +
                "hp=" + stats.getHp() +
                ", power=" + stats.getPower() +
                '}';
    }

}
