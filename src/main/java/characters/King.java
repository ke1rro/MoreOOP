package characters;
import java.util.Random;

import lombok.Getter;
import lombok.Setter;

@Getter
public class King implements Character{
    private int hp;
    @Setter
    private int power;
    private Random StatsGenerator = new Random();

    /**
     * Construct the King with default HP and Power from 5 to 15.
     */
    public King(){
        this.hp = 5 + StatsGenerator.nextInt(11);
        this.power = 5 + StatsGenerator.nextInt(11);
    }

    @Override
    public void setHp(int hp){
        this.hp = (hp < 0) ? 0 : hp;
    }

    @Override
    public boolean isAlive(){
        return hp > 0;
    }

    @Override
    public void kick(Character other){
        int damage = StatsGenerator.nextInt(hp + 1);

        other.setHp(other.getHp() - damage);

        System.out.println("King hits " + damage + " HP. Enemy now has " + other.getHp() + " HP.");
    }
}
